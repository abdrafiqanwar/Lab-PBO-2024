package Class;

import java.util.Scanner;

public class Karyawan extends Kehidupan {
    private String nama;
    private String jabatan = "Karyawan";
    private int umur;
    private double gaji;
    private char organisasi;
    Scanner input = new Scanner(System.in);

    //buat objek
    Pengalaman pengalaman = new Pengalaman();
    Pendidikan pendidikan = new Pendidikan();
    Keluarga keluarga = new Keluarga();
    Projek projek = new Projek();

    //contructor
    public Karyawan(){}

    public Karyawan(String nama, double gaji, String jabatan, int umur, String jenisPengalaman, char statusMenikah, char organisasi) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
        this.jabatan = jabatan;
        this.pengalaman.jenisPengalaman = jenisPengalaman;
        this.keluarga.statusMenikah = statusMenikah;
        this.organisasi = organisasi;
    }

    //Getter dan Setter nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Getter dan Setter jabatan
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    //Getter dan Setter umur
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    //Getter dan Setter gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public char getOrganisasi(){
        return organisasi;
    }
    public void setOrganisasi(char organisasi){
        this.organisasi = organisasi;
    }

    public void gajiSebelumnya() {
        System.out.print("Gaji sebelumnya: ");
        double gaji = input.nextDouble();
        setGaji(gaji); // simpan gaji ke dalam objek Karyawan 
    }

    // Method polymorphism untuk menampilkan detail karyawan
    public void displayDetail() {
        System.out.println("Detail Karyawan:");
        System.out.println("Nama: " + this.getNama());
        System.out.println("Umur: " + this.getUmur());
        System.out.println("Jabatan: " + this.getJabatan());
        System.out.println("Gaji: " + this.getGaji());
        System.out.println("Jenis Pekerjaan: " + this.pengalaman.getJenisPengalaman());
        System.out.println("Status Nikah: "+ this.keluarga.getStatusMenikah());
        System.out.println("Berorganisasi: " + this.organisasi);
    }

    @Override
    public void prosesKehidupan(){
        while (true) {
            System.out.print("\nMasukkan nama: ");
            nama = input.nextLine();
            if (!nama.isEmpty()) {
                setNama(nama);
                break;
            } else {
                System.out.println("\nNama tidak boleh kosong!");
            }
        }
        while (true) {
            try {
                System.out.print("Masukkan umur: ");
                int umur = Integer.parseInt(input.nextLine());
                setUmur(umur);
                break;
            } catch (Exception e) {
                System.out.println("Tolong masukan angka!");
                input.nextLine(); // Membersihkan buffer
            }
        }
    }

    public void cekOrganisasi(){
        boolean loop = true;
        while(loop){
            try {
                System.out.print("Apakah pernah mengikuti Organisasi?(Y/T): ");
                this.organisasi = input.next().charAt(0);
                switch (organisasi) {
                    case 'Y':
                        loop = false;
                        break;
                    case 'T':
                        loop = false;
                        break;
                    default:
                        System.out.println("Tolong hanya pilih Y/T");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Tolong hanya pilih Y/T");
            }
        }
    }
}

