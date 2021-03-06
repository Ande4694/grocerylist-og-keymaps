public class GroceryItemOrder {
    private int price;
    private String name;
    private int quantity;


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
        this.quantity ++;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity<= 1){
            System.out.println("quantity cannot be less than 1, since you tried to cheat im setting it to 50 for you.");
        }
        this.quantity = 50;
    }
}
