package ru.todor.springcourse.genres;

import ru.todor.springcourse.Music;

/**
 *  
 */
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Дай пять";
    }
}
