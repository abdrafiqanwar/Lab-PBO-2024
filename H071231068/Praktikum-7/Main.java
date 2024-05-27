package TP7;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static Audio audio = new Audio();

    public static void main(String[] args) {
        tampilanUtama();
    }

    public static void tampilanUtama() {
        char pilihan;
        do {
            System.out.println("\nData karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");

            System.out.print("Pilih opsi (a-c): ");
            pilihan = input.next().charAt(0);

            switch (pilihan) {
                case 'a':
                    tambahDataKaryawan();
                    break;
                case 'b':
                    tampilkanDataKaryawan();
                    break;
                case 'c':
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid!");
            }
        } while (pilihan != 'c');
    }

    public static void tambahDataKaryawan() {
        try {
            System.out.println("\nTambah Data Karyawan");
            System.out.print("Masukkan nama     : ");
            String nama = input.next();
            input.nextLine();

            System.out.print("Masukkan umur     : ");
            int umur = input.nextInt();
            input.nextLine();

            System.out.print("Masukan gaji      : ");
            double gaji = input.nextDouble();
            input.nextLine();

            System.out.print("Masukan Jabatan   : ");
            String jabatan = input.next();
            input.nextLine();

            System.out.println("Pengalaman sebelumnya : ");
            System.out.println("1. Freelancer");
            System.out.println("2. Magang");
            System.out.println("3. Pekerja Tetap");
            System.out.println("4. Tidak ada");
            System.out.print("Input: ");
            int pengalaman = input.nextInt();

            input.nextLine();
            String pendidikan;
            while (true) {
                System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
                pendidikan = input.nextLine();
                if (pendidikan.equalsIgnoreCase("SD") || pendidikan.equalsIgnoreCase("SMP")
                        || pendidikan.equalsIgnoreCase("SMA") || pendidikan.equalsIgnoreCase("SMK")
                        || pendidikan.equalsIgnoreCase("S1") || pendidikan.equalsIgnoreCase("S2")
                        || pendidikan.equalsIgnoreCase("S3")) {
                    break;
                } else {
                    System.out.println("Pendidikan terakhir harus S3 atau kurang. Silakan input ulang.");
                }
            }

            System.out.println("Projek IT: ");
            System.out.println("1. Minimal 4");
            System.out.println("2. Minimal 8");
            System.out.println("3. Minimal 12");
            System.out.println("4. Lebih dari 15");
            System.out.print("Input: ");
            int projek = input.nextInt();
            
        
            System.out.println("Status Keluarga: ");
            System.out.println("1. Belum menikah");
            System.out.println("2. Sudah menikah");
            System.out.print("Input: ");
            int statusKeluarga = input.nextInt();

            String jumlahAnak = "";
            input.nextLine();

            if (statusKeluarga == 2) {
                System.out.print("Masukkan jumlah anak: ");
                jumlahAnak = input.next();
            }

            Karyawan karyawan = new Karyawan(nama, umur, jabatan, gaji, jumlahAnak, statusKeluarga);
            Pendidikan pendidikan1 = new Pendidikan(pendidikan);
            Projek projek1 = new Projek(projek);
            Pengalaman pengalaman1 = new Pengalaman(pengalaman);

            if (umur < 18 || pendidikan.equalsIgnoreCase("SD") || pendidikan.equalsIgnoreCase("SMP") || projek == 1) {
                System.out.println("Karyawan tidak memenuhi syarat");
                audio.playRejectAudio("src/resources/audio/goodbye.wav");

            } else {

                System.out.println("Pengalaman sedang diproses.......");
                pendidikan1.prosesKehidupan();
                pendidikan1.pendidikanKaryawan();
                pengalaman1.prosesKehidupan();
                pengalaman1.jenisPekerjaan();
                projek1.jumlahProjek();
                System.out.println("Selamat, anda diterima");
                daftarKaryawan.add(karyawan);
                audio.playWelcomAudio("src/resources/audio/welcome.wav");

            }
        } catch (Exception e) {
            System.out.println("Gagal input data: " + e.getMessage());
        }
    }

    public static void tampilkanDataKaryawan() {
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan");
            return;
        }

        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.display();
        }
    }

}
