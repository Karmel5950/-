package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 主界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("进入主界面");
        Scanner 扫描器 = 工具实例.扫描器;
        System.out.println("1.行为\n2.背包\n3.人物属性\n4.装备界面\n5.储存游戏\n6.读取游戏\n7.返回开始界面");
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            switch (str1){
                case  "1":
                    return 用户界面.行为界面;
                case  "2":
                    return 用户界面.背包界面;
                case  "3":
                    return 用户界面.人物属性界面;
                case  "4":
                    return 用户界面.装备界面;
                case  "5":
                    return 用户界面.储存游戏界面;
                case  "6":
                    return 用户界面.读取游戏界面;
                case  "7":
                    return 用户界面.开始界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }
}
