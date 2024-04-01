package Tugas.tugas1;
import java.util.Scanner;

public class TP1_1_H071231068 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        int bulat = 0;
        int desimal = 0;

        
        for (int i = 0; i < n; i++) {
            double angka = scanner.nextDouble();
            if (angka % 1 == 0) {
                bulat++;
            } 
            else {
                desimal++;
            }
        }

        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
    }
}
