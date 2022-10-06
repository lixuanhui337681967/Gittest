package com.lxh.process.day_4;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 19:56:15
 * 实现代码:按顺序打印一个数字的每一位(例如1234 打印出1 2 3 4)
 */
public class Test3_txt {
    public static void main(String[] args) {
        System.out.println("输一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
    public static int printNum(int num) {
        if (num >= 10){
            printNum(num/10);
        }
        System.out.print(num%10 + " ");
        return 0;
    }
}
