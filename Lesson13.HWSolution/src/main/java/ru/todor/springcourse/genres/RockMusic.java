package ru.todor.springcourse.genres;

import ru.todor.springcourse.Music;

/**
 *  
 */
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Плачущий ветер Мэри";
    }
}
