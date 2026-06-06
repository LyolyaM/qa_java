package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;

    // Добавляем метод для Lion
    List<String> getFood(String animalKind) throws Exception;
    int getKittens();

}
