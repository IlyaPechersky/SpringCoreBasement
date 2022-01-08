package com.pechersky.springlessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music rockMusic;
    private Music classicalMusic;

    // IoC
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public MusicPlayer() {
    }

    public String playMusic(Genre genre) {
        Random random = new Random();
        return "playing " +
                (genre.equals(Genre.ROCK) ? rockMusic.getSong(random.nextInt(3)) :
                        classicalMusic.getSong(random.nextInt(3)));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
