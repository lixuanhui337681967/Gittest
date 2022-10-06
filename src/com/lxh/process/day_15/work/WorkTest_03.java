package com.lxh.process.day_15.work;
/**
 * @author lixuanhui
 * @date 2022年 09月26日 17:21:59
 * 编写程序，字符串用空格分割，将字符串拆分并倒写：比如 String s=“To  Be Continue”输入到方法中，返回则是“oT eB eunitnoC”
 */
public class WorkTest_03 {
    public static void main(String[] args) {
        String str = "To Be Continue";
        System.out.println(cut(str));
    }
    public static StringBuilder cut(String str){
        String[] split = str.split(" ", ' ');
        StringBuilder sb1 = new StringBuilder(split[0]).reverse();
        StringBuilder sb2 = new StringBuilder(split[1]).reverse();
        StringBuilder sb3 = new StringBuilder(split[2]).reverse();
        return sb1.append(" ").append(sb2).append(" ").append(sb3);
    }
}
