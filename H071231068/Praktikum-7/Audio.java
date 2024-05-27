

package TP7;
import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
class Audio {

    private Clip clip;

    public void playWelcomAudio(String welcome) {

        try {

            File audioFile = new File(welcome);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Gagal memutar audio: " + e.getMessage());
        }

    }

    public void playRejectAudio(String goodbye) {

        try {
            File audioFile = new File(goodbye);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Gagal memutar audio: " + e.getMessage());
        }

    }

    public void stopAudio() {

        if (clip != null) {

            clip.stop();

            clip.close();

        }

    }
}