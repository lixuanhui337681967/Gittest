package com.lxh.process.day_16;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 14:22:37
 */
public class Date_01 {
    public static void main(String[] args) {
        System.out.println(new Date(1000*60));
        Date date = new Date(System.currentTimeMillis() - 1000 * 60 * 10);
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(date));
    }
}
