package ru.todor.springcourse;

import org.springframework.stereotype.Component;

/**
 *  
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical music";
    }
}
