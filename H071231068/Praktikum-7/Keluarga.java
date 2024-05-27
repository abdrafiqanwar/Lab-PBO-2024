package TP7;

class Keluarga {
    private String jumlahAnak;
    private int statuss;

    public Keluarga(String jumlahAnak, int statuss) {
        this.jumlahAnak = jumlahAnak;
        this.statuss = statuss;
    }

    public String getJumlahAnak() {
        return jumlahAnak;
    }

    public int getStatusKeluarga() {
        return statuss;
    }
}
