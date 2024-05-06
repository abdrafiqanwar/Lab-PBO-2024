import java.util.Scanner;

public class BangunDatar {

    double Luas, Keliling;

    double Luas() {
        return Luas;
    }
    double Keliling() {
        return Keliling;
    }
    public double getLuas() {
        return Luas;
    }
    public void setLuas(double luas) {
        Luas = luas;
    }
    public double getKeliling() {
        return Keliling;
    }
    public void setKeliling(double keliling) {
        Keliling = keliling;
    }

}

class Lingkaran extends BangunDatar {
    double r;
    // final double pi = Math.PI;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public Lingkaran(double r) {
        this.setR(r);
    }

    double hitungLuas() {
        double luas = Math.PI * Math.pow(this.getR(),2);
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * Math.PI * this.getR();
        return keliling;
    }

    public static void runLingkaran() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " LINGKARAN " + "=".repeat(14));
        System.out.print("Masukkan jari-jari lingkaran: ");
        int inR = sc.nextInt();

        Lingkaran lingkaran = new Lingkaran(inR);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        sc.close();
    }


}

class Persegi extends BangunDatar{

    double sisi;
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public Persegi(double sisi) {
        this.setSisi(sisi);
    }
    double hitungLuas() {
        double luas = Math.pow (this.getSisi() , 2 ); //pangkat
        return luas;
    }
    double hitungKeliling() {
        double keliling = 4 * this.getSisi();
        return keliling;
    }

    public static void runPersegi() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " PERSEGI " + "=".repeat(16));
        System.out.print("Masukkan sisi persegi: ");
        int inSisi = sc.nextInt();

        Persegi persegi = new Persegi(inSisi);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        sc.close();
    }

}

class PersegiPanjang extends BangunDatar{

    double panjang, lebar;
    
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public PersegiPanjang(double panjang, double lebar) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
    }


    double hitungLuas() {
        double luas = this.getPanjang() * this.getLebar();
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * (this.getPanjang() + this.getLebar());
        return keliling;
    }

    public static void runPersegiPanjang() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " PERSEGI PANJANG " + "=".repeat(17));
        System.out.print("Masukkan panjang persegi panjang: ");
        int inPanjang = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        int inLebar = sc.nextInt();

        PersegiPanjang persegiPanjang = new PersegiPanjang(inPanjang, inLebar);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        sc.close();
    }

}

class Trapesium extends BangunDatar{
    
    double sisi, alas, tinggi;
    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getSisi() {
        return sisi;
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    private double sisi2, sisi3;

    public Trapesium(double alas, double sisi1, double sisi2, double sisi3, double tinggi) {
        this.setAlas(alas);
        this.setSisi(sisi1);
        this.setSisi2(sisi2);
        this.setSisi3(sisi3);
        this.setTinggi(tinggi);
    }

    public double getSisi2() {
        return sisi2;
    }
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    double hitungLuas() {
        double luas = (this.getAlas() + this.getSisi2()) / 2 * this.getTinggi();
        return luas;
    }

    double hitungKeliling() {
        double keliling = this.getAlas() + this.getSisi() + this.getSisi2() + this.getSisi3();
        return keliling;
    }

    public static void runTrapesium() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " TRAPESIUM " + "=".repeat(14));
        System.out.print("Masukkan alas trapesium: ");
        int inAlas = sc.nextInt();
        System.out.print("Masukkan sisi 1 trapesium: ");
        int inSisi1 = sc.nextInt();
        System.out.print("Masukkan sisi 2 trapesium: ");
        int inSisi2 = sc.nextInt();
        System.out.print("Masukkan sisi 3 trapesium: ");
        int inSisi3 = sc.nextInt();
        System.out.print("Masukkan tinggi trapesium: ");
        int inTinggi = sc.nextInt();

        Trapesium trapesium = new Trapesium(inAlas, inSisi1, inSisi2, inSisi3, inTinggi);

        System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
        System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());

        sc.close();
    }

} 



