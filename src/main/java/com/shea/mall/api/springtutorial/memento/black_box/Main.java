package com.shea.mall.api.springtutorial.memento.black_box;


/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 18:47
 */
public class Main {
    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.initState(); // 初始化角色状态
        role.displayState();
        RoleStateMementoCaretaker caretaker = new RoleStateMementoCaretaker();
        caretaker.setMemento(role.saveState()); // 保存角色状态
        role.fight(); // 角色战斗
        role.displayState();
        role.recoverState(caretaker.getMemento()); // 恢复角色状态
        role.displayState();
    }
}
