package com.lxh.process.day_15;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 14:22:53
 */
public class String_Test_01 {
    public static void main(String[] args) {
        String s = "jinE,XIaomINg,xiAohOng,bOy,SGser";
        getName(s);
    }
    public static void getName(String name) {
        String[] split = name.split(",");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].substring(0,1).toUpperCase()
                     + split[i].substring(1).toLowerCase();
        }
        for (String a:split) {
            System.out.println(a);
        }
    }
}
