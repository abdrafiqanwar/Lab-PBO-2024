import java.util.Scanner;

public class TP1_4_H071201025 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double radius = scanner.nextDouble();

            double area = hitungLuasLingkaran(radius);
            System.out.printf("Luas lingkaran: %.2f\n", area);

        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan angka.");
        }
    }

    public static double hitungLuasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }
}
