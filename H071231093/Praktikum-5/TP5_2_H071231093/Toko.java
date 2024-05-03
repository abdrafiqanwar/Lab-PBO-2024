import java.util.ArrayList;
import java.util.Scanner;

public class Toko {
    private ArrayList<Produk> produk = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahProduk() {
        System.out.println("Masukkan nama produk: ");
        String merek = scanner.nextLine();

        System.out.println("Masukkan nomor seri: ");
        int nomorSeri = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan harga: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();printBarriers();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Ponsel");
        System.out.println("2. Laptop");
        System.out.println("3. Kamera");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        System.out.println();printBarriers();

        switch(pilihan) {
            case 1:
                System.out.println("Masukkan ukuran layar (inci): ");
                double ukuranLayar = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Masukkan kapasitas penyimpanan (GB): ");
                int kapasitasPenyimpanan = scanner.nextInt();
                scanner.nextLine();
                System.out.println();printBarriers();
                produk.add(new Ponsel(merek, nomorSeri, harga, ukuranLayar, kapasitasPenyimpanan));
                break;
            case 2:
                System.out.println("Masukkan ukuran RAM (GB): ");
                int ukuranRAM = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan tipe prosesor: ");
                String tipeProsesor = scanner.nextLine();
                System.out.println();printBarriers();

                produk.add(new Laptop(merek, nomorSeri, harga, ukuranRAM, tipeProsesor));
                break;
            case 3:
                System.out.println("Masukkan resolusi (MP): ");
                int resolusi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan tipe lensa: ");
                String tipeLensa = scanner.nextLine();
                System.out.println();printBarriers();

                produk.add(new Kamera(merek, nomorSeri, harga, resolusi, tipeLensa));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    public void tampilkanSemuaProduk() {
        System.out.println("Daftar produk: ");
        for (Produk produk : produk) {
            produk.tampilkanInfo(); 
            System.out.println(); 
        }
    }
    
    public void beliProduk() {
        System.out.println("Masukkan nomor seri produk yang ingin dibeli: ");
        int nomorSeriYangDiinginkan = scanner.nextInt();
        scanner.nextLine();
        System.out.println();printBarriers();

        boolean ditemukan = false;
        for (Produk produk : produk) {
            if (produk.nomorSeri == nomorSeriYangDiinginkan) {
                System.out.println("Anda telah membeli produk: ");
                produk.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if(!ditemukan) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }

    public static void printBarriers() {
        System.out.println("=============================================");
    }


}
