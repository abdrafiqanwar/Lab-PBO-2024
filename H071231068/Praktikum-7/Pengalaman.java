package TP7;

class Pengalaman extends Kehidupan {
    int pengalaman;

    public Pengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    @Override
    public void prosesKehidupan() {
        System.out.println("Memiliki pengalaman");
    }

    public void jenisPekerjaan() {
        if (this.pengalaman == 1) {
            System.out.println("Freelancer");
        } else if (this.pengalaman == 2) {
            System.out.println("Magang");
        } else if (this.pengalaman == 3) {
            System.out.println("Pekerja Tetap");
        } else if (this.pengalaman == 4) {
            System.out.println(" Tidak ada");
        } else {

        }
    }
    

}