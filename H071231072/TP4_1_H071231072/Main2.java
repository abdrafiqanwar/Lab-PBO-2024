package TP4_1_H071231072;

public class Main2 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile() ;
        mobile.setMerk ("ayla");
        mobile.setHarga(100000);
        mobile.setModel("terbaru");
        mobile.setTahunProduksi(2020);
        mobile.setDeskripsi("tidak ada");
        mobile.displayInfo();
        
        Mobile mobile2 = new Mobile("ayla","terbaru",10000 ,2021 ,"tidak ada");
        System.out.println("merk            : " + mobile2.getMerk());
        System.out.println("tahunProduksi   : " + mobile2.getHarga());
        System.out.println("model           : " + mobile2.getModel());
        System.out.println("tahunProduksi   : " + mobile2.getTahunProduksi());
        System.out.println("Deskripsi       :  " + mobile2.getDeskripsi());
        selfUtils.displaySelfData();
    
        

    }

    

}
