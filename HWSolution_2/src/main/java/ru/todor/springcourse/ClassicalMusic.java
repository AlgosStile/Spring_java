package ru.todor.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 */
@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Венгерская рапсодия(классика)");
        songs.add("Симфония №. 5 до минор, соч. 67(классика)");
        songs.add("Ночь на Лысой горе(классика)");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
