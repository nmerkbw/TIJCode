package com.jxs.chapeter13;

import java.util.Random;

/**
 * Created by jiangxs on 2018/4/8.
 */
public class HotPot {

    public static int number;

    public HotPot(int number) {
        this.number = number;
    }

    @Override
    public String toString() {

        StringBuilder hotPot = new StringBuilder("[");
        String[] hotPotName = {"小龙坎", "电台巷", "凤望龙门",
                "蜀九香", "大龙燚", "老码头"};
        Random random = new Random(47);
        for (int i = 0; i < number; i++) {
            hotPot.append(hotPotName[random.nextInt(100)%hotPotName.length]);
            hotPot.append(", ");
        }
        hotPot.delete(hotPot.length() - 2, hotPot.length());
        hotPot.append("]");

        return hotPot.toString();
    }

    public static void main(String[] args) {

        HotPot hotPot = new HotPot(10);
        System.out.println(hotPot);
    }
}
