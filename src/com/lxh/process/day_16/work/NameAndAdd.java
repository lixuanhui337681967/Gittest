package com.lxh.process.day_16.work;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 20:23:10
 */
public class NameAndAdd {
    public static void main(String[] args) {
        String html_add = "http://www.shangyuninfo.com?userName=admin&pwd=123456";
        returnNameAndAdd(html_add);
    }
    public static void returnNameAndAdd(String str){
        String[] split = str.split("&");
        for (String eve: split) {
            if (eve.contains("userName")) {
                System.out.println(eve.substring(eve.indexOf("=") + 1));
            }
            if (eve.contains("pwd")) {
                System.out.println(eve.substring(eve.indexOf("=") + 1));
            }
        }
    }
}
