package No2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class TypeRacer {
    private String wordsToType; 
    private ArrayList<Typer> raceContestant = new ArrayList<>(); //berpartisipsi dlm blpn
    private ArrayList<Result> raceStanding = new ArrayList<>();  //utk menyimpn

    public String getWordsToType() {
        return wordsToType;
    }

    private String[] wordToTypeList = {
            "Menuju tak terbatas dan melampauinya",
            "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
            "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
            "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
            "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
            "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgengdan bermakna",
            "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
            "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
            "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
            "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    public void setNewWordToType() {// utk ngmbil tesk klimt d aats
        Random random = new Random();
        int angkaRandom = random.nextInt(10); //dari 1-10
        wordsToType = wordToTypeList[angkaRandom];
    }

    //todo 4  Buat method addResult yang mana digunakan untuk menambahkan typer yang telah selesai (mengetik semua kata), ke dalam list race standing
    public void addResult(Result result) {
        raceStanding.add(result); // Mnambhkn hsl blpan (Result) k dlm dftr raceStanding.
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");

        //todo 5  Tampilkan klasemen akhir dari kompetisi, dengan format
        for (int i = 0; i < raceStanding.size(); i++) {
            System.out.println(String.format("%d.%s = %d detik", i + 1, raceStanding.get(i).getName(),
                    raceStanding.get(i).getFinishTime())); 
        }
    }

    public void starRace() {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor1 = Executors.newSingleThreadExecutor();

        //todo 6 jalankan kompetisi
        for (Typer typer : raceContestant) {
            executor.execute(typer); //mnjlnkn
        }

        //todo 7 selama semua peserta belum selesai, maka tampilkan
        System.out.println("Typing Progress ... \n=================");
        boolean isAllTyperFinished = false;
        while (!isAllTyperFinished) {
            try {
                Thread.sleep(2000); // Menunggu 2 detik
                for (Typer ty : raceContestant) {
                    System.out.println(String.format("- %s \t\t=> %s", ty.getBotName(), ty.getWordsTyped()));
                }
                if (raceContestant.size() == raceStanding.size()) {
                    isAllTyperFinished = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        executor.shutdown();
        while (!executor.isTerminated()) { //menunggu
        }
        executor1.shutdown(); // seleesaipi

        //todo 8 Tampilkan race standing setelah semua typer selesai.
        printRaceStanding(); //

    }
}
