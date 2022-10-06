package com.lxh.process.day_11.People;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 11:06:01
 * 中学生
 */
public class MiddleStudent extends Person{
//    中学生独特的属性：文理生
    private String subject;

    public MiddleStudent() {
    }

    public MiddleStudent(String name, int age, String sex, String subject) {
        super(name, age, sex);
        this.subject = subject;
    }

    public MiddleStudent(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void outSubject(){
        System.out.println(this.getName() + "的专业是" + subject);
    }
}
