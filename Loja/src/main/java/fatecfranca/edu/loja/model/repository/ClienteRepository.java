package fatecfranca.edu.loja.model.repository;
import fatecfranca.edu.loja.model.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository
        extends JpaRepository<ClienteEntity, Long> {

    // esta interface vai herdar todos os métodos de CRUD
    // (create, read, update, delete) de ClienteEntity
    // não vamos precisar de escrever código SQL
    // teremos métodos prontos
}
