package com.lxh.process.day_4;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 20:00:56
 * 声明一个方法,接收一个参数
 * 判断传递的参数值再斐波那契数列的第几位上
 * 如果不存在 打印 -1 , 如果存在 打印对应的位数
 * 难点 : 如何算不存在?
 * 大于上一位,小于当前位  说明不存在
 */
public class Test5_txt {
    public static void main(String[] args) {
        System.out.println("输一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = addNum(n);
        System.out.println("数字之和为" + i);
    }
    public static int addNum(int num) {
        if (num < 10){
            return num;
        }
        return num%10 + addNum(num/10);
    }
}
