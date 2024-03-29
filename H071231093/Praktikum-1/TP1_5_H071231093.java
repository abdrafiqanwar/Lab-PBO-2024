import java.util.Scanner;

public class TP1_5_H071231093 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in); 
    
        int[][] nums = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        boolean cari = false;

        try {
            System.out.print("Masukkan Bilangan :  ");
            int bil = inputan.nextInt();
            inputan.close();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == bil) {
                        System.out.println("Found " + bil + " at [" + i + "][" + j + "]");
                        cari = true;
                        break;
                    }
                }
                if (cari) {
                    break;
                }
            }
            if (!cari) {
                System.out.println("Angka Tidak Terdapat Dalam Array. Coba Lagi!");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan. Inputan Harus Berupa Angka atau Angka Berada Dalam Array. Coba Lagi!");
        }
    }
}
