package com.shea.mall.api.example.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 11:21
 */
@RestController
@RequestMapping("/custom")
public class CustomController {

    private Map<UserType,CustomService> services;

    @GetMapping("/{recharge}")
    public String recharge(@PathVariable int recharge) {
        UserType userType = UserType.typeOf(recharge);
        return services.get(userType).show();
    }

    @Autowired
    public void setCustomService(List<CustomService> list) {
        this.services = list.stream()
                .filter(service -> service.getClass().isAnnotationPresent(SupportCustom.class))
                .collect(Collectors.toMap(this::getUserType, Function.identity()));
    }
    private UserType getUserType(CustomService service) {
        SupportCustom annotation = service.getClass().getAnnotation(SupportCustom.class);
        return annotation.value();
    }
}
