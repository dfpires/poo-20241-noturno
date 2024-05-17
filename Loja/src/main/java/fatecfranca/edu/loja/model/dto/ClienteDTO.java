package fatecfranca.edu.loja.model.dto;
public class ClienteDTO {
    private Long id;
    private String nome;
    private float nota;
    private int idade;
    private boolean devedor;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nome, float nota, int idade, boolean devedor) {
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

    public boolean isDevedor() {
        return devedor;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
