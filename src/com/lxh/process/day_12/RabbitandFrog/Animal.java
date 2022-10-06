package com.lxh.process.day_12.RabbitandFrog;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 16:14:58
 * 动物抽象类
 */
public abstract class Animal {
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

    public abstract void eatFood();

    public abstract void screamOut();
}
