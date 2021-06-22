package com.github.Karmel5950.HeroFightDaBai.Creature;

public class 生物 {

    //成员变量
    public double 生命值最大值;
    public double 生命值当前值;
    public int 攻击力;
    public int 防御力;
    public int 等级;
    public int 初始生命值;
    public int 初始攻击力;
    public int 初始防御力;
    public int 生命值成长;
    public int 攻击力成长;
    public int 防御力成长;

    //构造器
    public 生物() {
        this(1);
    }
    public 生物(int 等级) {
        this.等级 = 等级 ;
        this.初始化();
        this.生命值最大值 = this.初始生命值 + 等级 * this.生命值成长;
        this.生命值当前值 = this.生命值最大值;
        this.攻击力 = this.初始攻击力 + 等级 * this.攻击力成长;
        this.防御力 = this.初始防御力 + 等级 * this.防御力成长;
    }


    //方法
    public void 攻击(生物 攻击对象){

    }

    protected void 初始化(){
        this.初始生命值 = 10;
        this.初始攻击力 = 1;
        this.初始防御力 = 0;
        this.生命值成长 = 1;
        this.攻击力成长 = 1;
        this.防御力成长 = 1;
    }

}
