public class CarItem {
    private int id, quantity;
    // associação todo-parte
    // todo é CarItem e parte é Product
    private Product product;

    public CarItem() {
    }
    // caracteriza agregação, pois produto é criado
    // independente do CarItem
    // quando o produto vem na classe CarItem, ele já está
    // criado, não é o CarItem que vai criar o produto
    public CarItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    // caracteriza agregação
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "\n CarItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
