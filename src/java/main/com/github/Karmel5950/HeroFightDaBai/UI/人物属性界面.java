package com.github.Karmel5950.HeroFightDaBai.UI;

import Joggle.界面;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;
import com.github.Karmel5950.HeroFightDaBai.Util.工具实例;

import java.util.Scanner;

public class 人物属性界面 implements 界面 {
    @Override
    public 界面 打开界面() {
        System.out.println("打开人物属性");
        System.out.println("勇者-" + HeroFightDaBai.勇者.获取名字());
        System.out.println("等级:" + HeroFightDaBai.勇者.获取当前等级());
        System.out.println("经验值:" + HeroFightDaBai.勇者.获取当前经验值() + "/" + HeroFightDaBai.勇者.获取最大经验值());
        System.out.println("生命值:" + HeroFightDaBai.勇者.获取生命值当前值() + "/" + HeroFightDaBai.勇者.获取最大生命值());
        System.out.println("攻击力:" + HeroFightDaBai.勇者.获取当前攻击力());
        System.out.println("防御力:" + HeroFightDaBai.勇者.获取当前防御力());
        System.out.println("1.返回主界面");
        Scanner 扫描器 = 工具实例.扫描器;
        if (扫描器.hasNextLine()){
            String str1 = 扫描器.nextLine();
            if ("1".equals(str1)) {
                return 用户界面.主界面;
            }
            return 用户界面.非法输入界面;
        }
        return 用户界面.非法输入界面;
    }
}
