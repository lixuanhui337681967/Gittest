package com.lxh.process.day_4;


import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 19:44:10
 * 实现代码:递归求N的阶乘
 */
public class Test1_txt {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int factorial = getFactorial(num1);
        System.out.println("递归求"+ num1+"的阶乘为" + factorial);
    }
    public static int getFactorial(int num) {
        int x;
        long y;
        if (num < 0){
            return 0;
        }else if (num == 0) {
            return 1;
        }else{
            return num * getFactorial(num - 1);
        }
    }
}
