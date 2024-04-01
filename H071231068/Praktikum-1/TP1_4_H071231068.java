package Tugas.tugas1;
import java.util.Scanner;

public class TP1_4_H071231068 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;

        try {
            System.out.print("Masukkan nilai radius lingkaran: ");
            radius = scanner.nextDouble();
        }
        catch (Exception e){
            System.out.println("Masukan angka bukan huruf.");
        }


        double area = Math.PI * radius * radius;

        System.out.printf("Luas lingkaran dengan radius %.2f adalah %.2f\n", radius, area);
    }
}

