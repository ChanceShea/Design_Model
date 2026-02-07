package com.shea.mall.api.example.strategy;

import org.springframework.stereotype.Component;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:17
 */
@Component
@SupportCustom(UserType.NORMAL)
public class NormalCustomService implements CustomService{
    @Override
    public String show() {
        return "Normal Custom Service";
    }
}
