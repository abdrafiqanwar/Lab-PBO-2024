package Class;

import java.util.Scanner;

public class Projek extends Kehidupan {
    Scanner input = new Scanner(System.in);
    int projek;

    // Settet dan Getter projek
    public int getProjek() {
        return projek;
    }

    public void setProjek(int projek) {
        this.projek = projek;
    }

    @Override
    public void prosesKehidupan(){
        boolean invalidInput = false;
        while (!invalidInput) {
            try {
                System.out.println("Projek IT:");
                System.out.println("1. Minimal 4");
                System.out.println("2. Minimal 8");
                System.out.println("3. Minimal 12");
                System.out.println("4. Lebih dari 15");
                System.out.print("Input: ");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        setProjek(4);
                        invalidInput = true;
                        break;
                    case 2:
                        setProjek(8);
                        invalidInput = true;
                        break;
                    case 3:
                        setProjek(12);
                        invalidInput = true;
                        break;
                    case 4:
                        setProjek(16);
                        invalidInput = true;
                        break;
                    default:
                        System.out.println("Tolong pilih 1-4");
                        break;
                }
                System.out.println("Pengalaman sedang proses...");
                System.out.println("Jumlah projek IT: " + projek);
            } catch (Exception e) {
                System.out.println("Tolong pilih 1-4");
                input.nextLine();
            }
        }
    }
}