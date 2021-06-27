package com.github.Karmel5950.HeroFightDaBai.Armor;

import java.io.Serializable;

public class 装备 implements Serializable {
    public String 名字;
    public static 装备 空装备 = new 装备("空装备");

    public 装备(){
        this.名字 = "无名";
    }
    public 装备(String 名字 ){
        this.名字 = 名字;
    }

    private int 攻击力;
    private int 防御力;
    private int 生命值;
    private int 等级;

    public 装备(int 等级) {
        this.等级 = 等级;
        this.攻击力 = 5;
        this.防御力 = 2;
        this.生命值 = 10;


    }



}
