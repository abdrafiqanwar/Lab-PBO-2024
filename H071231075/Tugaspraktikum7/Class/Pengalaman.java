package Class;

import java.util.Scanner;

public class Pengalaman extends Kehidupan {

    public String jenisPengalaman;

    Scanner input = new Scanner(System.in);

    public void setJenisPengalaman(String jenisPengalaman) {
        this.jenisPengalaman = jenisPengalaman;
    }

    public String getJenisPengalaman() {
        return jenisPengalaman;
    }

    @Override
    public void prosesKehidupan() {
        boolean invalidInput = false;

        while (!invalidInput) {
            try {
                System.out.println("Pengalaman sebelumnya");
                System.out.println("1. Freelancer");
                System.out.println("2. Magang");
                System.out.println("3. Pekerja tetap");
                System.out.println("4. Tidak ada");
                System.out.print("Input : ");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        setJenisPengalaman("Freelancer");
                        invalidInput = true;
                        break;
                    case 2:
                        setJenisPengalaman("Magang");
                        invalidInput = true;
                        break;
                    case 3:
                        setJenisPengalaman("Pekerja tetap");
                        invalidInput = true;
                        break;
                    case 4:
                        setJenisPengalaman("Tidak ada");
                        invalidInput = true;
                        return;
                    default:
                        System.out.println("Tolong pilih (1-4)");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("Tolong pilih (1-4)");
                input.nextLine();
            }
        }
    }

    // // Contoh penggunaan
    // public static void main(String[] args) {
    //     Pengalaman pengalaman = new Pengalaman();

    //     // Proses pengalaman
    //     pengalaman.prosesKehidupan();
    // }
}
