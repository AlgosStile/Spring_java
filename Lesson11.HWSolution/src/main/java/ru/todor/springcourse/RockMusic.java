package ru.todor.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *  
 */
@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Плачущий ветер Мэри(рок)");
        songs.add("Закрасьте это в черный цвет(рок)");
        songs.add("Кажется, я не могу сделать тебя своей(рок)");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
