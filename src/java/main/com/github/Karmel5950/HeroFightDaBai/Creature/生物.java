package com.github.Karmel5950.HeroFightDaBai.Creature;

import Joggle.I生物;
import Joggle.初始化;

import java.io.Serializable;

public class 生物 implements I生物, Serializable {
    public String 名字;
    public int 等级;
    private int 初始攻击力;
    private int 攻击力成长;
    private int 初始防御力;
    private int 防御力成长;
    private int 初始生命值;
    private int 生命值成长;
    private int 当前经验值;
    private int 生命值当前值;

    public 生物(){
        this.初始化();


    }


    @Override
    public void 初始化() {
        this.名字 = "勇者";
        this.等级 = 1;
        this.初始攻击力 = 10;
        this.初始防御力 = 5;
        this.初始生命值 = 20;
        this.攻击力成长 = 2;
        this.防御力成长 = 1;
        this.生命值成长 = 5;
        this.当前经验值 = 0;
        this.生命值当前值 = 获取最大生命值();

    }

    @Override
    public String 获取名字() {
        return 名字;
    }

    @Override
    public void 修改名字 (String 要修改的名字) {
        this.名字 = 要修改的名字;

    }

    @Override
    public int 获取当前攻击力() {
        return 初始攻击力+攻击力成长*等级;
    }


    @Override
    public int 获取初始攻击力() {
        return 初始攻击力;
    }

    @Override
    public int 获取攻击力成长() {
        return 攻击力成长;
    }

    @Override
    public int 获取初始生命值() {
        return 初始生命值;
    }

    @Override
    public int 获取最大生命值() {
        return 初始生命值+生命值成长*等级;
    }

    @Override
    public int 获取生命值当前值() {
        return 生命值当前值;
    }

    @Override
    public int 获取生命值成长() {
        return 生命值成长;
    }

    @Override
    public int 获取当前等级() {
        return 等级;
    }

    @Override
    public void 提升等级() {
        this.等级 = 等级+1;
        this.生命值当前值 = 获取最大生命值();
    }

    @Override
    public int 获取当前经验值() {
        return 当前经验值;
    }

    @Override
    public int 获取最大经验值() {
        return 等级*100;
    }

    @Override
    public int 获取当前防御力() {
        return 初始防御力+防御力成长*等级;
    }

    @Override
    public int 获取初始防御力() {
        return 初始防御力;
    }

    @Override
    public int 获取防御力成长() {
        return 防御力成长;
    }
}
