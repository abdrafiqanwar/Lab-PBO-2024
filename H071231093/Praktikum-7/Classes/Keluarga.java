package Classes;

import java.util.Scanner;

public class Keluarga {
    Scanner input = new Scanner(System.in);
    private int saudara;
    private char statusMenikah;
    private String alamat;
    private int jumlahAnak;

    public Keluarga(){}

    public int getSaudara() {
        return saudara;
    }
    public char getStatusMenikah() {
        return statusMenikah;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void pertanyaanKeluarga(){
        System.out.print("Jumlah Saudara(int): ");
        this.saudara = input.nextInt();
        System.out.print("Alamat Rumah: ");
        input.nextLine();
        this.alamat = input.nextLine();
        
        while (true) {  
            System.out.print("Apakah sudah menikah?(Y/T): ");
            this.statusMenikah = input.next().charAt(0);
            
            if (statusMenikah == 'Y') {
                System.out.print("Jumlah Anak(int): ");
                this.jumlahAnak = input.nextInt();
                break;  
            } else if (statusMenikah == 'T') {
                break;  
            } else {
                System.out.println("Tolong pilih Y/T");
            }
        }
    }
}

