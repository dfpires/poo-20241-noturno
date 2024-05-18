package fatecfranca.edu.loja.controller;
import fatecfranca.edu.loja.model.dto.ClienteDTO;
import fatecfranca.edu.loja.model.entity.ClienteEntity;
import fatecfranca.edu.loja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // responde pelas requisições rest
@RequestMapping("/cliente") // no endpoint /cliente
public class ClienteController {

    @Autowired
    ClienteService injecao;
    @PostMapping // 2 e 5
    public ClienteDTO insere(@RequestBody ClienteDTO clienteDTO){
       return injecao.insere(clienteDTO);

    }
    @GetMapping
    public List<ClienteDTO> consultaTodos(){
        return injecao.consultaTodos();
    }

    @GetMapping("/{id}")
    public ClienteDTO consultaPorId(@PathVariable Long id){
        return injecao.consultaPorId(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable Long id){
        return injecao.remove(id);
    }
}
