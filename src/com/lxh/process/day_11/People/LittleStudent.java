package com.lxh.process.day_11.People;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 10:56:42
 * 小学生类
 */
public class LittleStudent extends Person{
//    小学生独特的属性：是否是少先队员
    private String pioneer;

    public LittleStudent() {
    }

    public LittleStudent(String name, int age, String sex, String pioneer) {
        super(name, age, sex);
        this.pioneer = pioneer;
    }

    public LittleStudent(String pioneer) {
        this.pioneer = pioneer;
    }

    public String getPioneer() {
        return pioneer;
    }

    public void setPioneer(String pioneer) {
        this.pioneer = pioneer;
    }

    public void outIdentity(){
        System.out.println(this.getName() + "的身份是" + pioneer);
    }
}
