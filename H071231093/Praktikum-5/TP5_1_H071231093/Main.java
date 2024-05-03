import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();printBarriers();
        System.out.println("-----BANGUN RUANG-----");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("-----BANGUN DATAR-----");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.println();printBarriers();
        System.out.print("Pilihan  : ");
        int pilihan = scanner.nextInt();
        System.out.println();printBarriers();
        

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus  : ");
                double sisiKubus = scanner.nextDouble();
                System.out.println();printBarriers();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas Kubus    : " + kubus.hitungLuasBangunRuang());
                System.out.println("Volume kubus  : " + kubus.hitungVolume());
                System.out.println();printBarriers();
                break;
            case 2:
                System.out.print("Masukkan panjang balok : ");
                double panjangB = scanner.nextDouble();
                System.out.print("Masukkan lebar balok   : ");
                double lebarB = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok  : ");
                double tinggiB = scanner.nextDouble();
                System.out.println();printBarriers();
                Balok balok = new Balok(panjangB, lebarB, tinggiB);
                System.out.println("Luas Balok  : " + balok.hitungLuasBangunRuang());
                System.out.println("Volume balok: " + balok.hitungVolume());
                System.out.println();printBarriers();
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola  : ");
                double jariJariBola = scanner.nextDouble();
                System.out.println();printBarriers();
                Bola bola = new Bola(jariJariBola);
                System.out.println("Luas Bola    : " + bola.hitungLuasBangunRuang());
                System.out.println("Volume bola  : " + bola.hitungVolume());
                System.out.println();printBarriers();
                break;
            case 4:
                System.out.print("Masukkan jari-jari alas tabung  : ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung  : ");
                double tinggiTabung = scanner.nextDouble();
                System.out.println();printBarriers();
                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("Luas tabung    : " + tabung.hitungLuasBangunRuang());
                System.out.println("Volume tabung  : " + tabung.hitungVolume());
                System.out.println();printBarriers();
                break;
            case 5:
                System.out.print("Masukkan sisi persegi  : ");
                double sisiPersegi = scanner.nextDouble();
                System.out.println();printBarriers();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi      : " + persegi.hitungLuas());
                System.out.println("Keliling persegi  : " + persegi.hitungKeliling());
                System.out.println();printBarriers();
                break;
            case 6:
                System.out.print("Masukkan panjang persegi panjang  : ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang    : ");
                double lebar = scanner.nextDouble();
                System.out.println();printBarriers();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.println("Luas persegi panjang      : " + persegiPanjang.hitungLuas());
                System.out.println("Keliling persegi panjang  : " + persegiPanjang.hitungKeliling());
                System.out.println();printBarriers();
                break;
            case 7:
                System.out.print("Masukkan jari-jari lingkaran  : ");
                double jariJari = scanner.nextDouble();
                System.out.println();printBarriers();
                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println("Luas lingkaran      : " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran  : " + lingkaran.hitungKeliling());
                System.out.println();printBarriers();
                break;
            case 8:
                System.out.print("Masukkan sisi 1 trapesium  : ");
                double a = scanner.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium  : ");
                double b = scanner.nextDouble();
                System.out.print("Masukkan sisi 3 trapesium  : ");
                double c = scanner.nextDouble();
                System.out.print("Masukkan tinggi trapesium  : ");
                double h = scanner.nextDouble();
                System.out.println();printBarriers();
                Trapesium trapesium = new Trapesium(a, b, c, h);
                System.out.println("Luas trapesium      : " + trapesium.hitungLuas());
                System.out.println("Keliling trapesium  : " + trapesium.hitungKeliling());
                System.out.println();printBarriers();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        scanner.close();
    }
    
    public static void printBarriers() {
        System.out.println("=============================================");
    }

}
