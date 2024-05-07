package TP5;

class BangunRuang{
    double volume;
    double luas;

    public void Volume() {

    }
}
class Kubus extends BangunRuang {
    double sisi;

    public void Luas() {
        luas = 6 * Math.pow(sisi,2);
    }

    public void Volume() {
        volume = Math.pow(sisi,3);
    }
}

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public void Luas() {
        luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public void Volume() {
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    double jariJari;

    public void Luas() {
        luas = 4 * Math.PI * Math.pow(jariJari,2);
    }

    public void Volume() {
        volume = (4.0 / 3) * Math.PI * Math.pow(jariJari,3);
    }
}

class Tabung extends BangunRuang {
    double jariJari, tinggi;

    public void Luas() {
        luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public void Volume() {
        volume = 2 * Math.PI * Math.pow(jariJari,3);
    }
}
