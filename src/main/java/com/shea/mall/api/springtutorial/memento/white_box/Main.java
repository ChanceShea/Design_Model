package com.shea.mall.api.springtutorial.memento.white_box;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 18:30
 */
public class Main {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.initState(); // 初始化角色状态
        role.displayState();
        RoleStateMementoCaretaker caretaker = new RoleStateMementoCaretaker();
        caretaker.setRoleStateMemento(role.saveState()); // 保存角色状态
        role.fight(); // 角色战斗
        role.displayState();
        role.recoverState(caretaker.getRoleStateMemento()); // 恢复角色状态
        role.displayState();
    }
}
