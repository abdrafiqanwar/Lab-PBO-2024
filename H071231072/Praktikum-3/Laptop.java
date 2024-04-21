public class Laptop {
    double processorSpeed;
    int  ramSize;
    NamaLaptop laptop = new NamaLaptop() ;
    public Laptop(){
    }
    public Laptop(double processorSpeed){
        this.processorSpeed = processorSpeed;
    }
    public Laptop(double processorSpeed, int ramSize){
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
    }
    public Laptop(double processorSpeed,int ramSize,String typeLaptop){
        this.processorSpeed = processorSpeed;
        this.ramSize =ramSize;
        this.laptop.type = typeLaptop;
    }
    public Laptop (double processorSpeed,int ramSize,String typeLaptop,String processorLaptop){
        this.processorSpeed = processorSpeed;
        this.ramSize = ramSize;
        this.laptop.type = typeLaptop ;
        this.laptop.processor= processorLaptop;
    }

    public void showSpec () {
        System.out.println("Nama laptop             :"+ laptop.gettype());
        System.out.println("ram                     :"+ getRamSize());
        System.out.println("processor               :" + laptop.getprocessor());
        System.out.println("kecepatan processor     :"+ getProcessorSpeed());
    }
    public void compare (Laptop quality){
        System.out.println(this.laptop.gettype()+ " Compare " + quality.laptop.gettype());
        if (this.getProcessorSpeed() > quality.getProcessorSpeed()){
            System.out.println(this.laptop.gettype()+ " lebih recommended");
        }else{
            System.out.println(quality.laptop.gettype()+ " lebih recommended");
        }
    }
    public void upgradeRam (int ramSize){
        this.ramSize += ramSize;
        this.processorSpeed += 0.15*ramSize ;


    }
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public int getRamSize() {
        return ramSize;
    }
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
}