package com.lxh.process.day_15.work;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 17:05:39
 * 编写程序，判断字符串是否对称（忽略大小写）
 */

public class WorkTest_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = input.next();
        judgeSymmetric(str);
    }
    public static void judgeSymmetric(String str) {
        StringBuilder s = new StringBuilder(str);
        if (str.equalsIgnoreCase(s.reverse().toString())) {
            System.out.println("字符串对称");
        }else {
            System.out.println("字符串不对称");
        }
    }
}
