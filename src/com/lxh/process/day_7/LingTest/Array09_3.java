package com.lxh.process.day_7.LingTest;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 18:35:03
 * 给定一个字符串,验证它是否是回文串,只考虑字母和数字字符,可以忽略字母的大小写
 */
public class Array09_3 {
    public static void main(String[] args) {
        String str1 = "A man , a plan , a canal : Panama";
        String str2 = "race  a  car";
        boolean a = ifPalindromes(str1);
        System.out.println(a);
    }
    public static boolean ifPalindromes(String a){
//        将给的字符串去掉空格和符号
//        "( |,|:)"
        String s = a.replaceAll("[^a-zA-Z0-9]", "");
//        String result="";
        String s1 = s.toLowerCase();
        StringBuilder strBulider = new StringBuilder();
        strBulider.append(s1);
        StringBuilder s2 = strBulider.reverse();
        if(s1.toString().equals(s2.toString())){
            return true;
        }else{
            return false;
        }

//        for(int i=0;i<s1.length();i++){
//            char pos=s1.charAt(i);
//            if('A'<=pos&&(pos<='Z')) {
//                result += (char) (pos+ ('a' - 'A'));//注意这里要将转换结果强转为char类型
//            }else{
//                result+=pos;
//            }
//        }
//        System.out.println(result);
//        if (s.length() == 0){
//            return true;
//        }
//        for (int i = 0; i < a.length()/2; i++) {
//            if (result.charAt(i) != result.charAt(result.length() -i - 1)){
//                return false;
//            }
//        }
//        return true;

    }
}
