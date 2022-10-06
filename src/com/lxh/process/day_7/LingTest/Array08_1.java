package com.lxh.process.day_7.LingTest;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 19:50:29
 * 给出一个 32 位 的有符号整数,你需要将这个整数中每位上的数字进行反转
 */
public class Array08_1 {
    public static void main(String[] args) {
        System.out.println("输一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = reverse(n);
        System.out.println("数字反转之后为为" + result);
    }
    public static int reverse(int x) {
        int result = 0;
        while (x != 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }
        return  result;
    }
//            输入x = 123
//            第一次循环
//            result = 0 * 10 + 123 % 10
//            result = 0 * 10 + 3 = 3
//            x = 12
//            第二次循环
//            result = 3 * 10 + 12 % 10
//            result = 3 * 10 + 2 = 32
//            x = 1
//            第三次循环
//            result = 32 * 10 + 1 % 10
//            result = 32 * 10 + 1 = 321
//            x = 0

    public static int reserve1(int x){
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        StringBuilder reverse = sb.reverse();
        int a = Integer.parseInt(reverse.toString());
        return a;
    }
}
