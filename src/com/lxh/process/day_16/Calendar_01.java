package com.lxh.process.day_16;

import java.util.Calendar;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 15:06:46
 */
public class Calendar_01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int week1 = calendar.get(Calendar.WEEK_OF_MONTH);
        int week2 = calendar.get(Calendar.WEEK_OF_YEAR);
//        1是周日，2是周日。。。。。
        int week3 = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int mini = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(hour);
        System.out.println(mini);
        System.out.println(sec);
        System.out.println(week1);
        System.out.println(week2);
        System.out.println(week3);
    }
}
