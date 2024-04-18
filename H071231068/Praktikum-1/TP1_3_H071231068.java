package Tugas.tugas1;

import java.util.Scanner;

public class TP1_3_H071231068 {
    public static void main(String[] args) {
        Scanner tanggal = new Scanner(System.in);

        System.out.print("Masukan tanggal : ");
        String input = tanggal.nextLine();

        String output = convertStringToDate(input);
        System.out.println(output);

        tanggal.close();
    }

    public static String convertStringToDate(String input) {
        String[] parts = input.split("-");
        int hari = Integer.parseInt(parts[0]);
        int bulan = Integer.parseInt(parts[1]);
        int tahun = Integer.parseInt(parts[2]);

        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
            "Agustus", "September", "Oktober", "November", "Desember"
        };

        
        String NamaBulan = namaBulan[bulan - 1];

        
        if (tahun < 100) {
            if (tahun >= 30) { 
                tahun += 1900;
            } else {
                tahun += 2000;
            }
        }


        String formattedDate = hari + " " + NamaBulan + " " + tahun;
        return formattedDate;
    }
}