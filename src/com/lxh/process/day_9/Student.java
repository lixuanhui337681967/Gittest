package com.lxh.process.day_9;

/**
 * @author lixuanhui
 * @date 2022年 09月16日 15:19:11
 */
public class Student {
    String name;
    String id;
    int age;
    int gender;
    static String school = "石家庄";

    public Student(String name, String id, int age, int gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }
}
