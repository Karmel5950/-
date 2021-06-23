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


}
