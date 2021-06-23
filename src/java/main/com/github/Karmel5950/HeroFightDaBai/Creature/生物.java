package com.github.Karmel5950.HeroFightDaBai.Creature;

import java.io.Serializable;

public abstract class 生物 implements Serializable {

    //成员变量
    private double 生命值最大值;
    private double 生命值当前值;
    private int 攻击力;
    private int 防御力;
    private int 等级;
    private int 经验值;
    private int 初始生命值;
    private int 初始攻击力;
    private int 初始防御力;
    private int 生命值成长;
    private int 攻击力成长;
    private int 防御力成长;
    private String 名字;

    //构造器
    public 生物() {
        this(1);
    }
    public 生物(int 等级) {
        this.等级 = 等级;
        this.经验值 = 0;
        this.初始化();
        this.生命值最大值 = this.初始生命值 + 等级 * this.生命值成长;
        this.生命值当前值 = this.生命值最大值;
        this.攻击力 = this.初始攻击力 + 等级 * this.攻击力成长;
        this.防御力 = this.初始防御力 + 等级 * this.防御力成长;
    }


    //方法
    public void 攻击(生物 攻击对象){

    }

    private void 初始化(){
        this.名字 = get初始名字();
        this.初始生命值 = get初始生命值();
        this.初始攻击力 = get初始攻击力();
        this.初始防御力 = get初始防御力();
        this.生命值成长 = get生命值成长();
        this.攻击力成长 = get攻击力成长();
        this.防御力成长 = get防御力成长();
    }

    public abstract int get初始生命值();

    public abstract int get初始攻击力();

    public abstract int get初始防御力();

    public abstract int get生命值成长();

    public abstract int get攻击力成长();

    public abstract int get防御力成长();

    public abstract String get初始名字();

    public double get生命值最大值() {
        return 生命值最大值;
    }

    public double get生命值当前值() {
        return 生命值当前值;
    }

    public int get攻击力() {
        return 攻击力;
    }

    public int get防御力() {
        return 防御力;
    }

    public int get等级() {
        return 等级;
    }

    public String get名字() {
        return 名字;
    }

    public int get经验值() {
        return 经验值;
    }

    public void set名字(String 名字) {
        if (名字 != null){
            this.名字 = 名字;
        }else {
            System.out.println("名字不得为空!");
        }
    }

    public int get最大经验值(){
        return (int)Math.pow(1.1,this.等级)*10;
    }

    public void 提升等级(){
        this.等级 += 1 ;
    }
}
