import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

class TaskTimeHelper {
    public static int waktuRandom(){
        Random angkaRandom = new Random();
        int angka = angkaRandom.nextInt(6) + 1;
        return angka;
    }
}

class Task extends No1 implements Runnable{
    int time;
    int time2; //Untuk Thread yang meload 2 Data

    public Task(int time){
        this.time = time;
    }
    public Task(int time , int time2){ // untuk Thread yang meload 2 Data
        this.time = time;
        this.time2 = time2;
    }

    @Override
    public void run() {
            try {
                Thread.sleep(this.time*1000);
                done = done + 1;
                if(this.time >= 4){
                    System.out.println("Request Timeout " + "(" + this.time + "s)");
                    failed = failed + 1;
                }
                if(this.time2 > 0){ // untuk Thread yang meload 2 data
                    Thread.sleep(this.time2*1000);
                    done = done + 1;
                    if(this.time2 >= 5){
                        System.out.println("Request Timeout " + "(" + (this.time2 + this.time) + "s)");
                        failed = failed + 1;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }        
    } 
}

class UiThread extends No1 implements Runnable{
    int detik;

    @Override
    public void run(){
        System.out.println("Start load 4 Data");
        for(int i = 1; i <= 12; i++ ){
            try {
                Thread.sleep(1000);
                System.out.println("Loading... (" + i + "s)");
                    if(done == 4){
                        detik = i;
                        break;
                    }
                }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Task Finish.");
        System.out.println("Time Execution : "+ detik +"s");
        if(failed >= 1){
            System.out.println((4 - failed) + " Data Successfully loaded & " + failed + " Data failed to load");
        }else{
            System.out.println("All data is successfully loaded");
        }
    }
}

public class No1 extends TaskTimeHelper{
    static int failed;
    static int done;
    public static void main(String[] args) {
        Task task1 = new Task(waktuRandom() , waktuRandom());
        Task task2 = new Task(waktuRandom());
        Task task3 = new Task(waktuRandom());
        System.out.println("Task 1(1) : " + task1.time);
        System.out.println("Task 1(2) : " + task1.time2);
        System.out.println("Task 2    : " + task2.time);
        System.out.println("Task 3    : " + task3.time);
        System.out.println();

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(new UiThread());
        // executor.submit(new Task(waktuRandom(), waktuRandom()));
        // executor.submit(new Task(waktuRandom()));
        // executor.submit(new Task(waktuRandom()));
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
    }
}