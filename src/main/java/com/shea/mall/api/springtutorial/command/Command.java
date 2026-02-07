package com.shea.mall.api.springtutorial.command;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 15:27
 */
public interface Command {
    void execute();

    // 可选操作，支持撤销
    void undo();
}
