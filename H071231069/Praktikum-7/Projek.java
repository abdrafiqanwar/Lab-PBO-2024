import java.util.Scanner;

public class Projek {
    int jumlahProjek;

    public void jenisProjek(Scanner scan) {
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4 \n2. Minimal 8 \n3. Minimal 12 \n4. Lebih dari 15 \n5. tidak ada");
        int projek = 0;
        boolean cekProjek = false;
        do {
            try {
                System.out.print("Input: ");
                projek = Integer.parseInt(scan.nextLine());
                if (projek >= 1 && projek <= 5) {
                    cekProjek = true;
                } else {
                    System.out.println("Inputan tidak valid. Silahkan masukkan angka 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan harus berupa angka.");
            }
        } while (!cekProjek);

        switch (projek) {
            case 1:
                jumlahProjek = 4;
                break;
            case 2:
                jumlahProjek = 8;
                break;
            case 3:
                jumlahProjek = 12;
                break;
            case 4:
                jumlahProjek = 15;
                break;
            case 5:
                jumlahProjek = 0;
        }
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }
}
