package com.shea.mall.api.example.strategy;

import java.util.function.IntPredicate;

/**
 * @author : Shea.
 * @description : TODO
 * @since : 2026/2/7 11:22
 */
public enum UserType {
    NORMAL(recharge -> recharge <= 100),
    SMALL_R(recharge -> recharge > 100 && recharge <= 1000),
    BIG_R(recharge -> recharge > 1000 && recharge <= 10000),
    PERSONAL(recharge -> recharge > 10000);

    private final IntPredicate support;

    UserType(IntPredicate support) {
        this.support = support;
    }

    public static UserType typeOf(int money){
        for (UserType value : UserType.values()) {
            if(value.support.test(money)){
                return value;
            }
        }
        return null;
    }
}
