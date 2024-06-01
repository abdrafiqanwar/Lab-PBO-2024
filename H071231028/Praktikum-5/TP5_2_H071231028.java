import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String brand;
    int serialNumber;
    double price;

    public Product(String brand, int serialNumber, double price) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Nomor Seri: " + serialNumber);
        System.out.println("Harga: $" + price);
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int serialNumber, double price, double screenSize, int storageCapacity) {
        super(brand, serialNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran Layar: " + screenSize + " inci");
        System.out.println("Kapasitas Penyimpanan: " + storageCapacity + " GB");
    }
}

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int serialNumber, double price, int resolution, String lensType) {
        super(brand, serialNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolusi: " + resolution);
        System.out.println("Tipe Lensa: " + lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int serialNumber, double price, int ramSize, String processorType) {
        super(brand, serialNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran RAM: " + ramSize + " GB");
        System.out.println("Tipe Processor: " + processorType);
    }
}

public class TP5_2_H071231088 {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    showAllProducts();
                    break;
                case 3:
                    buyProduct(scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan nomor antara 1 dan 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addProduct(Scanner scanner) {
        scanner.nextLine(); // Menangani karakter baru yang tertinggal
        System.out.print("Masukkan nama produk: ");
        String brand = scanner.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int serialNumber = scanner.nextInt();
        System.out.print("Masukkan harga: ");
        double price = scanner.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int type = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.print("Ukuran Layar (inci): ");
                double screenSize = scanner.nextDouble();
                System.out.print("Kapasitas Penyimpanan (GB): ");
                int storageCapacity = scanner.nextInt();
                products.add(new Smartphone(brand, serialNumber, price, screenSize, storageCapacity));
                break;
            case 2:
                System.out.print("Ukuran RAM (GB): ");
                int ramSize = scanner.nextInt();
                scanner.nextLine(); // Menangani karakter baru yang tertinggal
                System.out.print("Tipe Processor: ");
                String processorType = scanner.nextLine();
                products.add(new Laptop(brand, serialNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.print("Resolusi: ");
                int resolution = scanner.nextInt();
                scanner.nextLine(); // Menangani karakter baru yang tertinggal
                System.out.print("Tipe Lensa: ");
                String lensType = scanner.nextLine();
                products.add(new Camera(brand, serialNumber, price, resolution, lensType));
                break;
            default:
                System.out.println("Tipe produk tidak valid.");
        }

        System.out.println("Produk berhasil ditambahkan.");
    }

    private static void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia.");
            return;
        }

        System.out.println("Daftar Produk:");
        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }

    private static void buyProduct(Scanner scanner) {
        if (products.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia untuk dibeli.");
            return;
        }

        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int serialNumber = scanner.nextInt();

        boolean found = false;
        for (Product product : products) {
            if (product.serialNumber == serialNumber) {
                found = true;
                System.out.println("Anda telah membeli produk:");
                product.displayInfo();
                products.remove(product);
                break;
            }
        }

        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}
