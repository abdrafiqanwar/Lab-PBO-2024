class NamaLaptop{
    String type;
    String processor;

    public NamaLaptop(){

    }
    public NamaLaptop(String type , String processor){
        this.type = type ;
        this.processor = processor;
    }

    public String gettype(){
        return type;
    }
    public String getprocessor(){
        return processor;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setProcessor(String Processor){
        this.processor = Processor;
    }
}