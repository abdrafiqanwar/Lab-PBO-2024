 class Cuboid {
     double height;
     double width;
    double length;

    public double getVolume() {
        return height * width * length;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
}

public class TP2_03_H071231072{

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.setHeight(3);
        cuboid.setWidth(30);
        cuboid.setLength(50);
        System.out.printf("Volume = %.2f%n", cuboid.getVolume());
    }
}