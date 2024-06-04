

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;
    
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }
    public void setBotName(String botName) {
        this.botName = botName;
    }
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
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
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO (1)
        // long howLongToType = (int) ((60.0 / wpm) * 1000);
        long howLongToType = (long) (6000/wpm* wordsToType.length);

        // TODO (2)
        // long startTime = System.currentTimeMillis();
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                addWordsTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordsTyped("(Selesai)");
        // long finishTime = (System.currentTimeMillis() - startTime /10000);

        // TODO (3)
        // typeRacer.addResult(new Result(botName, wordsToType.length * (int) finishTime ));
        int finishTime = (int) howLongToType /100;
        Result result = new Result(botName, finishTime);
        typeRacer.addResult(result);
    }
}
