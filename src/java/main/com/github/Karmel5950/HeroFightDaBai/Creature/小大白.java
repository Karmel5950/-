package com.github.Karmel5950.HeroFightDaBai.Creature;

public class 小大白 extends 生物{
    @Override
    public int 获取初始生命值() {
        return 20;
    }

    @Override
    public int 获取初始攻击力() {
        return 1;
    }

    @Override
    public int 获取初始防御力() {
        return 1;
    }

    @Override
    public int 获取生命值成长() {
        return 2;
    }

    @Override
    public int 获取攻击力成长() {
        return 1;
    }

    @Override
    public int 获取防御力成长() {
        return 1;
    }

    @Override
    public String 获取名字() {
        return "小大白";
    }
}
