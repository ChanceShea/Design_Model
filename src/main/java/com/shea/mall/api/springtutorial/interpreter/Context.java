package com.shea.mall.api.springtutorial.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 19:01
 */
public class Context {

    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable var,Integer value) {
        map.put(var,value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }
}
