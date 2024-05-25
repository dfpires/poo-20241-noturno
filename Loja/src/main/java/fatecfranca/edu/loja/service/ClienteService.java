package fatecfranca.edu.loja.service;

import fatecfranca.edu.loja.model.dto.ClienteDTO;
import fatecfranca.edu.loja.model.entity.ClienteEntity;
import fatecfranca.edu.loja.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    // injeção de dependência
    @Autowired
    ClienteRepository injecao;
    // 3 e 4
    public ClienteDTO insere(ClienteDTO clienteDTO){
        ClienteEntity clienteEntity = converteDTO(clienteDTO);
        // o ClienteEntity retornado pelo método save foi convertido em DTO
        return converteEntity(injecao.save(clienteEntity));
    }
    // consulta e trazer uma lista de clientes cadastrados no banco de dados
    public List<ClienteDTO> consultaTodos(){
        // precisamos converter uma lista de ClienteEntity em outra lista
        // de ClienteDTO
        return converteEntities(injecao.findAll());
    }
    // recupera um cliente a partir de um id
    public ClienteDTO consultaPorId(Long id){
        Optional<ClienteEntity> cliente = injecao.findById(id);
        // verifica se tem cliente na resposta
        if (cliente.isPresent()){
            return converteEntity(cliente.get()); // retorna o clienteEntity encontrado
        }
        return null; // informa que não encontrou
    }
    // remove um cliente por id
    public String remove(Long id){
        if (injecao.existsById(id)){
            injecao.deleteById(id);
            return "Remoção com sucesso";
        }
        else {
            return "Cliente não encontrado para remoção";
        }
    }

    // tornar todos os clientes não devedores (perdoar as dívidas)
    // retornar todos os clientes sem estar devendo - List
    public List<ClienteDTO> tiraDebito(){
        // recupera todos os clientes do banco
        List<ClienteEntity> clientes = injecao.findAll();
        // altera cada cliente, colocando false na variável devedor
        for(ClienteEntity obj: clientes){
            // alterar o id do obj
            if (obj.isDevedor()){
                obj.setDevedor(false);
                // salva o objeto alterado no banco de dados
                injecao.save(obj);
            }
        }
        return converteEntities(clientes);
    }

    // atualiza um cliente a partir de um id informado
    public ClienteDTO atualizaPorId(Long id, ClienteDTO clienteDTO){
        if (injecao.existsById(id)){ // cliente existe
            clienteDTO.setId(id); // adiciona o id no cliente
            // converte para Entity e atualiza no banco de dados
            ClienteEntity aux = injecao.save(converteDTO(clienteDTO));
            return converteEntity(aux); // converte para DTO
        }
        else {
            return null;
        }
    }

    // converte uma lista de ClienteEntity em outra lista de ClienteDTO
    public List<ClienteDTO> converteEntities(List<ClienteEntity> listaEntities){
        // cria uma lista que vai guardar os ClienteDTOs
        List<ClienteDTO> listaDTOs = new ArrayList<ClienteDTO>();
        // percorre a lista de ClienteEntity
        for(ClienteEntity objEntity : listaEntities){
            // objEntity represente uma entity da lista
            // converte a entity em dto e adiciona na lista de DTOs
            listaDTOs.add(converteEntity(objEntity));
        }
        return listaDTOs;
    }

    // converte ClienteDTO em ClienteEntity => para enviar ao BD
    public ClienteEntity converteDTO(ClienteDTO clienteDTO){
        return new ClienteEntity(clienteDTO.getId(),
                clienteDTO.getNome(), clienteDTO.getNota(), clienteDTO.getIdade(),
                clienteDTO.isDevedor());
    }
    // converte ClienteEntity em ClienteDTO => para enviar ao frontend
    public ClienteDTO converteEntity (ClienteEntity clienteEntity){
        return new ClienteDTO(clienteEntity.getId(),
                clienteEntity.getNome(), clienteEntity.getNota(),
                clienteEntity.getIdade(), clienteEntity.isDevedor());
    }
}
