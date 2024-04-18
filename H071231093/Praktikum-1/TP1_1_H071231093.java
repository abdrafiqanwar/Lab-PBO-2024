import java.util.Scanner;

class TP1_1_H071231093 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan bilangan : ");
        int n = inputan.nextInt();
        inputan.nextLine();

        int BilanganBulat = 0;
        int BilanganDesimal = 0;

        System.out.print("Masukan  " + n + " Bilangan : ");
        String bilangan = inputan.nextLine();
        String[] angka = bilangan.split(" ");

        inputan.close();

        for (String angkaBaru : angka){
            try {
                double ang = Double.parseDouble(angkaBaru);
                if (ang == (int) ang) {
                    BilanganBulat++;
                } else {
                    BilanganDesimal++;
                }
            } catch (Exception e) {
                System.out.println("input harus berupa angka. Coba lagi!");
            } 
        }
        
        System.out.println("=================================");
        System.out.println(BilanganBulat + " Bilangan Bulat");
        System.out.println(BilanganDesimal + " Bilangan Desimal");
    }
}