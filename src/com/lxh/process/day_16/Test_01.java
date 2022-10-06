package com.lxh.process.day_16;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 15:40:57
 */
public class Test_01 {
    public static void main(String[] args) {
//        10 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        int count = 0;
        for (int i = -10; i <= 15; i++) {
            int abs = Math.abs(i);
            if (abs < 6 && abs > 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
