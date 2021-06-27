package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 装备界面 implements 界面 {
    @Override
    public 界面 打开界面() throws Exception {
        System.out.println("打开装备栏");
        System.out.println("武器:" + HeroFightDaBai.勇者.get武器().名字);
        System.out.println("头盔:" + HeroFightDaBai.勇者.get头盔().名字);
        System.out.println("护甲:" + HeroFightDaBai.勇者.get护甲().名字);
        System.out.println("手套:" + HeroFightDaBai.勇者.get手套().名字);
        System.out.println("鞋子:" + HeroFightDaBai.勇者.get鞋子().名字);
        System.out.println("1.卸下装备");
        System.out.println("2.返回主界面");
        Scanner 扫描器 = 工具实例.扫描器;
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            switch (str1){
                case "1":
                    return 用户界面.卸下装备界面;
                case "2":
                    return 用户界面.主界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }
}
