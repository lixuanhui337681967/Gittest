package com.lxh.process.day_11.Animal;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 15:14:59
 * 猫类
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, String color, String kind) {
        super(name, color, kind);
    }

    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        this.move();
        this.eat();
    }
}
