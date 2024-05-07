package No2;
public class Product {
    String brand;
    int seriesNumber;
    double price; 

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Brand \t\t: " + this.getBrand());
        System.out.println("Serial Number \t: " + this.getSeriesNumber());
        System.out.println("Price \t\t: $" + this.getPrice());
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getSeriesNumber() {
        return seriesNumber;
    }
    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Camera extends Product{
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution \t: " + this.getResolution() + "MP");
        System.out.println("Lens Type  \t: " + this.getLensType());
    }

    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getLensType() {
        return lensType;
    }
    public void setLensType(String lensType) {
        this.lensType = lensType;
    }
}

class Laptop extends Product{
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Processor Type \t: " + this.getProcessorType());
        System.out.println("RAM Size \t: " + this.getRamSize() + "GB");
    }



    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }
    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}

class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size \t: " + this.getScreenSize() + " inches");
        System.out.println("Storage Capacity: " + this.getStorageCapacity() + "GB");
    }

    // public static void runSmartphone(String brand, int seriesNumber, double price) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Masukkan ukuran layar (inci) \t\t: ");
    //     double inSize = sc.nextDouble();
    //     sc.nextLine();
    //     System.out.print("Masukkan kapasitas penyimpanan (GB) \t: ");
    //     int inCapacity = sc.nextInt();
    //     sc.nextLine();

    //     Smartphone smartphone = new Smartphone(brand, seriesNumber, price, inSize, inCapacity);

    //     smartphone.addProduct(smartphone);
        
    //     sc.close();
    // }

    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}