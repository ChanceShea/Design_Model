package com.shea.mall.api.springtutorial.composite.expression;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 21:16
 */
public class DivisionExpression extends BinaryOperatorExpression {

    protected DivisionExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int getValue() {
        return left.getValue() / right.getValue();
    }
}
