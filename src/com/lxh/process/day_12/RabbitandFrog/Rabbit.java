package com.lxh.process.day_12.RabbitandFrog;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 16:14:35
 * 兔子类
 */
public class Rabbit extends Animal{
    public Rabbit() {
    }

    public Rabbit(String name, String color, String kind) {
        super(name, color, kind);
    }

    @Override
    public void eatFood() {
        System.out.println(
                "兔子吃草"
        );
    }

    @Override
    public void screamOut() {
        System.out.println(
                "兔子叫"
        );
    }
}
