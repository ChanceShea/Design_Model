package com.shea.mall.api.springtutorial.composite;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 20:01
 */
public class Main {

    public static void main(String[] args) {
        Province province = new Province("江西");
        City city1 = new City("南昌");
        City city2 = new City("景德镇");
        District district1 = new District("东湖区", 100000);
        District district2 = new District("昌江区", 200000);
        District district3 = new District("珠山区", 300000);
        District district4 = new District("abc", 400000);
        city1.addDistrict(district1);
        city1.addDistrict(district2);
        city2.addDistrict(district3);
        city2.addDistrict(district4);
        province.addCity(city1);
        province.addCity(city2);
        System.out.println(province.computePopulation());
    }
}
