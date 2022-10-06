package com.lxh.process.day_6;

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
        int i = reverse(n);
        System.out.println("数字反转之后为为" + i);
    }
//    public static int Reverse(int num) {
//        int i;
//        int n = num;
//        for (i = 0; n > 0 ; i++) {
//            n/= 10;
//        }
//        System.out.println(i);
//
//        if (num < 10){
//            return num;
//        }
//        return num%10 + Reverse(num/10);
////        46  6*10 + 4
//    }
    public static int reverse(int x) {
        long result = 0;
        while (x != 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }
}
