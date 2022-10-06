package com.lxh.process.day_11.People;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 11:07:58
 * 大学生类
 */
public class BigStudent extends Person{
//    大学生独特的属性：是否在实习
    private String internship;

    public BigStudent() {
    }

    public BigStudent(String name, int age, String sex, String internship) {
        super(name, age, sex);
        this.internship = internship;
    }

    public BigStudent(String internship) {
        this.internship = internship;
    }

    public String getInternship() {
        return internship;
    }

    public void setInternship(String internship) {
        this.internship = internship;
    }

    public void outInternship(){
        System.out.println("我是" + this.getName() + ",我是一名大学生"  + internship);
    }
}
