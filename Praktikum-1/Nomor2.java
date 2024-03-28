package TugasPraktikum1;
import java.util.*;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
            
        System.out.print("Masukkan Judul Film : ");
        String kalimat = inputan.nextLine();
        inputan.close();
            
        String[] arrKata = kalimat.split(" ");
            
        for (int i = 0; i < arrKata.length; i++) {
            arrKata[i] = KapHurufPertama(arrKata[i]);
        }
            
        String output = String.join(" ", arrKata);
        System.out.println("Hasil: " + output);
    }
    
    public static String KapHurufPertama(String kata) {
        if (kata == null || kata.isEmpty()) {
            return kata;
        }
        return Character.toUpperCase(kata.charAt(0)) + kata.substring(1).toLowerCase();
    }
}