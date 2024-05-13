package TP6;

public class Main {
    public static void main(String[] args) {
        // Dog[] dogs = { new Pitbull(5, 9), new Siberian_Husky(4, 5), new Bulldog(7, 3), new GermanShepherd(2, 3) };

        // for (int i = 0; i < dogs.length; i++) {
        //     dogs[i].move();
        //     dogs[i].describe();
        // }
        Pitbull pitbull = new Pitbull(5, 2);
        pitbull.move();
        pitbull.describe();

        Siberian_Husky siberian_Husky = new Siberian_Husky(2, 1);
        siberian_Husky.move();
        siberian_Husky.describe();

        Bulldog bulldog = new Bulldog(6, 2);
        bulldog.move();
        bulldog.describe();

        GermanShepherd germanShepherd = new GermanShepherd(7, 1);
        germanShepherd.move();
        germanShepherd.describe();


        Car car = new Car(5, "Merah", 120);
        Smartphone iphone = new Smartphone(200000, "Apple");


        System.out.println("Spesifikasi mobil");
        System.out.println("Jumlah gigi         : " + car.totalForwardGear);
        System.out.println("Warna               : " + car.color);
        System.out.println("Kecepatan maksimal  : " + car.maxSpeed);
        car.move();


        System.out.println("Brand  : " + iphone.brand);
        System.out.println("Harga  : " + iphone.price);
        iphone.move();
    }
}

