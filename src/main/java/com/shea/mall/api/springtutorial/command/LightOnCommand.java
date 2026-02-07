package com.shea.mall.api.springtutorial.command;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 15:28
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
