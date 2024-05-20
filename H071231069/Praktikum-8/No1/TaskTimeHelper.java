package No1;

import java.util.Random; //utk mnghsilkn angk ack

public class TaskTimeHelper {
    protected static int getAngkaRandom() { //bsa dakses dri kls yg brada d pkt yg sm/subclass, tnpa prlu membuat instance dri TaskTimeHelper.
        return new Random().nextInt(6) + 1;
    }
}
