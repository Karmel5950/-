package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 行为界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("选择你的行为");
        System.out.println("1.改名");
        System.out.println("2.提升等级");
        Scanner 扫描器 = 工具实例.扫描器;
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            switch (str1){
                case "1":
                    if (扫描器.hasNextLine()){
                        String str2 = 扫描器.nextLine();
                        HeroFightDaBai.勇者.修改名字(str2);
                        System.out.println("改名成功！勇者已改名为:" + HeroFightDaBai.勇者.获取名字());
                    }
                    return 用户界面.主界面;
                case "2":
                    HeroFightDaBai.勇者.提升等级();
                    System.out.println("提升等级成功！勇者现在为:" + HeroFightDaBai.勇者.获取当前等级() + "级！");
                    return 用户界面.主界面;
                case "3":
                    return 用户界面.主界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }
}
