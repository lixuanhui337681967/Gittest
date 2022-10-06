package com.lxh.process.day_3;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 19:42:58
 * 需求：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
 * 每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
 * 请问，经过多少天，小芳才可以存到100元钱。
 */
public class Test_1 {
    public static void main(String[] args) {
        int day = 1;
        for (double money = 2.5; money < 100; money += 2.5) {
                day++;
                if (day % 5 == 0) {
                    money -= 6;
                }
        }
        System.out.println("需要经过" + day + "天小芳才可以存到100元钱");
    }
}
