package Mobile;
public class Main {
    public static void main(String[] args) {
        Mobile mobile1 =  new Mobile();
        mobile1.setMerk(  "Samsung");
        mobile1.setModel("Galaxy");
        mobile1.setHarga(3000000);
        mobile1.setDeskripsi("Bagus");
        mobile1.setTahunProduksi(2021);
        
        mobile1.displayInfo();
        Mobile mobile2 = new Mobile();
        mobile2.setMerk("oppo");
        mobile2.setModel("Oppo");
        mobile2.setHarga(2500000);
        mobile2.setDeskripsi("keren");
        mobile2.setTahunProduksi(2020);

        System.out.println("Informasi Mobile2");
        System.out.println("Merk :" + mobile2.getMerk());
        System.out.println("Model : " + mobile2.getModel());
        System.out.println("Deskripsi :" + mobile2.getDeskripsi());
        System.out.println("harga" + mobile2.getHarga());
        System.out.println("TahunProduksi"+ mobile2.getTahunProduksi());
    
        SelfUtils.displaySelfData();
    }
}

