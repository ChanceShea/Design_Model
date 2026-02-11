package com.shea.mall.api.springtutorial.memento.white_box;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 18:25
 */
public class RoleStateMemento {
    private int vit; // 生命值
    private int atk; // 攻击力
    private int def; // 防御力

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getDef() {
        return def;
    }

    public int getAtk() {
        return atk;
    }
}
