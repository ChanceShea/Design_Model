package com.shea.mall.api.example.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SupportCustom {
    UserType value();
}
