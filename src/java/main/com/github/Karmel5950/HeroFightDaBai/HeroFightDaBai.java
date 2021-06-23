package com.github.Karmel5950.HeroFightDaBai;

import com.github.Karmel5950.HeroFightDaBai.Creature.勇者;
import com.github.Karmel5950.HeroFightDaBai.UI.用户界面;
import com.github.Karmel5950.HeroFightDaBai.UI.界面;

public class HeroFightDaBai {
    static 界面 界面导向 = 用户界面.开始界面;
    public static 界面 界面导向历史 = 用户界面.开始界面;
    public static  boolean 运行中 = true;
    public static 勇者 勇者;
    public static void main(String[] args) throws Exception {
        while (运行中){
            界面导向器(界面导向);
        }
    }



    public static void 界面导向器(界面 输入界面) throws Exception {
        界面导向 = 输入界面.打开界面();
        界面导向历史 = 输入界面;
    }


}
