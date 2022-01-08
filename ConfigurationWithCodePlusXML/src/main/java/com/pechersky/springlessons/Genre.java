package com.pechersky.springlessons;

public enum Genre {
    CLASSICAL(1),
    ROCK(2);

    private int id;

    Genre(int id) {
        this.id = id;
    }
}
