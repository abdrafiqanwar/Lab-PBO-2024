import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Comparator;

public class TP8 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to type ||");
        System.out.println("\n===============\n");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");
        System.out.print("\nTyping progress ");

        for (int i = 1; i <= 3; i++) {

            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot ToKu", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}

class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
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

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        // TODO 1
        long howLongToType = (long) ((60000 / wpm)); // waktu dalam milisecond untuk mengetik satu kata

        // TODO 2
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addWordsTyped(word);
        }

        this.addWordsTyped("(selesai)");

        // TODO 3
        int finishTime = (int) howLongToType * wordsToType.length / 1000;
        Result result = new Result(botName, finishTime);
        typeRacer.addToRaceStanding(result); // waktu
                                             // selesai
                                             // dalam
                                             // detik

    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    private String[] wordToTypeList = {
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
            "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
    };

    void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordToTypeList[angkaRandom];
    }

    // TODO 4
    synchronized void addToRaceStanding(Result result) {
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        // TODO 5
        // raceStanding.sort((r1, r2) -> Integer.compare(r1.getFinishTime(),
        // r2.getFinishTime()));

        // Mencetak klasemen akhir
        int posisi = 1;
        for (Result result : raceStanding) {
            System.out.println(posisi + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
            posisi++;
        }
    }

    void startRace() {
        // TODO 6
        for (Typer typer : raceContestant) {
            typer.start();
        }

        // TODO 7
        boolean raceFinished = false;
        while (!raceFinished) {
            raceFinished = true;
            // System.out.println("|| Text to type ||");
            // System.out.println("\n===============\n");

            for (Typer typer : raceContestant) {

                System.out.printf("- %s\t => %s\n", typer.getBotName(), typer.getWordsTyped());
                if (typer.isAlive()) {
                    raceFinished = false;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // TODO 8
        printRaceStanding();
    }
}
