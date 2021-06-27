package com.github.Karmel5950.HeroFightDaBai.Article;

import Joggle.增益属性;

import java.io.Serializable;

public class 苹果 extends 消耗品  {



    @Override
    public int 获取回复生命值() {
        return 10;
    }

    @Override
    public int 获取增加攻击力() {
        return 0;
    }

    @Override
    public int 获取增加生命值() {
        return 0;
    }

    @Override
    public int 获取增加防御力() {
        return 0;
    }

    @Override
    public String 获取名字() {
        return "苹果";
    }

    @Override
    public void 修改名字(String 要修改的名字) {


    }
}
