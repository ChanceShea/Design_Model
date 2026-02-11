package com.shea.mall.api.springtutorial.interpreter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 19:01
 */
public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
