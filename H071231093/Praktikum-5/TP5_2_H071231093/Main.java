import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toko toko = new Toko();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println(); printBarriers();
            System.out.print(">>> Pilih Menu (1-4): ");

            pilihan = scanner.nextInt();
            System.out.println();printBarriers();
            

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
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
    
    public static void printBarriers() {
        System.out.println("=============================================");
    }
}
