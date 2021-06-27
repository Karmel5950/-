package com.github.Karmel5950.HeroFightDaBai.Article;

import Joggle.增益属性;

public class 消耗品 implements Joggle.消耗品 {

    private int 数量;


    @Override
    public String 获取名字() {
        return null;
    }

    @Override
    public void 修改名字(String 要修改的名字) {

    }

    @Override
    public int 获取回复生命值() {
        return 0;
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
    public int 获取数量() {
        return 数量;
    }
}