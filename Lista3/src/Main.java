//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // crie 3 produtos prod1, prod2 e prod3 com valores quaisquer
        // para suas variáveis
        Product prod1 = new Product(1, "WebCam", 170.0f);
        Product prod2 = new Product(2, "Mouse", 70.0f);
        Product prod3 = new Product(3, "Pente de 8 GB Ram", 120.0f);
        // crie 2 carrinhos de compra: o primeiro, deve conter 2 itens,
        // com o primeiro contendo prod1 e o segundo contendo prod2
        ShoppingCart sc1 = new ShoppingCart(100, 0);
        sc1.addCarItem(10, 2, prod1);
        sc1.addCarItem(11, 4, prod2);
        System.out.println(sc1.toString());

        // o segundo carrinho, deve conter 2 itens, sendo o primeiro
        // contendo o prod2 e o segundo contendo prod3
        // os valores dos itens de carrinho e do carrinho podem ser
        // à sua escolha
        // Finalmente, faça um método no carrinho que calcula e retorno
        // o valor total do carrinho
    }
}