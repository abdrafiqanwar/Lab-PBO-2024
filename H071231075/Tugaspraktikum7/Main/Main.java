package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Class.Karyawan;
import Class.Keluarga;
import Class.Pengalaman;
import Class.Projek;
import Class.Pendidikan;

import javax.sound.sampled.*;
import java.io.*;

public class Main {
    static ArrayList<Karyawan> karyawanList = new ArrayList<>();

    public static void playSound(String soundFile) {
        try {
            // Mendapatkan alamat file suara
            InputStream audioSrc = new FileInputStream(new File(soundFile));
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new BufferedInputStream(audioSrc));

            // Memuat clip audio
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);

            // Memainkan suara
            clip.start();
        } catch (Exception e) {
            System.out.println("Error saat memainkan suara: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            // Menampilkan menu
            System.out.println("\nData Karyawan:");
            System.out.println("a. Tambah data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            try {
                String pilihan = input.nextLine();

                switch (pilihan) {
                    case "a":
                        tambahDataKaryawan();
                        break;
                    
                    case "b":
                        tampilkanDetailKaryawan(karyawanList);
                        break;

                    case "c":
                        loop = false;
                        break;
                
                    default:
                        System.out.println("Tolong pilih (a-c)");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                input.nextLine();
            }
        }
        System.out.println("sampai jumpa");
        input.close();
    }

    public static void tambahDataKaryawan() {
        Keluarga keluarga = new Keluarga();
        Karyawan karyawan = new Karyawan();
        Pengalaman pengalaman = new Pengalaman();
        Pendidikan pendidikan = new Pendidikan();
        Projek projek = new Projek();

        karyawan.prosesKehidupan();
        karyawan.cekOrganisasi();
        keluarga.pertanyaanKeluarga();
        pengalaman.prosesKehidupan();
        karyawan.gajiSebelumnya();
        pendidikan.prosesKehidupan();
        projek.prosesKehidupan();
        pendidikan.tampilPendidikan();
        
        if (pendidikan.getPendidikan().equals("SD") || pendidikan.getPendidikan().equals("SMP") || projek.getProjek() < 4 || karyawan.getUmur() < 18) {
            System.out.println("Maaf, karyawan tidak memenuhi syarat diterima.");
            playSound("Sound\rejected.wav");
            return; // Langsung keluar dari method tambahDataKaryawan
        } else {
            // Simpan data karyawan
            Karyawan data1 = new Karyawan(karyawan.getNama(),karyawan.getGaji(),karyawan.getJabatan(),karyawan.getUmur(),pengalaman.getJenisPengalaman(),keluarga.getStatusMenikah(), karyawan.getOrganisasi());
            karyawanList.add(data1);
            System.out.println("==============================");
            System.out.println("Karyawan berhasil ditambahkan!");
            System.out.println("==============================");
            playSound("Sound\\accept.wav");
        }
    }

    private static void tampilkanDetailKaryawan(ArrayList<Karyawan> karyawanList) {
        if (karyawanList.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
            return;
        }

        System.out.println("\nDetail Karyawan:");
        for (int i = 0; i < karyawanList.size(); i++) {
            System.out.println("\nKaryawan " + (i + 1));
            karyawanList.get(i).displayDetail();
        }
    }

}
