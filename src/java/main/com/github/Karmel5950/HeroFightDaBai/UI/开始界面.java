package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.Creature.勇者;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 开始界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("进入开始界面");
        Scanner 扫描器 = 工具实例.扫描器;
        System.out.println("1.新的游戏\n2.读取游戏\n3.退出游戏界面");
        if (扫描器.hasNextLine()) {
            String str1 = 扫描器.nextLine();
            switch (str1){
                case  "1":
                    初始化();
                    return 用户界面.主界面;
                case  "2":
                    return 用户界面.读取游戏界面;
                case  "3":
                    return 用户界面.退出游戏界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }

    public static void 初始化(){
        HeroFightDaBai.勇者 = new 勇者();
        System.out.println("勇者诞生了，他的生命值为:" + HeroFightDaBai.勇者.获取最大生命值());
    }
}
