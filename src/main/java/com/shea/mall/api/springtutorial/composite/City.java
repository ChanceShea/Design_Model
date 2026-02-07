package com.shea.mall.api.springtutorial.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 20:22
 */
public class City implements PopulationNode {

    private final String name;
    List<PopulationNode> districts = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    @Override
    public int computePopulation() {
        return districts.stream().mapToInt(PopulationNode::computePopulation).sum();
    }
}
