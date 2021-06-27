package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 背包界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("打开背包");
        Scanner 扫描器 = 工具实例.扫描器;
        System.out.println("1.消耗品\n2.装备\n3.返回上一级");
        if (扫描器.hasNextLine()) {
            String str1 = 扫描器.nextLine();
            switch (str1) {
                case "1":
                    return (界面) 用户界面.消耗品界面;
                case "2":
                    return (界面) 用户界面.装备的界面;
                case "3":
                    return 用户界面.主界面;
                default:
                    return 用户界面.非法输入界面;
            }


        }
        return 用户界面.非法输入界面;

    }
}
