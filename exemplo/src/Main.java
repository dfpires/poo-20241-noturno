//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro("Fiat", "Palio", "branca", 2012, false, 0);

        Carro obj2 = new Carro("GM", "Onix", "prata", 2018, false, 0);

        Carro obj3 = new Carro("Toyota", "Corrola", "cinza", 2022, false, 0);
        // exibe o estado dos objetos
        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
        // liga os objetos
        obj1.ligar();
        obj2.ligar();
        // acelerar e frear obj1
        obj1.acelerar(100);
        obj1.frear(30);
        obj2.acelerar(60);
        obj2.frear(80);
        obj3.acelerar(40);
        obj3.frear(10);
        // exibe o estado dos objetos
        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
    }
}