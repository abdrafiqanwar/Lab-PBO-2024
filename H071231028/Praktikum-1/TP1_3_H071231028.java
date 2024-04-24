import java.util.Scanner;
import java.util.Arrays;

public class TP1_3_H071231028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTanggal = scanner.nextLine();
        String[] splitTanggal = inputTanggal.split("-");

        int[] intTanggal = Arrays.stream(splitTanggal).mapToInt(Integer::parseInt).toArray();

        int tahun = intTanggal[2];
        String tahun2 = String.format("%02d", tahun);
        if (tahun >= 20) {
            tahun2 = "20" + tahun2;
        } else {
            tahun2 = "19" + tahun2;
        }

        System.out.println(intTanggal[0] + " " + konversiBulan(intTanggal[1]) + " " + tahun2);

        scanner.close();
    }

    public static String konversiBulan(int angka) {
        switch (angka) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "";
        }
    }
}
