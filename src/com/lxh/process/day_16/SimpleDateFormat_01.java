package com.lxh.process.day_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 14:35:48
 */
public class SimpleDateFormat_01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
//        y表示年，M表示月，d表示天，H表示小时，m表示分钟，s表示秒，S表示毫秒
//
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

//        解析
        String dateStr = "2022年09月27日 14:40:48 145";
        Date parse = simpleDateFormat.parse(dateStr);
        System.out.println(parse);
    }
}
