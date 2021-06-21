package com.github.Karmel5950.HeroFightDaBai.UI;

import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;

import java.util.Scanner;

public class 用户界面 {

    public static void 开始界面(){

        boolean 已输入 = false;
        Scanner scanner = new Scanner(System.in);
        while (!已输入){
            System.out.println("1.新的游戏\n2.读取游戏\n3.退出游戏");
            if (scanner.hasNextLine()) {
                String str1 = scanner.nextLine();
                    switch (str1){
                        case  "1":
                            System.out.println("进入新的游戏！");
                            HeroFightDaBai.初始化();
                            已输入 = true;
                            break;
                        case  "2":
                            System.out.println("读取游戏！");
                            已输入 = true;
                            break;
                        case  "3":
                            System.out.println("退出游戏！");
                            已输入 = true;
                            break;
                        default:
                            System.out.println("输出的值非法，请重新输入！");
                            break;
                    }
                }
        }
        scanner.close();
    }

    public static void 主界面(){

        System.out.println("1.行为\n2.背包\n3.人物属性\n4.储存游戏\n5.读取游戏\"\n6.返回开始界面");

    }

}
