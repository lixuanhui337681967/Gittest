package com.lxh.process.day_26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lixuanhui
 * @date 2022年 10月12日 15:01:35
 */
public class Matcher_Test01 {
    public static void main(String[] args) {
        String regex = "(([\\u4e00-\\u9fa5]{2,3})的电话是)(\\d{3})(\\d{4})(\\d{4})";
        String input1 =
                "cxk三三的电话是15630303030" +
                "fxz四四的电话是15640400440" +
                "wds五五的电话是15650505050" +
                "123六六的电话是15660606060";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input1);


//      以正则表达式代表的字符开头
//        System.out.println(matcher.lookingAt());

        while (matcher.find()) {
            System.out.println(matcher.group(1) + matcher.group(3) + "****" + matcher.group(5));
        }

    }
}
