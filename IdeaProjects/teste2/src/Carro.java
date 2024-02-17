public class Carro {
    // Atributos
    public String marca;
    public String modelo;
    public int ano;
    public String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    // Métodos
    public void acelerar() {
        System.out.println( this.marca + " Carro acelerando...");
    }

    public void frear() {
        System.out.println( this.modelo + " Carro freando...");
    }

}
