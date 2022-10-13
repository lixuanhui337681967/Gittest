package com.lxh.process.day_26;

/**
 * @author lixuanhui
 * @date 2022年 10月12日 10:37:56
 */
public class Regex_Test {
    public static void main(String[] args) {
        String s ="-1,0,1,10,01,11";
        String regex = "";
//        System.out.println(s.matches("-?[1-9]+\\d*|0"));
//        匹配正整数
        regex = "[1-9]\\d*";
//        匹配整数
        regex = "-?[1-9]+\\d*|0";


////        非负整数
        regex = "0|([1-9]\\d*)";
//        System.out.println("11".matches(regex));
        System.out.println("非负整数 ：" + "-0.1".matches(regex));
//        匹配正整数
        regex = "[1-9]\\d*";
        System.out.println("匹配正整数 ：" + "-0.1".matches(regex));
//        非正整数
        regex = "0|(-[1-9]\\d*)";
        System.out.println("非正整数 ：" + "-0.1".matches(regex));
//        负整数
        regex = "-[1-9]\\d*";
        System.out.println("负整数 ：" + "-0.1".matches(regex));
//        整数
        regex = "0|(-?[1-9]\\d*)";
        System.out.println("整数 ：" + "-0.1".matches(regex));
//        非负浮点数（可以有0）
        regex = "(\\d.\\d+)|([1-9]\\d+.\\d+)|0";
        System.out.println("非负浮点数（可以有0） ：" + "-0.1".matches(regex));
//        正浮点数
        regex = " (0.\\d*[1-9]\\d*)|([1-9].\\d+)|([1-9]\\d+.\\d+)";
        System.out.println("正浮点数 ：" + "-0.1".matches(regex));
//        非正浮点数（可以有0）
        regex = "-((\\d.\\d+)|([1-9]\\d+.\\d+))|0";
        System.out.println("非正浮点数（可以有0）：" + "-0.1".matches(regex));
//        负浮点数
        regex = "-((0.\\d*[1-9]\\d*)|([1-9].\\d+)|([1-9]\\d+.\\d+))";
        System.out.println("负浮点数 ：" + "-0.1".matches(regex));
//        浮点数
        regex = "-?((0.\\d*[1-9]\\d*)|([1-9].\\d+)|([1-9]\\d+.\\d+))|0";
        System.out.println("浮点数 ：" + "-0.1".matches(regex));
//        由数字、26个英文字母组成的字符串
        regex = "[a-zA-Z0-9]+";
        System.out.println("由数字、26个英文字母组成的字符串 ：" + "-0.1".matches(regex));

//        regex = "(^##\\w*).*(##).*";
//        System.out.println("##X3zVpSP0S1uP1RY##我在快手极速版获得了22.66元，你也快来玩吧～".matches(regex));
    }
}
