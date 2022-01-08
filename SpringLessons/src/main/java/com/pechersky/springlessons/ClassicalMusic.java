package com.pechersky.springlessons;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> musics = List.of(
            "Hungarian rhapsody",
            "Russian walts",
            "Swan lake"
    );

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong(int idx) {
        return musics.get(idx);
    }
}
