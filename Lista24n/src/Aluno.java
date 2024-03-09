public class Aluno {

    private int codigo;
    private float nota;
    private String nome;

    public Aluno(int codigo, float nota, String nome) {
        this.setCodigo(codigo);
        this.setNota(nota);
        this.setNome(nome);
    }
    public Aluno(){

    }
    public void setCodigo(int codigo){
        if (codigo > 0){
            this.codigo = codigo;
        }
        else {
            System.out.println("Código inválido");
        }
    }
    public void setNota(float nota){
        if (nota >= 0 && nota <= 10){
            this.nota = nota;
        }
        else {
            System.out.println("Nota inválida");
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public float getNota(){
        return this.nota;
    }
    public String getNome(){
        return this.nome;
    }

    private boolean verificaPreguica(){
        if (this.nota < 3){
            return true;
        }
        else {
            return false;
        }
    }
}
