package TP5_1_H071231072.StockBarang;

public class Product {
    String brand;
    int seriesNumber;
    double price;

    public String getBrand() {
        return brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    void displayInfo() {
        System.out.println("\nbrand               : " + this.brand);
        System.out.println("series number       : " + this.seriesNumber);
        System.out.println("price               : $" + this.price);
    }
}
class SmartPhone extends Product{
    double screenSize;
    int storageCapacity;

    public SmartPhone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("screen size         : " + this.screenSize + " inches");
        System.out.println("storage capacity    : " + this.storageCapacity);
    }
}
class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lenstype) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.resolution = resolution;
        this.lensType = lenstype;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("resolution          : " + this.resolution + "MP");
        System.out.println("lens type           : " + this.lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processosrType) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.ramSize = ramSize;
        this.processorType = processosrType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("ram size            : " + this.ramSize + "gb");
        System.out.println("processor type      : " + this.processorType);
    }
}
