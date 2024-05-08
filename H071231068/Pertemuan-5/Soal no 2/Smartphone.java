package TP5.NO2;

class Smartphone extends Product {
	double screenSize;
	int storageCapacity;

	Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity) {
		super(brand, seriesNumber, price);
		this.screenSize = screenSize;
		this.storageCapacity = storageCapacity;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Screen Size : " + this.screenSize + "inches");
		System.out.println("Storage Capacity : " + this.storageCapacity +"GB");
	}

}
