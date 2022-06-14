package main;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Sound {

    Clip clip;
    URL[] soundURL = new URL[30];

    public Sound() {
        soundURL[0] = getClass().getResource("/sound/eldenBeast.wav");
        soundURL[1] = getClass().getResource("/sound/pick.wav");
        soundURL[2] = getClass().getResource("/sound/drink.wav");
        //soundURL[3] = getClass().getResource("/sound/unlock.wav");
        //soundURL[4] = getClass().getResource("/sound/fanfare.wav");
        soundURL[5] = getClass().getResource("/sound/receivedDamage.wav");
        soundURL[6] = getClass().getResource("/sound/receivedDamage.wav");
        soundURL[7] = getClass().getResource("/sound/swingWeapon.wav");
        soundURL[8] = getClass().getResource("/sound/level.wav");
        soundURL[10] = getClass().getResource("/sound/burning.wav");
        soundURL[11] = getClass().getResource("/sound/fpUp.wav");
        soundURL[12] = getClass().getResource("/sound/died.wav");
        soundURL[13] = getClass().getResource("/sound/equip.wav");
        soundURL[14] = getClass().getResource("/sound/start.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {
            //
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }
}
