import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class no1tp8 {

}

class BackgroundThread implements Runnable {
    protected static int failedLoaded = 0; //menyimpn jumlah permintaan ggl

    @Override
    public void run() {
        int time = TaskTimeHelper.getAngkaRandom();

        try {
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("Request Timeout");
                incrementFailedLoaded();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void incrementFailedLoaded() {
        failedLoaded++;
    }

    public synchronized static int getFailedLoaded() {
        return failedLoaded;
    }
}

class TaskTimeHelper {
    protected static int getAngkaRandom() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}

class UiThread {
    protected void mulai(int jumlahData) {
        System.out.println("Start load " + jumlahData + " Data.");
    }

    protected void checkData(int detik) {
        System.out.println("Loading...(" + detik + "s)");
    }

    protected void taskFinish(int detik, int berhasil, int gagal) {
        if (gagal > 0) {
            System.out.println("Task Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println(berhasil + " Data Successfully Loaded & " + gagal + " Data failed to load.");
        } else {
            System.out.println("Task Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println("All data is successfully loaded");
        }
    }
}

class Main {
    static int jumlahData = 4;
    static UiThread uiThread = new UiThread();

    public static void main(String[] args) {
        uiThread.mulai(jumlahData);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < jumlahData; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.checkData(totalTime);
            }
            int failedLoaded = BackgroundThread.getFailedLoaded();
            uiThread.taskFinish(totalTime, jumlahData - failedLoaded, failedLoaded);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
