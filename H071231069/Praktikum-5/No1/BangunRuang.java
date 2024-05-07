import java.util.Scanner;

public class BangunRuang {
    
    double Luas, Volume;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double luas) {
        Luas = luas;
    }

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }

    
}

    //double sisi, panjang, lebar, tinggi, r;

    //final double pi = 3.14159d;
//
    //double hitungLuasPermukaan() {
    //    double luasPermukaan = 0;
    //    return luasPermukaan;
    //}
//
    //double hitungVolume() {
    //    double volume = 0;
    //    return volume;
    //}
//
    //public double getSisi() {
    //    return sisi;
    //}
    //public void setSisi(double sisi) {
    //    this.sisi = sisi;
    //}
//
    //public double getPanjang() {
    //    return panjang;
    //}
    //public void setPanjang(double panjang) {
    //    this.panjang = panjang;
    //}
//
    //public double getLebar() {
    //    return lebar;
    //}
    //public void setLebar(double lebar) {
    //    this.lebar = lebar;
    //}
//
    //public double getTinggi() {
    //    return tinggi;
    //}
    //public void setTinggi(double tinggi) {
    //    this.tinggi = tinggi;
    //}
//
    //public double getR() {
    //    return r;
    //}
    //public void setR(double r) {
    //    this.r = r;
    //}
//
    //public double getPi() {
    //    return pi;
    //}
//
//

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

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

    public Balok(double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
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
}

class Bola extends BangunRuang {
    private double r; 

    public Bola(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    // Metode untuk mengatur nilai jari-jari bola
    public void setR(double r) {
        this.r = r;
    }

    // Metode untuk menghitung luas permukaan bola
    public double hitungLuasPermukaan() {
        double luasPermukaan = 4 * Math.PI * Math.pow(r,2);
        return luasPermukaan;
    }

    public double hitungVolume() {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }

    // Metode untuk menjalankan program pengujian untuk kelas Bola
    public static void runBola() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(17) + " BOLA " + "=".repeat(17));
        System.out.print("Masukkan jari-jari bola: ");
        double inR = sc.nextDouble();

        Bola bola = new Bola(inR);

        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());

        sc.close();
    }
}


class Kubus extends BangunRuang{
    double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public Kubus(double sisi) {
        this.setSisi(sisi);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 6 * Math.pow(this.getSisi(),2 );
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = Math.pow(this.getSisi(), 3);
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


}

class Tabung extends BangunRuang {
    double r, tinggi;

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
    

    public Tabung(double r, double tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = 2 * Math.PI * r * (r + tinggi);
        return luasPermukaan;
    }

    public double hitungVolume() {
        double volume = Math.PI * (r * r) * tinggi;
        return volume;
    }

    public static void runTabung() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " TABUNG " + "=".repeat(16));
        System.out.print("Masukkan jari-jari tabung: ");
        double inR = sc.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double inTinggi = sc.nextDouble();

        Tabung tabung = new Tabung(inR, inTinggi);

        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());

        sc.close();
    }




}

