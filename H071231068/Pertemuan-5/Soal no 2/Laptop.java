package TP5.NO2;

class Laptop extends Product {
	int ramSize;
	String processorType;

	Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
		super(brand, seriesNumber, price);
		this.ramSize = ramSize;
		this.processorType = processorType;
	}

	public int getRamSize() {
		return ramSize;
	}

	public String getProcessorType() {
		return processorType;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Processor Type : " + this.processorType);
		System.out.println("RAM Size : " + this.ramSize + "GB");
	}

}

