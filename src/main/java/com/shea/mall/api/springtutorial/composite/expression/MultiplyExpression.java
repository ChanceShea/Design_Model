package com.shea.mall.api.springtutorial.composite.expression;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 21:15
 */
public class MultiplyExpression extends BinaryOperatorExpression {

    protected MultiplyExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return left.getValue() * right.getValue();
    }
}
