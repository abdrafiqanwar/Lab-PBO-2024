package Class;
import java.util.Scanner;

public class Keluarga {
    public int saudara;
    public char statusMenikah;
    public String alamat;
    public int jumlahAnak;
    Scanner input = new Scanner(System.in);

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
        System.out.print("Jumlah Saudara: ");
        this.saudara = input.nextInt();
        System.out.print("Alamat Rumah: ");
        input.nextLine();
        this.alamat = input.nextLine();
        System.out.print("Apakah sudah menikah?(Y/T): ");
        this.statusMenikah = input.next().charAt(0);
        switch (statusMenikah) {
            case 'Y':
                System.out.print("Jumlah Anak: ");
                this.jumlahAnak = input.nextInt();
                break;
            case 'T':
                break;
            default:
                System.out.println("Tolong pilih Y/T");
                break;
        }
    }
}
