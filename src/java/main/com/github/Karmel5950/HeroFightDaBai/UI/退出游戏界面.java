package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;

public class 退出游戏界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("游戏结束！");
        HeroFightDaBai.运行中 = false;
        return 用户界面.开始界面;
    }
}
