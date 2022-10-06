package com.lxh.process.day_11.Animal;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 15:14:43
 * 动物类
 */
public class Animal {
    private String name;
    private String color;
    private String kind;

    public Animal() {

    }

    public Animal(String name, String color, String kind) {
        this.name = name;
        this.color = color;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void move(){
        System.out.println("动物在移动");
    }
    public void eat(){
        System.out.println("动物在吃东西");
    }
    public void selfIntroduction(){
        System.out.println("我叫" + name + "，是" + kind + "品种" + color + "的动物");
    }
}
