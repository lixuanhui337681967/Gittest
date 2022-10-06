package com.lxh.process.day_15;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 11:06:53
 */
public class String_02 {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(s.length());
        s.toString();
//        给我数组下标，返回该下标位置的字符
        char c = s.charAt(1);
        System.out.println(c);
    }
}
