package com.lxh.process.day_15.work;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 19:12:53
 * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class WorkTest_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入身份证号码：");
        String idCardNum = input.next();
        System.out.println(check(idCardNum));
    }
    public static String check(String idCardNum) {
        if (idCardNum.length() == 18 && idCardNum.charAt(0) != 0){
            String idCard1 = idCardNum.substring(0, 17);
            String idCard2 = idCardNum.substring(17);
            for (int i = 0; i < idCard1.length(); i++) {
                if ( idCard1.charAt(i) < 48 || idCard1.charAt(i) > 57){
                    return "身份证输入错误1";
                }
            }
            if (idCard2.charAt(0) == 88 || idCard2.charAt(0) == 120){
                    return "身份证格式正确2";
            }else {
                if (idCard2.charAt(0) >= 48 && idCard2.charAt(0) <= 57){
                    return "身份证格式正确3";
                }else{
                    return "身份证输入错误4";
                }
            }
        }
        return "身份证输入错误5";
    }
}
