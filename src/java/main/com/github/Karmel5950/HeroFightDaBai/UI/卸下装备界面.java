package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 卸下装备界面 implements 界面 {
    @Override
    public 界面 打开界面() throws Exception {
        System.out.println("选择需要卸下的装备");
        System.out.println("1.武器");
        System.out.println("2.头盔");
        System.out.println("3.护甲");
        System.out.println("4.手套");
        System.out.println("5.鞋子");
        Scanner 扫描器 = 工具实例.扫描器;
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            switch (str1){
                case "1":
                    HeroFightDaBai.勇者.卸下装备("武器");
                    System.out.println("武器已卸下");
                    return 用户界面.装备界面;
                case "2":
                    HeroFightDaBai.勇者.卸下装备("头盔");
                    System.out.println("头盔已卸下");
                    return 用户界面.装备界面;
                case "3":
                    HeroFightDaBai.勇者.卸下装备("护甲");
                    System.out.println("护甲已卸下");
                    return 用户界面.装备界面;
                case "4":
                    HeroFightDaBai.勇者.卸下装备("手套");
                    System.out.println("手套已卸下");
                    return 用户界面.装备界面;
                case "5":
                    HeroFightDaBai.勇者.卸下装备("鞋子");
                    System.out.println("鞋子已卸下");
                    return 用户界面.装备界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }
}
