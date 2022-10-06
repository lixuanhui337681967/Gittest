package com.lxh.process.day_7.LingTest;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 10:12:05
 * 获取最后一个字符串的长度
 */
public class Array09_1 {
    public static void main(String[] args) {
        String a = "Hello World";
        int result = getWordLength(a);
        System.out.println(result);
    }
    public static int getWordLength(String str) {
        if (str.length() == 0){
            return 0;
        }
        if (str.lastIndexOf(" ") == str.length() - 1){
            return 0;
        }
        String[] s = str.split(" ");
        return s[s.length - 1].length();
    }
}
