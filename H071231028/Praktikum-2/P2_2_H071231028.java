

class Produk {
    String id , nama;
    boolean stok;
    int harga;

    void checkProduct() {
        System.out.println("ID Produk \t: " + this.id);
        System.out.println("Nama Produk \t: " + this.nama);
        System.out.print("Stok \t\t: ");
        System.out.println(this.stok ? "Ada" : "Tidak Ada");
        System.out.println("Harga \t\t: Rp. " + this.harga);
    }

    String checkStock() {
        if (this.stok) {
            return "Produk " + this.nama + " tersedia di stok";
        } else {
            return "Produk " + this.nama + " lagi tidak tersedia di stok";
    }
    }
}

public class P2_2_H071231028 {
    public static void main(String[] args) {
        Produk food = new Produk();

        food.id = "M1";
        food.nama = "Coto Makassar";
        food.stok = false;
        food.harga = 25000;
        
        food.checkProduct();
        System.out.println("\n" + food.checkStock() + "\n");

        Produk drink = new Produk();
        
        drink.id = "D2";
        drink.nama = "Lemon Tea";
        drink.stok = true;
        drink.harga = 5000;
        
        drink.checkProduct();
        System.out.println("\n" + drink.checkStock());
    }
}
    

