import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound {
    // public static void main(String[] args) {
    //     // Accept("/Users/ervinhsn/Documents/JavaProjects/Sound/violin-lose-4-185125.wav");
    //     Accept("/Users/ervinhsn/Documents/JavaProjects/Sound/tadaa-47995.wav");
    // }
    public static void Accept(String audioFile) {
        File file = new File(audioFile);

        Clip clip = null;
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
        } catch (Exception e){
            e.printStackTrace();
        }

        if (clip != null) {
            clip.start();
            while (!clip.isRunning()) {
                // Menunggu hingga klip dimulai
                Thread.yield();
            }
            while (clip.isRunning()) {
                // Menunggu hingga klip selesai
                Thread.yield();
            }
            clip.close();
        }
    }
    
}
