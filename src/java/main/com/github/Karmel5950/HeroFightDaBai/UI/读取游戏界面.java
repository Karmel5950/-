package com.github.Karmel5950.HeroFightDaBai.UI;

import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;
import com.github.Karmel5950.HeroFightDaBai.save.存档;

import java.io.IOException;
import java.util.Scanner;

public class 读取游戏界面 implements 界面{
    存档 存档1 = new 存档();
    @Override
    public 界面 打开界面() throws Exception {
        System.out.println("读取游戏");
        System.out.println("选择读取存档:");
        System.out.println("1.读取储存位置1");
        System.out.println("2.退出");
        Scanner 扫描器 = 工具实例.扫描器;
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            switch (str1){
                case "1":
                    System.out.println("读取储存位置1成功！");
                    存档1.读档();
                    return 用户界面.主界面;
                case "2":
                    return 用户界面.主界面;
                default:
                    return 用户界面.非法输入界面;
            }
        }
        return 用户界面.非法输入界面;
    }
}
