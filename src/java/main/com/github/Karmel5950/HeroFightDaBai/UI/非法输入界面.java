package com.github.Karmel5950.HeroFightDaBai.UI;

import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;

public class 非法输入界面 implements 界面{
    @Override
    public 界面 打开界面() {
        System.out.println("输出的值非法，请重新输入！");
        return HeroFightDaBai.界面导向历史;
    }
}
