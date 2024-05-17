package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    private static ArrayList<Pengalaman> listPengalaman = new ArrayList<>();
    private static ArrayList<Keluarga> listKeluarga = new ArrayList<>();
    private static ArrayList<Projek> listProjek = new ArrayList<>();
    private static ArrayList<Pendidikan> listPendidikan = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            try {
                System.out.println("Data Karyawan");
                System.out.println("a. Tambah data karyawan");
                System.out.println("b. Tampilkan detail karyawan");
                System.out.println("c. Keluar");
                System.out.print("Pilih opsi (a-c) : ");
                char opsi = input.next().charAt(0);
                System.out.println();printBarriers();
                switch (opsi) {
                    case 'a':
                        runApp();
                        break;

                    case 'b':
                        tampilkanKaryawan();
                        break;

                    case 'c':
                        System.out.println("Sampai Jumpa!");
                        loop = false;
                        break;
                    default:
                        System.out.println("Tolong pilih a-c");
                        System.out.println();
                        break;
                }
            }catch (Exception e) {
                System.out.println("Tolong pilih a-c");
                System.out.println();
            }
        }
        input.close();
        }

    public static void runApp(){
        Scanner input = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        Pengalaman pengalaman = new Pengalaman();
        Projek projek = new Projek();
        Pendidikan pendidikan = new Pendidikan();
        Keluarga keluarga = new Keluarga();

        karyawan.tambahKaryawan();
        keluarga.pertanyaanKeluarga();
        pengalaman.prosesKehidupan();
        if(pengalaman.getPengalamanKerja() <= 3){
            System.out.print("Gaji Sebelumnya : ");
            int gajiSebelumnya = input.nextInt();
            pengalaman.setGajiSebelumnya(gajiSebelumnya);
            System.out.print("Ingin gaji sesuai pengalaman sebelumnya? (Y/T) : ");
            char cekGaji = input.next().charAt(0);
            if(cekGaji == 'Y'){
                karyawan.setGaji(gajiSebelumnya);
            }
        }
        pengalaman.cekOrganisasi();
        pendidikan.pendidikan();
        projek.projekIT();
        System.out.println("Sedang diproses. . .");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}

        if(karyawan.getUmur() < 18 || pendidikan.getPendidikan().equals("SD") || pendidikan.getPendidikan().equals("SMP") || projek.getProjek() == 1 || pengalaman.getOrganisasi() == 'T') {
            System.out.println();printBarriers();
            System.out.println("Karyawan tidak memenuhi syarat, maaf!");
            System.out.println("Karyawan : mungkin belum rezeki, nice try");
            System.out.println();printBarriers();
        } else {
            System.out.println();printBarriers();
            System.out.println("Selamat, karyawan diterima!");
            System.out.println("Karyawan : Alhamdulillah, kerja bagus");
            System.out.println();printBarriers();
            listKaryawan.add(karyawan);
            listPengalaman.add(pengalaman);
            listKeluarga.add(keluarga);
            listProjek.add(projek);
            listPendidikan.add(pendidikan);
        }        
    }

    private static void tampilkanKaryawan(){
        Scanner input = new Scanner(System.in);
        if(listKaryawan.isEmpty()){
            try {
                System.out.println("Belum ada karyawan yang ditambahkan !");
                System.out.println();
            } catch (Exception e) {
                input.close();
            }

        }else{
            System.out.println("1. Tampilkan Seluruh Karyawan(Hanya bagian Nama,umur,jabatan dan gaji)");
            System.out.println("2. Cari Karyawan");
            System.out.print("= ");
            int opsi = input.nextInt();

            if (opsi == 1) {
                System.out.println("========== Detail Karyawan ==========");
                for (int i = 0; i < listKaryawan.size(); i++) {
                    System.out.println("Nama     : " + listKaryawan.get(i).getNama());
                    System.out.println("Umur     : " + listKaryawan.get(i).getUmur() + " Tahun");
                    System.out.println("Jabatan  : " + listKaryawan.get(i).getJabatanString());
                    System.out.println("Gaji     : Rp" + listKaryawan.get(i).getGaji());
                    System.out.println();
                }
            } else {
                System.out.print("Masukkan nama yang ingin dicari: ");
                input.nextLine(); // Membersihkan newline
                String cariNama = input.nextLine();
                boolean dapat = false;
            
                for (int i = 0; i < listKaryawan.size(); i++) {
                    if (listKaryawan.get(i).getNama().equals(cariNama)) {
                        dapat = true;
                        System.out.println("=============== Detail Karyawan Lengkap =================== ");
                        System.out.println("Detail Penting");
                        System.out.println("Nama     : " + listKaryawan.get(i).getNama());
                        System.out.println("Umur     : " + listKaryawan.get(i).getUmur() + " Tahun");
                        System.out.println("Jabatan  : " + listKaryawan.get(i).getJabatanString());
                        System.out.println("Gaji     : Rp" + listKaryawan.get(i).getGaji());
                        System.out.println();
                        System.out.println("Detail Pengalaman");
                        System.out.println("Pekerjaan Sebelumnya       : " + listPengalaman.get(i).getKerjaSebelumnya());
                        if (listPengalaman.get(i).getPengalamanKerja() <= 3) {
                            System.out.println("Gaji pekerjaan sebelumnya  : Rp" + listPengalaman.get(i).getGajiSebelumnya());
                        }
                        System.out.println("Pendidikan terakhir        : " + listPendidikan.get(i).getPendidikan());
                        System.out.println("Total Projek IT            : " + listProjek.get(i).getProjek());
                        System.out.println();
                        System.out.println("Detail Keluarga");
                        System.out.println("Alamat Rumah   : " + listKeluarga.get(i).getAlamat());
                        System.out.println("Jumlah Saudara : " + listKeluarga.get(i).getSaudara());
                        System.out.println("Status Menikah : " + listKeluarga.get(i).getStatusMenikah());
                        if (listKeluarga.get(i).getStatusMenikah() == 'Y') {
                            System.out.println("Jumlah Anak : " + listKeluarga.get(i).getJumlahAnak());
                        }
                        System.out.println();
                        break; // Keluar dari loop setelah menemukan nama yang dicari
                    }
                }
            
                if (!dapat) {
                    System.out.println("Maaf, Tidak ditemukan nama seperti itu");
                }
            }            
        }
    }
    public static void printBarriers() {
        System.out.println("==========================================");
    }
}
