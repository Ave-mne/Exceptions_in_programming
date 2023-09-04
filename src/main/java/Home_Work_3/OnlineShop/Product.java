package Home_Work_3.OnlineShop;

public class Product {
    private final String name;
    private int availableQuantity;
    private final double price;

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %f, Available Quantity: %d", name, price, availableQuantity);
    }
}