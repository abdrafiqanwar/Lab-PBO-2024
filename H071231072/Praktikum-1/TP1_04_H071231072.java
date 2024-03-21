import java.util.Scanner;

public class TP1_04_H071231072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkaran:");
        double r, luas;

        try {
            r = scanner.nextDouble();
            if (r < 0) {
                System.out.println("Jari-jari tidak boleh negatif.");
            } else {
                luas = 3.14 * r * r;
                System.out.printf("Luas lingkaran: %.2f%n", luas);
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
        }

        scanner.close();
    }
}