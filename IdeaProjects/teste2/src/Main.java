public class Main {

    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, "Prata");
        Carro outroCarro = new Carro("Ford", "Fiesta", 2019, "Preto");

        // Chamando métodos dos objetos
        meuCarro.acelerar();
        outroCarro.frear();
    }

}
