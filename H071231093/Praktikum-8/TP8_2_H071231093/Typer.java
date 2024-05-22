package TP8_2_H071231093;

public class Typer extends Thread {
    private String botName,wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botname,double wpm, TypeRacer typeracer){
        this.botName = botname;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeracer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void setWordsTyped(String wordsTyped) {
        this.wordsTyped = wordsTyped;
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public TypeRacer getTypeRacer() {
        return typeRacer;
    }

    public void setTypeRacer(TypeRacer typeRacer) {
        this.typeRacer = typeRacer;
    }


    public void addWordTyped(String newWordsTyped){
        this.wordsTyped += newWordsTyped + " "; 
    }


    @Override
    public void run() {
        String[] wordToType = typeRacer.getWordsToType().split(" ");
    
        // TODO1
        long delay = (long) ((60.0 / wpm) * 1000);
        
        int totalKata = 0;
        
        // TODO2
        for (String word : wordToType) {
            addWordTyped(word);
            totalKata += 1;
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        this.addWordTyped("(selesai)");

        // TODO3
        int hasil = (int) ((60 / wpm) * totalKata);
        Result result = new Result(botName, hasil);
        typeRacer.addResult(result);
        
    }
}
