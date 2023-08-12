package GE.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private String name;
    private int volume;
    private Music music;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // IoC

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", music=" + music +
                '}';
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
