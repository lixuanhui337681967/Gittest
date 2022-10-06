package com.lxh.process.day_2;

/**
 * @author lixuanhui
 * @date 2022年 09月06日 20:06:05
 * 练习2.docx 第二题
 */
public class SuashuDemo {
    public static void main(String[] args) {
        //声明三个整型变量a、b、c
        int a,b,c;
        //分别为a,b,c赋值为4,15,20
        a = 4;
        b = 15;
        c = 20;
        //计算(b/a)+c的值 ，并赋值给变量m
        double m;
        m = (double) (b/a)+c;
        //计算(c%b)*a-c的值，并赋值给变量n
        double n;
        n = (double) (c%b)*a-c;
        //输出m和n的值
        System.out.println(m);
        System.out.println(n);
    }
}
