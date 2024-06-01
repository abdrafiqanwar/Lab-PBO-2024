import java.util.Scanner;

abstract class BangunRuang {
    String nama;
    double luas;
    double volume;
    Scanner scanner = new Scanner(System.in);

    public BangunRuang(String nama) {
        this.nama = nama;
    }

    void displayRuang() {
        System.out.println("--------------------------------");
        System.out.println("Area: " +nama + " : " + luas);
        System.out.println("Volume : " + nama +" : " + volume);
        System.out.println("--------------------------------");
    }
}

class Kubus extends BangunRuang {
    double sideLength;

    public Kubus() {
        super("Kubus");
    }

    void hitungBangun() {
        System.out.print("Enter side length: ");
        sideLength = scanner.nextDouble();
        luas = 6 * Math.pow(sideLength, 2);
        volume = Math.pow(sideLength, 3);
    }
}

class Balok extends BangunRuang {
    double length, width, height;

    public Balok() {
        super("Balok");
    }

    void hitungBangun() {
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        luas = 2 * (length * width + length * height + width * height);
        volume = length * width * height;
    }
}

class Bola extends BangunRuang {
    double radius;

    public Bola() {
        super("Bola");
    }

    void hitungBangun() {
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        luas = 4 * Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Tabung extends BangunRuang {
    double radius, height;

    public Tabung() {
        super("Tabung");
    }

    void hitungBangun() {
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        luas = 2 * Math.PI * radius * (radius + height);
        volume = Math.PI * Math.pow(radius, 2) * height;
    }
}

abstract class BangunDatar {
    String nama;
    double luas;
    double Keliling;
    Scanner scanner = new Scanner(System.in);

    public BangunDatar(String nama) {
        this.nama = nama;
    }


    void display() {
        System.out.println("--------------------------------");
        System.out.println("Luas" + nama +" : "+luas);
        System.out.println("keliling  "+ nama +" : " + Keliling);
        System.out.println("--------------------------------");
    }
}

class Persegi extends BangunDatar {
    double sideLength;

    public Persegi() {
        super("Persegi");
    }

    void hitungBangun() {
        System.out.print("Enter side length: ");
        sideLength = scanner.nextDouble();
        luas = Math.pow(sideLength, 2);
        Keliling = 4 * sideLength;
    }
}

class PersegiPanjang extends BangunDatar {
    double length, width;

    public PersegiPanjang() {
        super("Persegi Panjang");
    }

    void hitungBangun() {
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        luas = length * width;
        Keliling = 2 * (length + width);
    }
}

class Lingkaran extends BangunDatar {
    double radius;

    public Lingkaran() {
        super("Lingkaran");
    }

    void hitungBangun() {
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        luas = Math.PI * Math.pow(radius, 2);
        Keliling = 2 * Math.PI * radius;
    }
}

class Trapesium extends BangunDatar {
    double side1, side2, side3, side4, height;

    public Trapesium() {
        super("Trapesium");
    }

    void hitungBangun() {
        System.out.print("Enter side 1: ");
        side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        side3 = scanner.nextDouble();
        System.out.print("Enter side 4: ");
        side4 = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        luas = 0.5 * (side1 + side3) * height;
        Keliling = side1 + side2 + side3 + side4;
    }
}

public class TP5_1_H071231088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("====== BANGUN RUANG ======");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG ");
            System.out.println("====== BANGUN DATAR ======");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("9. Keluar");
            garis();

            System.out.print("Pilihan : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Kubus a = new Kubus();
                    a.hitungBangun();
                    a.displayRuang();
                    break;
                case 2:
                    Balok b = new Balok();
                    b.hitungBangun();
                    b.displayRuang();
                    break;
                case 3:
                    Bola c = new Bola();
                    c.hitungBangun();
                    c.displayRuang();
                    break;
                case 4:
                    Tabung d = new Tabung();
                    d.hitungBangun();
                    d.displayRuang();
                    break;
                case 5:
                    Persegi e = new Persegi();
                    e.hitungBangun();
                    e.display();
                    break;
                case 6:
                    PersegiPanjang f = new PersegiPanjang();
                    f.hitungBangun();
                    f.display();
                    break;
                case 7:
                    Lingkaran g = new Lingkaran();
                    g.hitungBangun();
                    g.display();
                    break;
                case 8:
                    Trapesium h = new Trapesium();
                    h.hitungBangun();
                    h.display();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        scanner.close();
    }

    static void garis() {
        System.out.println("===========================");
    }
}
