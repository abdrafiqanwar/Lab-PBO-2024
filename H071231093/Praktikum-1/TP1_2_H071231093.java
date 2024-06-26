import java.util.Scanner;

public class TP1_2_H071231093 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.println("Masukan judul film : ");
        String kalimat = inputan.nextLine();
        inputan.close();

        String[] arrKata = kalimat.split(" ");

        for (int i = 0; i < arrKata.length; i++) {
            arrKata[i] = KapitalHurufPertama(arrKata[i]);
        }

        String output = String.join(" ", arrKata);
        System.out.println(("Hasil : " + output));
    }
    
    public static String KapitalHurufPertama(String kata) {
        if (kata == null || kata.isEmpty()) {
            return kata;
        }
        return Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase();
    }
}
    
