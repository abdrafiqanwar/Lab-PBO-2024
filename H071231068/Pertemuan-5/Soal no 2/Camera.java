package TP5.NO2;

class Camera extends Product {
	int resolution;
	String lensType;

	Camera(String brand, int seriesNumber, double price, int resolution, String lensType) {
		super(brand, seriesNumber, price);
		this.resolution = resolution;
		this.lensType = lensType;
	}

	public int getResolution() {
		return resolution;
	}

	public String getLensType() {
		return lensType;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Resolution : " + this.getResolution() +"MP");
		System.out.println("Lens Type : " + this.getLensType());
	}
}


