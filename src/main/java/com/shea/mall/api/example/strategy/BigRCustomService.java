package com.shea.mall.api.example.strategy;

import org.springframework.stereotype.Component;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:18
 */
@Component
@SupportCustom(UserType.BIG_R)
public class BigRCustomService implements CustomService {
    @Override
    public String show() {
        return "Big R Custom Service";
    }
}
