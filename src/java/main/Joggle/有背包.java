package Joggle;

import com.github.Karmel5950.HeroFightDaBai.Armor.装备;
import com.github.Karmel5950.HeroFightDaBai.Article.消耗品;

public interface 有背包 {
    public int 获取背包上限();
    public void 在背包内添加物品(物品 物品);
    public 物品[] 获取物品();
    public void 在背包内丢弃物品(物品 物品);

}
