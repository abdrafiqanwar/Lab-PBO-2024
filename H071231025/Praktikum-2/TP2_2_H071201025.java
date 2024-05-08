

class Product {

    private int id;
    private String name;
    private int stock;
    private double price;

    public Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailableInStock() {
        return stock > 0;
    }

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " buah " + name + " terjual.");
        } else if (quantity > stock) {
            System.out.println("Stok " + name + " tidak mencukupi.");
        } else {
            System.out.println("Jumlah tidak valid.");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println(quantity + " buah " + name + " ditambah ke stok.");
        } else {
            System.out.println("Jumlah tidak valid.");
        }
    }
}

public class TP2_2_H071201025 {
    public static void main(String[] args) {
        // Initialize products
        Product product1 = new Product(101, "Laptop", 10, 1200.50);
        Product product2 = new Product(102, "Smartphone", 20, 800.0);
        Product product3 = new Product(103, "HeadSet", 0, 600.0);

        System.out.println(product1.getStock());
        product1.sell(10);
        System.out.println(product1.getStock());

    }
}
