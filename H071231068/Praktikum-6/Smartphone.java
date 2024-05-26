package TP6;

class Smartphone implements Void1{
    

    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
        System.out.println("-------------------------");
    }
}




