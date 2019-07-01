package ru.itprogram.view;

import ru.itprogram.entity.Thinker;

import java.util.List;

public class ThinkerPrint {
    public void print(List<Thinker> thinkerList) {
        for (Thinker thinker : thinkerList) {
            System.out.println(thinker);
        }
    }
}
