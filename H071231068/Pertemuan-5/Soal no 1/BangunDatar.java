package TP5;

class BangunDatar {
    double keliling;
    double luas;
    

    public void Keliling() {

    }
}

class Persegi extends BangunDatar {
    double sisi;

    public void Luas() {
        luas = Math.pow(sisi,2);
    }

    public void Keliling() {
        keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public void Luas() {
        luas = panjang * lebar;
    }

    public void Keliling() {
        keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;
    

    public void Luas() {
        luas = Math.PI * Math.pow(jariJari,2);
    }

    public void Keliling() {
        keliling = 2 * Math.PI * jariJari;
    }
}

class Trapesium extends BangunDatar {
    double a, b, c, d, tinggi; // A panjang atas, B panjang bawah, c panjang samping dan D panjang samping;

    public void Luas() {
        luas = (1.0 / 2) * (a + b) * tinggi;
    }

    public void Keliling() {
        keliling = a + b + c + d;
    }
}
