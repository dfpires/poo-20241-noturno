package rh;
public class Diretor extends Funcionario{
    private int qtdeAcoes;
    public Diretor(){
        super();
    }
    public Diretor(String nome, String endereco, String cpf, float salario, int qtdeAcoes) {
        super(nome, endereco, cpf, salario);
        this.qtdeAcoes = qtdeAcoes;
    }
    public int getQtdeAcoes() {
        return qtdeAcoes;
    }
    public void setQtdeAcoes(int qtdeAcoes) {
        this.qtdeAcoes = qtdeAcoes;
    }
    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "qtdeAcoes=" + qtdeAcoes +
                '}';
    }
    @Override
    public float calculaSalario() {
        return this.salario + (this.qtdeAcoes * 2.0f) / 12;
    }
}
