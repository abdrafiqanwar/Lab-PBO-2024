package Class;

import java.util.Scanner;

public class Pendidikan extends Kehidupan {
    String tingkatPendidikan;
    Scanner input = new Scanner(System.in);
    
    public String getPendidikan() {
        return tingkatPendidikan;
    }
    
    public void setPendidikan(String pendidikan){
        this.tingkatPendidikan = pendidikan;
    }

    public void tampilPendidikan() {
        System.out.println("Pendidikan terakhir: " + tingkatPendidikan);
    }
    
    @Override
    public void prosesKehidupan() {
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                String pendidikan = input.nextLine();

                switch (pendidikan) {
                    case "SD":
                    case "SMP":
                    case "SMA":
                    case "SMK":
                    case "S1":
                    case "S2":
                    case "S3":
                        validInput = true; // Keluar dari loop jika input sesuai
                        setPendidikan(pendidikan); // Set pendidikan
                        break;
                    default:
                        System.out.println("\nTolong pilih (SD/SMP/SMA/SMK/S1/S2/S3)");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                input.nextLine();
            }
        } 
    } 

    //  // Contoh penggunaan
    //  public static void main(String[] args) {
    //     Pendidikan pendidikan = new Pendidikan();

    //     // Meminta input tingkat pendidikan
    //     pendidikan.prosesKehidupan();

    //     // Menampilkan tingkat pendidikan yang diinput
    //     System.out.println("Tingkat Pendidikan: " + pendidikan.tingkatPendidikan);
    // }
}
