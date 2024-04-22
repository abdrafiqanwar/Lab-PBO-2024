public class main {

    public static void main(String[] args) {
    Laptop laptop1 = new Laptop(4.5, 4,"Lenovo","intel i3");
    Laptop laptop2 = new Laptop(4.7, 8, "Asus", "intel i7" );

    laptop1.showSpec(); 
    System.out.println("================================================");
    laptop2.showSpec();
    System.out.println("================================================");
    laptop1.compare(laptop2);

    laptop1.upgradeRam(12);
    laptop1.showSpec();
    laptop1.compare(laptop2);

}

}