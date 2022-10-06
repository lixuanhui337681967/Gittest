package com.lxh.process.day_12.RabbitandFrog;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 16:27:40
 * 动物测试类
 */
public class AnimalTest {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit("123","white","哺乳类");
        Frog frog = new Frog("312","green","非哺乳类");


        rabbit.eatFood();
        rabbit.screamOut();

        frog.eatFood();
        frog.screamOut();
        frog.swim();
    }
}
