package com.shea.mall.api.springtutorial.flyweight;

import java.util.HashMap;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 14:56
 */
public class BoxFactory {

    private final HashMap<String,AbstractBox> map;
    private static final BoxFactory instance = new BoxFactory();
    private BoxFactory() {
        this.map = new HashMap<>();
        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    public static BoxFactory getInstance() {
        return instance;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
