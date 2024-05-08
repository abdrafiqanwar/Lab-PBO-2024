
import java.util.ArrayList;
import java.util.Scanner;

class Produk {
    protected String merek;
    protected int nomorSeri;
    protected double harga;

    public Produk(String merek, int nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: Rp" + harga);
    }
}

class Ponsel extends Produk {
    private double ukuranLayar;
    private int kapasitasPenyimpanan;

    public Ponsel(String merek, int nomorSeri, double harga, double ukuranLayar, int kapasitasPenyimpanan) {
        super(merek, nomorSeri, harga);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
        System.out.println("Kapasitas Penyimpanan: " + kapasitasPenyimpanan + " GB");
    }
}

class Kamera extends Produk {
    private int resolusi;
    private String tipeLensa;

    public Kamera(String merek, int nomorSeri, double harga, int resolusi, String tipeLensa) {
        super(merek, nomorSeri, harga);
        this.resolusi = resolusi;
        this.tipeLensa = tipeLensa;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Resolusi: " + resolusi + " MP");
        System.out.println("Tipe Lensa: " + tipeLensa);
    }
}

class Laptop extends Produk {
    private int ukuranRAM;
    private String tipeProsesor;

    public Laptop(String merek, int nomorSeri, double harga, int ukuranRAM, String tipeProsesor) {
        super(merek, nomorSeri, harga);
        this.ukuranRAM = ukuranRAM;
        this.tipeProsesor = tipeProsesor;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ukuran RAM: " + ukuranRAM + " GB");
        System.out.println("Tipe Prosesor: " + tipeProsesor);
    }
}

public class No2 {
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

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Ponsel");
        System.out.println("2. Laptop");
        System.out.println("3. Kamera");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch(pilihan) {
            case 1:
                System.out.println("Masukkan ukuran layar (inci): ");
                double ukuranLayar = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Masukkan kapasitas penyimpanan (GB): ");
                int kapasitasPenyimpanan = scanner.nextInt();
                scanner.nextLine();
                produk.add(new Ponsel(merek, nomorSeri, harga, ukuranLayar, kapasitasPenyimpanan));
                break;
            case 2:
                System.out.println("Masukkan ukuran RAM (GB): ");
                int ukuranRAM = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan tipe prosesor: ");
                String tipeProsesor = scanner.nextLine();

                produk.add(new Laptop(merek, nomorSeri, harga, ukuranRAM, tipeProsesor));
                break;
            case 3:
                System.out.println("Masukkan resolusi (MP): ");
                int resolusi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan tipe lensa: ");
                String tipeLensa = scanner.nextLine();

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

    public static void main(String[] args) {
        No2 toko = new No2();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print(">>> Pilih Menu (1-4): ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    toko.tambahProduk();
                    break;
                case 2:
                    toko.tampilkanSemuaProduk();
                    break;
                case 3:
                    toko.beliProduk();
                    break;
                case 4:
                    System.out.println("Terima kasih telah Belanja .");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}