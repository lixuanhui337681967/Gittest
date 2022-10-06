package com.lxh.process.day_10;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 10:37:32
 * 学生类
 */
public class Student {
    private String name;
    private int age;
    private String className;
    private Teacher teacher;

    public Student(String name, int age, String className, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.teacher = teacher;
    }

    public Student() {
    }

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void getInfo() {
        System.out.println(
                  "我叫" + name
                + "，我今年" + age
                + "岁，我来自" + className
                + "班级，我的班主任老师是" + teacher.getName()
        );
    }
}