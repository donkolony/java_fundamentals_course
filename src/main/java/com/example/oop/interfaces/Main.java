package com.example.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Recommended method:
        Creates a mutable empty array
         */
        List<Playable> pl = new ArrayList<>();

        pl.add(new Guitar());
        pl.add((new VideoGame()));

        for (Playable playable: pl) {
            playable.play();
        }

    }
}

