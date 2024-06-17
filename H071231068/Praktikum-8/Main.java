package TP8;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static final int jumlahDataSumber = 4;
    public static int dataBerhasilDimuat = 0;
    public static int dataGagalDimuat = 0;
    public static final int MAX_THREAD_POOL = 3;

    public static void main(String[] args) {
        Thread ui = new Thread(new UIThread());
        ui.start();
    }
}

class UIThread implements Runnable {
    private static int waktuEksekusi = 0;

    @Override
    public void run() {
        System.out.println("Start load " + Main.jumlahDataSumber + " Data");

        ExecutorService executor = Executors.newFixedThreadPool(Main.MAX_THREAD_POOL);
        AtomicInteger counter = new AtomicInteger(0);

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < Main.jumlahDataSumber; i++) {
            executor.execute(new BackgroundThread(counter));
        }

        // Menunggu semua thread selesai
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        long endTime = System.currentTimeMillis();
        waktuEksekusi = (int) ((endTime - startTime) / 1000);

        // hasil
        System.out.println("Task Finish");
        System.out.println("Time Execution : " + waktuEksekusi + "s");
        if (Main.dataBerhasilDimuat == Main.jumlahDataSumber) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(
                    Main.dataBerhasilDimuat + " Data Successfully loaded & " + Main.dataGagalDimuat
                            + " Data failed to load");
        }
    }
}

class BackgroundThread implements Runnable {

    public final AtomicInteger counter;

    public BackgroundThread(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            // Mensimulasikan durasi tugas dengan waktu tidur acak
            int waktuTidur = 1000 * TaskTimeHelper.angkaRandom();
            Thread.sleep(waktuTidur);

            // Jika tugas memakan waktu lebih dari 4 detik, dianggap timeout
            if (waktuTidur > 4000) {
                System.out.println("Request Timeout");
                synchronized (Main.class) {
                    Main.dataGagalDimuat++;
                }
            } else {
                // Menambah jumlah data yang berhasil dimuat secara aman
                synchronized (Main.class) {
                    Main.dataBerhasilDimuat++;
                }
                System.out.printf("Loading... (%ds)\n", waktuTidur / 1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class TaskTimeHelper {

    public static int angkaRandom() {
        return new Random().nextInt(6) + 1;
    }
}
