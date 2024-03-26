import java.util.Scanner;
public class TP1_05_H071231072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Masukkan bilangan: ");
        try {
            int target = scanner.nextInt();
            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            if (!found) {
                System.out.println("Bilangan tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka.");
        }
        scanner.close();
    }
}
