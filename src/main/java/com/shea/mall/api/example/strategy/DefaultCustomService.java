package com.shea.mall.api.example.strategy;

import org.springframework.stereotype.Component;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:19
 */
@Component
public class DefaultCustomService implements CustomService {
    @Override
    public String show() {
        return "Default Custom Service";
    }
}
