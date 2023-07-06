package ru.todor.springcourse.genres;

import ru.todor.springcourse.Music;


/**
 *  
 */
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Выполняю инициализацию");
    }

    // Для Prototype бинов не вызывается destroy-метод!
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Выполняет уничтожение (экземпляра)");
    }

    @Override
    public String getSong() {
        return "Венгерская рапсодия";
    }
}
