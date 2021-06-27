package com.github.Karmel5950.HeroFightDaBai.save;

import Joggle.I生物;
import com.github.Karmel5950.HeroFightDaBai.Creature.勇者;
import com.github.Karmel5950.HeroFightDaBai.Creature.生物;
import com.github.Karmel5950.HeroFightDaBai.HeroFightDaBai;

import java.io.*;

public class 存档 {

    private String name;

    public void 存档() throws IOException {
        序列化生物((生物)HeroFightDaBai.勇者);
    }

    public void 读档() throws Exception {
        HeroFightDaBai.勇者 = (勇者) 反序列化生物();
    }

    private static void 序列化生物(生物 生物) throws FileNotFoundException, IOException {
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/gaoan/Desktop/save/hero.txt")));
        oo.writeObject(生物);
        oo.close();
    }

    private static 生物 反序列化生物() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/gaoan/Desktop/save/hero.txt")));
        生物 生物 = (生物) ois.readObject();
        return 生物;
    }



}
