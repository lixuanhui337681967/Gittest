package com.lxh.process.day_12.Music;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 11:30:03
 * 小提琴类
 */
public class Violin extends Instrument{
    public Violin() {
    }

    public Violin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("小提琴，弹奏的曲目是沉思");
    }
}
