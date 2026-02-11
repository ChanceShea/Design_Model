package com.shea.mall.api.springtutorial.interpreter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 19:03
 */
public class Plus extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return left.toString() + "+" + right.toString();
    }
}
