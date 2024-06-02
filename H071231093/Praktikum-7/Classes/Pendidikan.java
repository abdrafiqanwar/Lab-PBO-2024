package Classes;

import java.util.Scanner;

public class Pendidikan {
    Scanner input = new Scanner(System.in);
    private String pendidikan;
    private static final String[] pendidikanOptions = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};

    public Pendidikan() {}

    public String getPendidikan() {
        return pendidikan;
    }

    public void pendidikan() {
        boolean loop = true;
        while (loop) {
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
            this.pendidikan = input.nextLine().toUpperCase();
            boolean isValid = false;

            for (String option : pendidikanOptions) {
                if (option.equals(pendidikan)) {
                    isValid = true;
                    break;
                }
            }

            if (isValid) {
                loop = false;
            } else {
                System.out.println("Tolong pilih Pendidikan yang benar");
            }
        }
    }
}
