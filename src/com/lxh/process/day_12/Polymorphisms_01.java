package com.lxh.process.day_12;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 10:27:31
 * 多态
 */
public class Polymorphisms_01 {
    public static void main(String[] args) {
        People pupil = new Pupil();
    }
}
class People{
    String name;
}
class Pupil extends People{

}
