import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread{
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(){}

    public Typer(String botName, double wpm, TypeRacer typeRacer){
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName){
        this.botName = botName;
    }

    public void setWpm(int wpm){
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped){
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped(){
        return wordsTyped;
    }

    public String getBotName(){
        return botName;
    }

    public double getWpm(){
        return wpm;
    }

    @Override
    public void run(){
        String[] wordToType = typeRacer.getWordsToType().split(" ");

        //(1)
        double howLongToType = (60/getWpm()) * 1000;
        double totalKata = 0;

        //(2)
        for(String word:wordToType){
            try {
                Thread.sleep((int)howLongToType); 
                addWordTyped(word);
                totalKata += 1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("(selesai)");

        //(3)
        double waktuFinish = ((60/getWpm()) * totalKata);
        Result result = new Result(this.getBotName(), (int) waktuFinish);
        typeRacer.addResult(result);
    }

}


class Result{
    private String name;
    private int finishTime;

    public Result(String name, int finishTime){
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName(){
        return name;
    }

    public void setName(String racerName){
        this.name = racerName;
    }

    public int getFinishTime(){
        return finishTime;
    }

    public void setFinishTime(int racerTime){
        this.finishTime = racerTime;
    }
}


class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType(){
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant(){
        return raceContestant;
    }

    private String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya ","Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang ","Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik ","Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita ","Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas ","Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna ","Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka ","Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri ","Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain ","Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai "};

    public void setNewWordsToType(){
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    //(4)
    public void addResult(Result result){
        raceStanding.add(result);
    }

    private void printRaceStanding(){
        System.out.println("Klasemen Akhir Type Racer");
        System.out.println("===========================");

        //(5)
        for(int i = 0;i < raceStanding.size();i++){
            System.out.println((i+1) +". " + raceStanding.get(i).getName() + " = " + raceStanding.get(i).getFinishTime() +" detik");
        }
    }

    public void startRace(){
        //(6)
        for(Typer typer : raceContestant){
            typer.start();
        }

        //(7)
        boolean loop = true;
        int yangSudahFinish = 0;
        while(loop){
            try {
                Thread.sleep(2000);
                System.out.println("Typing Progress ...");
                System.out.println("================");
                for(int i = 0;i < raceContestant.size();i++){
                    System.out.println("- " + raceContestant.get(i).getBotName() + "\t=> " + raceContestant.get(i).getWordsTyped());
                }
                System.out.println();

                for(Typer typer : raceContestant){
                    if(typer.getWordsTyped().endsWith("(selesai) ")){
                        yangSudahFinish += 1;
                    }
                }
                if(yangSudahFinish == raceContestant.size()){
                    loop = false;
                }else{
                    yangSudahFinish = 0;
                }
            } catch (Exception e) {}  
        }

        //(8)
        printRaceStanding();
    }
}


public class No2 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("||  Text to Typer  ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot ToKu", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}