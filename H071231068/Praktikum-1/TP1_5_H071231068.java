package Tugas.tugas1;

import java.util.Scanner;

public class TP1_5_H071231068 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        int target = 0;

        System.out.print("Masukkan angka yang ingin dicari: ");
        try {
            target = scanner.nextInt();
        }
        catch (Exception e){
            System.out.println("Input yang dimasukkan bukan angka.");
            scanner.close();
            return;
        }

        boolean ditemukan = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.printf("Angka %d ditemukan di [%d][%d]\n", target, i, j);
                    ditemukan = true;
                    break;
                }
            }
            if (ditemukan) {
                break;
            }
        }

        if (!ditemukan) {
            System.out.printf("Angka %d tidak ditemukan dalam array.\n", target);
        }
    }
}
