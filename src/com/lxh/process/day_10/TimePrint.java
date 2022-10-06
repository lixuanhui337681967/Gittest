package com.lxh.process.day_10;



/**
 * @author lixuanhui
 * @date 2022年 09月17日 15:14:52
 * 时间类
 */
public class TimePrint {
    private int year;
    private int month;
    private int day;

    public TimePrint() {
//        this.year = 1970;
//        this.month = 1;
//        this.day = 1;
        this(1970,1,1);
//        System.out.println(this);
    }

    public TimePrint(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printTime(){
        System.out.println(
                  this.year + "日"
                + this.month+ "月"
                + this.day  + "日");
    }
}
