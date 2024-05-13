
public class Bangundatar {
    double hitungLuas() {
        return 0.0;
    }

    double hitungKeliling() {
        return 0.0;
    }
}

class Persegi extends Bangundatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    double hitungKeliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends Bangundatar{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    double hitungKeliling() {
        return 2 * panjang + 2 * lebar;
    }
}

class Lingkaran extends Bangundatar {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Trapesium extends Bangundatar {
    double a, b, c, h;

    public Trapesium(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double hitungLuas() {
        return 0.5 * (a+b) * h;
    }

    double hitungKeliling() {
        return a + b + 2 * c;
    }

}
