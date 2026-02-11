package com.shea.mall.api.springtutorial.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:09
 */
public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
