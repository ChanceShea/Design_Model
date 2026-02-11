package com.shea.mall.api.springtutorial.interpreter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 19:07
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        context.assign(a,10);
        Variable b = new Variable("b");
        context.assign(b,20);
        Variable c = new Variable("c");
        context.assign(c,30);
        Variable d = new Variable("d");
        context.assign(d,40);

        // a + b - c + d
        AbstractExpression expression = new Plus(a,new Plus(new Minus(b,c),d));
        int res = expression.interpret(context);
        System.out.println(expression + " = " + res);
    }
}
