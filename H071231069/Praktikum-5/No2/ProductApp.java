package No2;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductApp {

    static ArrayList<Product> stocks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Line();
            System.out.println("Menu:");
            System.out.println("1. Tambah Produk \n2. Tampilkan Semua Produk \n3. Beli Produk \n4. Keluar \n");
            Line();
            System.out.print(">>> Pilih Menu (1-4) \t: ");
            int inMenu = sc.nextInt();
            sc.nextLine();

            switch (inMenu) {
            case 1 :
                Line();
                runTambahProduk(sc);
                break;
            case 2 :
                Line();
                runTampilkanSemuaProduk(sc);
                break;
            case 3 :
                Line();
                runBeliProduk(sc);
                break; 
            
            }       
        }
    }

    private static void runTambahProduk(Scanner sc) {
        // Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama produk \t: ");
        String inProduk = sc.nextLine();
        System.out.print("Masukkan nomor seri  \t: ");
        int inSeri = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan harga \t\t: ");
        double inHarga = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nTipe Produk: ");
        System.out.println("1. Smartphone \n2. Laptop \n3. Camera");
        System.out.print(">>> Pilih tipe produk (1-3) \t: ");
        int inTipe = sc.nextInt();
        sc.nextLine();
        switch (inTipe) {
            case 1:
                Line();
                System.out.print("Masukkan ukuran layar (inci) \t\t: ");
                double inSize = sc.nextDouble();
                sc.nextLine();
                System.out.print("Masukkan kapasitas penyimpanan (GB) \t: ");
                int inCapacity = sc.nextInt();
                sc.nextLine();

                Smartphone smartphone = new Smartphone(inProduk, inSeri, inHarga, inSize, inCapacity);

                stocks.add(smartphone);
                break;
            case 2:
                Line();
                System.out.print("Masukkan tipe processor   \t\t: ");
                String inProcessor = sc.nextLine();
                System.out.print("Masukkan ukuran RAM (GB)  \t\t: ");
                int inRam = sc.nextInt();
                sc.nextLine();

                Laptop laptop = new Laptop(inProduk, inSeri, inHarga, inRam, inProcessor);

                stocks.add(laptop);
                break;
            case 3:
                Line();
                System.out.print("Masukkan resolusi camera (MP)     \t: ");
                int inResolusi = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tipe lensa       \t\t: ");
                String inLens = sc.nextLine();

                Camera camera = new Camera(inProduk, inSeri, inHarga, inResolusi, inLens);

                stocks.add(camera);
                break;
            default:
                Line();
                System.out.println("Invalid choice");
                Line();
                break;
        }
    }

    private static void runTampilkanSemuaProduk(Scanner sc) {
        for (Product product : stocks) {
            product.displayInfo();
        }
    }

    private static void runBeliProduk(Scanner sc) {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli : ");
        int inBeliSeri = sc.nextInt();
        sc.nextLine();

        boolean seriIsFound = false;
        for (Product product : stocks) {
            if (product.getSeriesNumber() == inBeliSeri) {
                seriIsFound = true;
                stocks.remove(product);
                System.out.println("Anda telah membeli produk:");
                product.displayInfo();
                break;
            }
        }
        if (!seriIsFound) {
            System.out.println("Nomor seri tidak ditemukan");
        }

    }

    private static void Line() {
        System.out.println("-".repeat(70));
    }
}