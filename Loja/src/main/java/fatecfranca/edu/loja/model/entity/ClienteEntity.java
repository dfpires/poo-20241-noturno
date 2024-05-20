package fatecfranca.edu.loja.model.entity;
import jakarta.persistence.*;
@Entity // entidade de banco de dados
@Table(name="cliente") // tabela com nome cliente
public class ClienteEntity {
    @Id // chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) // gera automaticamente os valores
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="nota")
    private float nota;
    @Column(name="idade")
    private int idade;
    @Column(name="devedor")
    private boolean devedor;

    public ClienteEntity() {
    }

    public ClienteEntity(Long id, String nome, float nota, int idade, boolean devedor) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.devedor = devedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDevedor() {
        return devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }
}
