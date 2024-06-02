package TP8_1_H071231093;

import java.util.Random;

public class TaskTimeHelper {
    static int randomNumber(){
        Random randomNum = new Random();
        int rnum = randomNum.nextInt(7);
        return rnum;
    }
}
