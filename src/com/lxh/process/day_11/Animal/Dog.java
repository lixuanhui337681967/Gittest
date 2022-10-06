package com.lxh.process.day_11.Animal;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 15:14:52
 * 狗类
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, String color, String kind) {
        super(name, color, kind);
    }

    @Override
    public void move() {
        System.out.println("狗在跑");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        this.move();
        this.eat();
    }
}
