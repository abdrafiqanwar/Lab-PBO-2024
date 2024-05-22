package TP8_1_H071231093;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UIThread implements Runnable {
    public static int data_sumber = 4;
    public static int waktu_eksekusi = 0;
    public static int data_yang_belum_selesai = 0;
    public static int data_yang_sudah_selesai = 0;

    @Override
    public void run() {
        ExecutorService executor = Executors.newFixedThreadPool(3);


        System.out.println("Start Load " + data_sumber + " Data");

        for (int i = 0; i < data_sumber; i++) {
            Runnable task = new ThreadList();
            executor.execute(task);
        }

        executor.shutdown();


        while (!executor.isTerminated()) {
            try {
                Thread.sleep(1000);
                waktu_eksekusi++;
                System.out.printf("Loading...  (%ds)\n", UIThread.waktu_eksekusi);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }


        System.out.println("Task Finish");
        System.out.println("Time Execution : " + waktu_eksekusi +"s");

        
        if (data_yang_sudah_selesai == data_yang_belum_selesai) {
            System.out.println("All Data Is Successfully Loaded");
        } else {
            System.out.println(data_yang_sudah_selesai +" Successfully Loaded & " + data_yang_belum_selesai + " Data Failed To Load");
        }
    }
}
