package com.pechersky.springlessons;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String> musics = List.of(
            "Wind cries Mary",
            "Black in black",
            "Wind of change"
    );

    @Override
    public String getSong(int idx) {
        return musics.get(idx);
    }
}
