package fatecfranca.edu.loja.controller;
import fatecfranca.edu.loja.model.dto.ClienteDTO;
import fatecfranca.edu.loja.model.entity.ClienteEntity;
import fatecfranca.edu.loja.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // responde pelas requisições rest
@RequestMapping("/cliente") // no endpoint /cliente
public class ClienteController {

    @Autowired
    ClienteService injecao;
    @PostMapping // 2 e 5
    public ClienteDTO insere(@RequestBody ClienteDTO clienteDTO){
       return injecao.insere(clienteDTO);

    }
}
