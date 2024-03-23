package rh;
public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super(); // chama construtor da superclasse
    }

    public Assistente(String nome, String endereco, String cpf,
                      float salario, float horaExtra) {
        //chama construtor da superclasse - reutilização de código
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                "horaExtra=" + horaExtra +
                super.toString()+ '}';
    }

    @Override
    public float calculaSalario(){
        return this.salario + this.horaExtra * 40;
    }
}
