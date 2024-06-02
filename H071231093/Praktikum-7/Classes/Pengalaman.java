package Classes;

import java.util.Scanner;

public class Pengalaman extends Kehidupan{
    Scanner input = new Scanner(System.in);
    private int pengalamanKerja = 4;
    private char organisasi;
    private String KerjaSebelumnya;
    private int gajiSebelumnya;

    public Pengalaman(){}

    public int getPengalamanKerja(){
        return pengalamanKerja;
    }

    public char getOrganisasi(){
        return organisasi;
    }

    public void setGajiSebelumnya(int gajiSebelumnya){
        this.gajiSebelumnya = gajiSebelumnya;
    }

    public int getGajiSebelumnya(){
        return gajiSebelumnya;
    }

    public String getKerjaSebelumnya(){
        if(pengalamanKerja == 1){
            KerjaSebelumnya = "Freelancer";
        }else if(pengalamanKerja == 2){
            KerjaSebelumnya = "Magang";
        }else if(pengalamanKerja == 3){
            KerjaSebelumnya = "Pekerja tetap";
        }else if(pengalamanKerja == 4){
            KerjaSebelumnya = "Tidak ada";
        }
        return KerjaSebelumnya;
    }
    
    @Override
    public void prosesKehidupan() {
        boolean loop = true;
        while (loop) {
            try {
                System.out.println("Pengalaman sebelumnya:");
                System.out.println("1. Freelancer");
                System.out.println("2. Magang");
                System.out.println("3. Pekerja Tetap");
                System.out.println("4. Tidak ada");
                System.out.print("Input: ");
                this.pengalamanKerja = input.nextInt();
    
                if (pengalamanKerja == 1 || pengalamanKerja == 2 || pengalamanKerja == 3 || pengalamanKerja == 4) {
                    loop = false;
                } else {
                    System.out.println("Tolong pilih 1-4");
                }
            } catch (Exception e) {
                System.out.println("Tolong pilih 1-4");
                input.next(); // Clear the invalid input
            }
        }
    }
    
    public void cekOrganisasi() {
        boolean loop = true;
        while (loop) {
            try {
                System.out.print("Apakah pernah mengikuti Organisasi?(Y/T): ");
                this.organisasi = input.next().charAt(0);
                if (organisasi == 'Y' || organisasi == 'T') {
                    loop = false;
                } else {
                    System.out.println("Tolong hanya pilih Y/T");
                }
            } catch (Exception e) {
                System.out.println("Tolong hanya pilih Y/T");
                input.next(); // Clear the invalid input
            }
        }
    }    
}
