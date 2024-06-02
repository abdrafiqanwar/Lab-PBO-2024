package TP8_1_H071231093;

public class ThreadList implements Runnable {
  
    @Override
    public void run() {
        try {
            int sleepTime = 1000 * TaskTimeHelper.randomNumber();
            Thread.sleep(sleepTime);
            if (sleepTime > 4000) {
                System.out.println("Request Timeout");
                UIThread.data_yang_belum_selesai++;
                return;
            }
            synchronized (UIThread.class) {
                UIThread.data_yang_sudah_selesai++;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
