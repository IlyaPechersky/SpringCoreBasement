package com.pechersky.springlessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic music1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusicBean", ClassicalMusic.class);

        music1.getSong();
        music2.getSong();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
