package com.shea.mall.api.springtutorial.composite.expression;

/**
 * @author : Shea.
 * @description: 表达式测试类
 * @since : 2026/2/5 21:25
 */
public class ExpressionTest {
    public static void main(String[] args) {
        // 创建数字表达式
        Expression num1 = new NumberExpression(10);
        Expression num2 = new NumberExpression(5);

        // 测试加法
        Expression add = new AddExpression(num1, num2);
        System.out.println("10 + 5 = " + add.getValue());

        // 测试减法
        Expression subtract = new SubstractExpression(num1, num2);
        System.out.println("10 - 5 = " + subtract.getValue());

        // 测试乘法
        Expression multiply = new MultiplyExpression(num1, num2);
        System.out.println("10 * 5 = " + multiply.getValue());

        // 组合表达式: (10 + 5) * 2
        Expression complex = new MultiplyExpression(
            new AddExpression(num1, num2),
            new NumberExpression(2)
        );
        System.out.println("(10 + 5) * 2 = " + complex.getValue());
    }
}