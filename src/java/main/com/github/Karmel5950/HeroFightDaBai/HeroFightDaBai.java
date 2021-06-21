package com.github.Karmel5950.HeroFightDaBai;

import com.github.Karmel5950.HeroFightDaBai.Battle.战斗;
import com.github.Karmel5950.HeroFightDaBai.Creature.勇者;
import com.github.Karmel5950.HeroFightDaBai.Creature.生物;
import com.github.Karmel5950.HeroFightDaBai.UI.用户界面;

public class HeroFightDaBai {
    public static void main(String[] args) {
        用户界面.开始界面();
    }

    public static void 初始化(){
        勇者 勇者 = new 勇者();
        System.out.println("勇者诞生了，他的生命值为:" + 勇者.生命值最大值);
    }
}
