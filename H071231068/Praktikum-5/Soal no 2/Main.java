package TP5.NO2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> listProduk = new ArrayList<>();

    public static void main(String[] args){
        showMenu();

    }

    static void showMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Menu : ");
        System.out.println("1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar\n");
        System.out.print(">>> Pilih Menu (1-4) : ");
        int pilihan = input.nextInt();
        input.nextLine();
        boolean ada = false;
        switch (pilihan){
            case 1:
                addProduct();
                showMenu();
                break;
            case 2:
            if (listProduk.size() > 0) {
                System.out.println("Daftar Produk: ");
                for (Product x : listProduk) {
                    x.displayInfo();
                    System.out.println("");
                }
            } else {
                System.out.println("Produk tidak ada");
            }
            showMenu();
            break;
            case 3:
                System.out.print("Masukkan nomor seri produk yang ingin dibeli : ");
                int searchNomorSeri = input.nextInt();

                try{
                    for (int i = 0; i < listProduk.size(); i++){
                        if (listProduk.get(i).seriesNumber == searchNomorSeri){
                            ada = true;
                            System.out.println("Anda Telah Membeli Produk!");
                            listProduk.get(i).displayInfo();
                            listProduk.remove(i);
                            break;
                        }
                    }
                } catch (java.util.NoSuchElementException e){
                }
                if (!ada){
                    System.out.println("Prodak dengan nomor Seri tersebut tidak ditemukan");
                }
                showMenu();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                System.exit(1);
            default:
                showMenu();
        }

    }

    static void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama produk : ");
        String produk = input.nextLine();
        System.out.print("Masukkan nomor seri : ");
        int nomorSeri = input.nextInt();
        System.out.print("Masukkan harga : ");
        double harga = input.nextDouble();
        input.nextLine();
        pilihTipe(produk, nomorSeri, harga);
    }
    static void pilihTipe(String namaProduk, int nomorSeri, double harga){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih tipe produk: \n1. Smartphone\n2. Laptop\n3. Camera");
        System.out.print("Pilih tipe produk (1-3) : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                System.out.print("Masukkan ukuran layar (inci) : ");
                double screenSize = input.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB) : ");
                int storageCapacity = input.nextInt();
                Smartphone smartphone = new Smartphone(namaProduk, nomorSeri, harga, screenSize, storageCapacity);
                listProduk.add(smartphone);
                break;
            case 2:
                System.out.print("Masukkan size ram (GB) : ");
                int ramSize = input.nextInt();
                System.out.print("Masukkan tipe prosesor cpu : ");
                String processorType = input.next();
                Laptop laptop = new Laptop(namaProduk, nomorSeri, harga, ramSize, processorType);
                listProduk.add(laptop);
                break;
            case 3:
                System.out.print("Masukkan resolusi kamera : ");
                int resolusi = input.nextInt();
                System.out.print("Masukkan tipe lensa : ");
                String lensType = input.next();
                Camera camera = new Camera(namaProduk, nomorSeri, harga, resolusi, lensType);
                listProduk.add(camera);
                break;
        }
    }
}


