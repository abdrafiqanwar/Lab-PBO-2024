import java.util.Scanner;

public class TP1_4_H071231069 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
            try {
                System.out.print("Masukkan jari-jari lingkaran = ");
                double r = sc.nextDouble();
              
                double luas = Math.PI * r * r;
        
                String hasil = String.format("Hasil : %.2f", luas);
                System.out.println(hasil);
        
                sc.close();
                
            } catch (Exception e) {
                System.out.println("Inputan Harus Angka");
            }
        }
    }
    


