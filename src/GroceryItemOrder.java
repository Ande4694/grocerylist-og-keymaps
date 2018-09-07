public class GroceryItemOrder {
    private int price;
    private String name;
    private int quantity = 0;
    private int count;


    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ",\t name='" + name + '\'' +
                '}';
    }

    public GroceryItemOrder(int price, String name) {
        this.price = price;
        this.name = name;
        this.quantity++;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void check(){
        for (int i = 0; i<10;i++) {
            System.out.println("ANDERS ER DEN BEDSTE");
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
