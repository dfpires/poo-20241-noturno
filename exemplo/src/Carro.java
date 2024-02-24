public class Carro {
    // variáveis da classe
    public String marca, modelo, cor;
    public int ano;
    public boolean motor; // true ou false
    public float velAtual;
    // método construtor
    public Carro(String marca, String modelo, String cor, int ano, boolean motor,
                 float velAtual){
        // this representa o objeto que chama o método
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    public void mostra(){
        System.out.println("\n Modelo " + this.modelo +
                " Marca " + this.marca + " Cor " + this.cor +
                " Ano " + this.ano + " Motor: " + this.motor +
                " Velocidade " + this.velAtual);
    }

    public void ligar(){
        if (!this.motor) {// se estiver desligado
            this.motor = true;
        }
    }

    public void desligar(){
        if (this.motor) { // se estiver ligado
            this.motor = false;
            this.velAtual = 0;
        }
    }

    public void acelerar(float x){
        if (this.motor) {
            this.velAtual += x;
        }
    }

    public void frear(float x){
        if (this.motor){ // motor ligado
            if (this.velAtual - x >= 0){ // não pode valor negativo
                this.velAtual -= x;
            }
        }
    }
}
