package com.shea.mall.api.example.strategy;

import org.springframework.stereotype.Component;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:18
 */
@Component
@SupportCustom(UserType.SMALL_R)
public class SmallRCustomService implements CustomService {
    @Override
    public String show() {
        return "Small R Custom Service";
    }
}
