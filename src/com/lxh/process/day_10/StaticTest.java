package com.lxh.process.day_10;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 16:10:19
 * 静态代码块
 */
public class StaticTest {
    static {
        int a = 0;
        System.out.println(a);
        System.out.println("我是静态代码块");
    }
    public static void main(String[] args) {
        System.out.println("我是main方法");
    }
}
