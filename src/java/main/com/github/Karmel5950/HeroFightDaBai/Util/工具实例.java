package com.github.Karmel5950.HeroFightDaBai.Util;

import Joggle.物品;

import java.util.Scanner;

public class 工具实例 {
    public static Scanner 扫描器 = new Scanner(System.in);
    public static 物品 空物品 = new 物品() {
        @Override
        public int 获取数量() {
            return 0;
        }
    };
}
