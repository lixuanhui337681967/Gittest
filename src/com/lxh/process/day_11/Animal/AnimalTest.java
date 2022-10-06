package com.lxh.process.day_11.Animal;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 15:22:15
 * 动物测试类
 */
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog","白色","田园犬");
        Cat cat = new Cat("Tom","黑色","猫");
        dog.selfIntroduction();
        cat.selfIntroduction();
    }
}
