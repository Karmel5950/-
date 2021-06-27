package Joggle;

import com.github.Karmel5950.HeroFightDaBai.Armor.装备;

public interface 有装备 {
    public 装备 get武器();
    public 装备 get头盔();
    public 装备 get护甲();
    public 装备 get手套();
    public 装备 get鞋子();
    public void 卸下装备(String 需要卸载的装备);
}
