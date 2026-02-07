package com.shea.mall.api.example.strategy;

import org.springframework.stereotype.Component;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:18
 */
@Component
@SupportCustom(UserType.PERSONAL)
public class PersonalCustomService implements CustomService {
    @Override
    public String show() {
        return "Personal Custom Service";
    }
}
