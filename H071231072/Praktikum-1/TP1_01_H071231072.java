import java.util.Scanner;

public class TP1_01_H071231072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        int decimalCount = 0;
        int integerCount = 0;

        for (int i = 0; i < x; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            String numInput = scanner.nextLine();

            try {
                double num = Double.parseDouble(numInput);

                if (num % 1 == 0) {
                    integerCount++;
                } else {
                    decimalCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid: " + numInput);
                
            }
        }

        System.out.println(integerCount + " bilangan bulat");
        System.out.println(decimalCount + " bilangan desimal");
    }
}