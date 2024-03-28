package TugasPraktikum1;
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        int n = 0;
        try {
            System.out.print("Masukkan Jumlah Bilangan : ");
            n = inputan.nextInt();
            inputan.nextLine(); // untuk membersihkan newline

            int BilBul = 0;
            int BilDes = 0;

            System.out.print("Masukkan " + n + " Bilangan : ");
            String bilangan = inputan.nextLine();
            String[] angka = bilangan.split(" ");

            for (String angkaBaru : angka) {
                try {
                    double ang = Double.parseDouble(angkaBaru);
                    if (ang == (int) ang) {
                        BilBul++;
                    } else {
                        BilDes++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input Harus Berupa Angka. Coba Lagi!");
                    return;
                }
            }

            System.out.println("\nTerdapat " + BilBul + " Bilangan Bulat");
            System.out.println("Terdapat " + BilDes + " Bilangan Desimal");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan dalam memproses input.");
        } finally {
            inputan.close();
        }
    }
}
