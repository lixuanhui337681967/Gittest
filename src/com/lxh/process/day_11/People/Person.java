package com.lxh.process.day_11.People;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 10:46:16
 * 父类
 */
public class Person {
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
    }

    public void goClass(){
        System.out.println(this.name + "上课");
    }
    public void absence(){
        System.out.println(this.name + "请假");
    }
}
