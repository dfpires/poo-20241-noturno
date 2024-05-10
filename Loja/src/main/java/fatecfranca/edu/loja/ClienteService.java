package fatecfranca.edu.loja;

import fatecfranca.edu.loja.model.entity.ClienteEntity;
import fatecfranca.edu.loja.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    // injeção de dependência
    @Autowired
    ClienteRepository injecao;
    public ClienteEntity insere(ClienteEntity cliente){
        return injecao.save(cliente);
    }
}
