package TP5_1_H071231072.BangunDatarRuang;
import java.util.Scanner;
public class BangunRuang {
    // double  panjang, lebar, tinggi ;
    // double r,diamiter,volume ;
    // final double pi = 3.14159d;
    // luas permukan sama volume
    double luasPermukaan ,volume ;
    double hitungLuasPermukaan() {
        return luasPermukaan;
    }
    
    double hitungVolume() {
        return volume;
    }

    
    
}

class Balok extends BangunRuang{
    double panjang,lebar,tinggi;
    
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    double hitungLuasPermukaan() {
        double luasPermukaan = 2 * ((this.getPanjang() * this.getLebar()) + (this.getPanjang() * this.getTinggi()) + (this.getLebar() * this.getTinggi()));
        return luasPermukaan;
    }
    
    double hitungVolume() {
        double volume = this.getPanjang() * this.getLebar() * this.getTinggi();
        return volume;
    }
    
    public static void runBalok() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=".repeat(16) + " BALOK " + "=".repeat(17));
        System.out.print("Masukkan panjang balok: ");
        int inPanjang = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int inLebar = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int inTinggi = sc.nextInt();
        
        Balok balok = new Balok(inPanjang, inLebar, inTinggi);
        
        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + balok.hitungVolume());
        
        sc.close();
    }
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
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}

class Bola extends BangunRuang{
    double r;


    Bola(double r) {
        this.r = r;
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 4 * Math.PI * (this.getR() * this.getR());
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = 4/3 * Math.PI * (this.getR() * this.getR() * this.getR());
        return volume;
    }

    public static void runBola() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(17) + " BOLA " + "=".repeat(17));
        System.out.print("Masukkan jari-jari bola: ");
        int inR = sc.nextInt();

        Bola bola = new Bola(inR);

        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());
        
        sc.close();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}

class Kubus extends BangunRuang{
    double sisi;
    
    
    public Kubus(double sisi) {
        this.setSisi(sisi);
    }
    
    double hitungLuasPermukaan() {
        double luasPermukaan = 6 * (this.getSisi() * this.getSisi());
        return luasPermukaan;
    }
    
    double hitungVolume() {
        double volume = this.getSisi() * this.getSisi() * this.getSisi();
        return volume;
    }
    
    public static void runKubus() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=".repeat(16) + " KUBUS " + "=".repeat(17));
        System.out.print("Masukkan sisi kubus: ");
        int inSisi = sc.nextInt();
        
        Kubus kubus = new Kubus(inSisi);
        
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        
        sc.close();
    }
    
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}

class Tabung extends BangunRuang{
    double r, tinggi;

    public Tabung(double r, double tinggi) {
        this.setR(r);
        this.setTinggi(tinggi);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 2 * Math.PI * this.getR() * (this.getR() + this.getTinggi());
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = Math.PI * (this.getR() * this.getR()) * this.getTinggi();
        return volume;
    }

    public static void runTabung() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " TABUNG " + "=".repeat(16));
        System.out.print("Masukkan jari-jari tabung: ");
        int inR = sc.nextInt();
        System.out.print("Masukkan tinggi tabung: ");
        int inTinggi = sc.nextInt();

        Tabung tabung = new Tabung(inR, inTinggi);

        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        
        sc.close();
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}