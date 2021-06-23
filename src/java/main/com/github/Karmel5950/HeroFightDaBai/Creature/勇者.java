package com.github.Karmel5950.HeroFightDaBai.Creature;

import com.github.Karmel5950.HeroFightDaBai.Armor.*;


import java.io.Serializable;

public class 勇者 extends 生物 implements 有装备 {

    装备 武器 = new 武器();
    装备 头盔 = 装备.空装备;
    装备 护甲 = 装备.空装备;
    装备 手套 = 装备.空装备;
    装备 鞋子 = 装备.空装备;

    @Override
    public int get初始生命值() {
        return 100;
    }

    @Override
    public int get初始攻击力() {
        return 10;
    }

    @Override
    public int get初始防御力() {
        return 5;
    }

    @Override
    public int get生命值成长() {
        return 10;
    }

    @Override
    public int get攻击力成长() {
        return 2;
    }

    @Override
    public int get防御力成长() {
        return 1;
    }

    @Override
    public String get初始名字() {
        return "勇者";
    }


    @Override
    public 装备 get武器() {
        return 武器;
    }

    @Override
    public 装备 get头盔() {
        return 头盔;
    }

    @Override
    public 装备 get护甲() {
        return 护甲;
    }

    @Override
    public 装备 get手套() {
        return 手套;
    }

    @Override
    public 装备 get鞋子() {
        return 鞋子;
    }

    @Override
    public void 卸下装备(String 需要卸载的装备) {
        switch (需要卸载的装备){
            case "武器":
                set武器(装备.空装备);
                break;
            case "头盔":
                set头盔(装备.空装备);
                break;
            case "护甲":
                set护甲(装备.空装备);
                break;
            case "手套":
                set手套(装备.空装备);
                break;
            case "鞋子":
                set鞋子(装备.空装备);
                break;
        }
    }

    public void set武器(装备 武器) {
        this.武器 = 武器;
    }

    public void set头盔(装备 头盔) {
        this.头盔 = 头盔;
    }

    public void set护甲(装备 护甲) {
        this.护甲 = 护甲;
    }

    public void set手套(装备 手套) {
        this.手套 = 手套;
    }

    public void set鞋子(装备 鞋子) {
        this.鞋子 = 鞋子;
    }
}
