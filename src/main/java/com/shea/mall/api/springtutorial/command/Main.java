package com.shea.mall.api.springtutorial.command;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 15:30
 */
public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        Invoker invoker = new Invoker();
        invoker.setCommand(lightOn);

        invoker.pressButton(); // 执行命令
        invoker.pressUndoButton(); // 撤销命令
    }
}
