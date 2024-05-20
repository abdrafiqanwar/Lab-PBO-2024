package No2;

class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typerRacer;
    
    public Typer(String botName, double wpm, TypeRacer typerRacer){
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typerRacer = typerRacer;
    }
    
    public void setBotName(String botName) {
        this.botName = botName;
    }
    
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    
    public void addWordType(String newWordsTyped){
        this.wordsTyped  += newWordsTyped + " ";
    }
    
    public String getWordsTyped() {
        return wordsTyped;
    }
    
    public String getBotName() {
        return botName;
    }
    
    public double getWpm() {
        return wpm;
    }
    
    @Override
    public void run(){
        String [] wordsToTyper = typerRacer.getWordsToType().split(" ");
        //todo 1  Buatlah variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond

        int howLongToType = 0; //menghitung jumlah kata 
        int kecepatan = (int) (60000 / wpm ); //Wktu tnda dlm milidetik antra pengetikan kata.

        //todo 2  Buatlah perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        for (String word : wordsToTyper){ //Simulasi Pengetikan Kata
            try {
                Thread.sleep(kecepatan);
                addWordType(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            howLongToType++;
        }
        
        this.addWordType("(Selesai)"); 
        
        //todo 3  Tambahkan typer yang telah selesai mengetik semua kata ke list typeRaceTabel yang ada di class typeRacer.
        
        Result result = new Result(botName, (kecepatan * howLongToType) / 1000);//Menghitung dan Menyimpan Hasil
        typerRacer.addResult(result);
    }
    
}

