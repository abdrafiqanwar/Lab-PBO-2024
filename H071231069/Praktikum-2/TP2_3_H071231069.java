package TP2_H071231069;
class Cuboid {
    double height, widht, lenght;

    double getVolume() {
        
        double volume = lenght * widht * height;
        return volume;
    }
}

public class TP2_3_H071231069 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        
        cuboid.height = 10;
        cuboid.widht = 15;
        cuboid.lenght = 30;

        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
    }
}
