package com.github.Karmel5950.HeroFightDaBai.Creature;

public class 勇者 extends 生物{

    @Override
    protected void 初始化() {
        this.初始生命值 = 100;
        this.初始攻击力 = 10;
        this.初始防御力 = 0;
        this.生命值成长 = 10;
        this.攻击力成长 = 1;
        this.防御力成长 = 1;
    }
}
