package com.lxh.process.day_15;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 15:22:40
 */
public class String_Test_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入手机号:");
        String num = input.next();
        System.out.println("您的手机号为：" + replace(num));
    }
    public static String replace(String num){
        if (num.length() != 11){
            return "输入错误";
        }
        num = num.substring(0,3)
              + "****"
              + num.substring(7,11);
        return num;
    }
}
