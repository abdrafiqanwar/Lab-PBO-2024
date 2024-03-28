package TugasPraktikum1;
import java.util.*;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in); 
    
        int[][] nums = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

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