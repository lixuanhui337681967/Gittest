package com.lxh.process.day_18.work_0929;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 18:45:25
 * 学生类
 */
public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "我的id为" + id  +
                ", 我叫" + name;
    }
}
