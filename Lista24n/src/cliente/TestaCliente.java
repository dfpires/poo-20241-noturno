package cliente;

public class TestaCliente {
    public static void main(String args[]){
        Cliente obj1 =
new Cliente("123456-8", "1234-6", "Fulano", 0);
        obj1.depositar(3000);
        obj1.sacar(600);
        System.out.println(obj1.toString());

        Cliente obj2 =
new Cliente("555555-5", "6666-6", "Beltrano", 0);
        obj2.depositar(800);
        obj2.sacar(1000);
        System.out.println(obj2.toString());
    }
}
