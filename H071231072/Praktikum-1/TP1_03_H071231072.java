import java.util.Scanner;

public class TP1_03_H071231072 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-MM-yyyy): ");
        String input = scanner.nextLine();
        String[] parts = input.split("-");

        int[] tanggal = {
            Integer.parseInt(parts[0]),
            Integer.parseInt(parts[1]),
            Integer.parseInt(parts[2])};

        printDate(tanggal);
        scanner.close();
    }


    private static void printDate(int[] arr) {
        String[] namaBulan = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        if (arr[1] < 1 || arr[1] > 12) {
            System.out.println("inputan invalid mohon masukkan ulang");
            return;}
        if (arr[2] >= 40){
            System.out.printf("%d %s %d%n", arr[0], namaBulan[arr[1] - 1], 1900 + arr[2]);
        }else{
            System.out.printf("%d %s %d%n", arr[0], namaBulan[arr[1] - 1], 2000 + arr[2]);
        }
    
    }
}