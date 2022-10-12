package com.lxh.process.day_26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lixuanhui
 * @date 2022年 10月12日 15:42:10
 */
public class Matcher_Test02 {
    public static void main(String[] args) {
        String input = "我我asdawd我我w我我我我要awdaw1d65要223132要要561要ads要要sad要学学学学学学学学编编编编编编编编编程程程程程程程程程程程程程程程程程程程程程程";
//        1、去除非汉字
        String regex1 = "[^\\u4e00-\\u9fa5]";
        input = input.replaceAll(regex1,"");
        System.out.println("去除非汉字后的字符串为:" + input);
//        2、分组去重
        String regex2 = "(.)(\\1+)";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            input = input.replaceAll(matcher.group(0),matcher.group(1));
        }
        System.out.println("去重后的字符串为:" + input);
    }
}
