package com.lxh.process.day_7.LingTest;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 11:25:20
 * 判断一个正数是否是回文数,回文数是指正序(从左到右) 和 倒叙(从右到左) 读  都是一样的整数
 */
public class Array08_2 {
    public static void main(String[] args) {
        System.out.println("输入一个数值");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean a = ifPalindromes(num);
        System.out.println(a);
    }
    public static boolean ifPalindromes(int num){
        int result =0;
        int num1 = num;
        if (num1 == 0){
            return true;
        } else if (num1 < 0 || num1 % 10 == 0) {
            return false;
        }
        while (num1 != 0){
            result = result * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        return num == result;
    }
}
