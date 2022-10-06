package com.lxh.process.day_6;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 16:14:08
 * 排序
 */
public class SortTest {
    public static void main(String[] args) {
        int a= 3;
        int b= 4;
        change(a,b);
    }
    public static void change(int a, int b) {
        a = a^b;
//        a        0000 0011 3
//        b        0000 0100 4
//        a = a^b  0000 0111 7
//        b = a^b  0000 0011 3
//        a = a^b  0000 0100 4
        b = a^b;
        a = a^b;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
