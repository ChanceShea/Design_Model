package com.shea.mall.api.springtutorial.memento.white_box;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 18:23
 */
public class GameRole {
    private int vit; // 生命值
    private int atk; // 攻击力
    private int def; // 防御力

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void displayState(){
        System.out.println("角色状态：");
        System.out.println("生命值：" + this.vit);
        System.out.println("攻击力：" + this.atk);
        System.out.println("防御力：" + this.def);
    }
}
