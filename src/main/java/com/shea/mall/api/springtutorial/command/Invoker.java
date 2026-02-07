package com.shea.mall.api.springtutorial.command;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 15:30
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

    public void pressUndoButton(){
        command.undo();
    }
}
