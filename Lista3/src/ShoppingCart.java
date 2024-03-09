import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    // vetor de itens do carrinho
    // associação de todo-parte
    // CarItem é parte e ShoppingCart é o todo
    private List<CarItem> carItens;

    public ShoppingCart() {
        // aloca espaço na memória do vetor
        this.carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, float totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
        // aloca espaço na memória do vetor
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    // carItem será criado dentro do método
    // composição
    public void addCarItem(int id, int quantity, Product product){
        this.carItens.add(new CarItem(id, quantity, product));
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItens=" + carItens +
                '}';
    }
}
