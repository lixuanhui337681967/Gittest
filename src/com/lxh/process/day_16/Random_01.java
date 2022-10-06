package com.lxh.process.day_16;

import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 16:28:52
 */
public class Random_01 {
    public static void main(String[] args) {
        Random random = new Random();
//        0-10 左开右闭
        System.out.println(random.nextInt(10));
//        1-10
        System.out.println(random.nextInt(9)+1);
//        15-30
        System.out.println(random.nextInt(15)+15);
//        规律： （最大值 - 最小值） + 最小值

    }
}
