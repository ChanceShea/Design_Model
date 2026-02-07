package com.shea.mall.api.springtutorial.composite.expression;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 21:13
 */
public abstract class BinaryOperatorExpression implements Expression {

    protected Expression left;
    protected Expression right;

    protected BinaryOperatorExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
