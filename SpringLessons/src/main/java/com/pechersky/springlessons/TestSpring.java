package com.pechersky.springlessons;

import java.util.LinkedList;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
