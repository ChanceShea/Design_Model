package com.shea.mall.api.springtutorial.composite;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 20:23
 */
public class District implements PopulationNode{

    private final String name;
    private final int population;

    public District(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public int computePopulation() {
        return population;
    }
}
