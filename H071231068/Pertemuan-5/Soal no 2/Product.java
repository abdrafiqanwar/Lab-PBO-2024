package TP5.NO2;

public class Product {
    String brand;
    int seriesNumber;
    double price;

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Serial Number : " + seriesNumber);
        System.out.println("Price : " + String.format("$%.2f", price));
    }
}



