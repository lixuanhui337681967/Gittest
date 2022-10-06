package com.lxh.process.day_10;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 10:37:47
 * 老师类
 */

public class Teacher {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
