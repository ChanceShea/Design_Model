package com.shea.mall.api.springtutorial.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 20:25
 */
public class Province implements PopulationNode {

    private final String name;
    private List<PopulationNode> cities =  new ArrayList<>();

    public Province(String name) {
        this.name = name;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public int computePopulation() {
        return cities.stream().mapToInt(PopulationNode::computePopulation).sum();
    }
}
