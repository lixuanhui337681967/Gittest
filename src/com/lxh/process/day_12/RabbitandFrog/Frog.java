package com.lxh.process.day_12.RabbitandFrog;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 16:14:46
 * 青蛙类
 */
public class Frog extends Animal implements SwimInterface{
    public Frog() {
    }

    public Frog(String name, String color, String kind) {
        super(name, color, kind);
    }

    @Override
    public void eatFood() {
        System.out.println(
                "青蛙吃虫"
        );
    }

    @Override
    public void screamOut() {
        System.out.println(
                "青蛙叫"
        );
    }

    @Override
    public void swim() {
        System.out.println(
                "青蛙会游泳"
        );
    }
}
