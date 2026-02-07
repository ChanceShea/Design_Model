package com.shea.mall.api.springtutorial.composite.expression;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 21:12
 */
public class NumberExpression implements Expression {

    private final int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
