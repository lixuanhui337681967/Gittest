package com.lxh.process.day_12.Music;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 11:29:51
 * 钢琴类
 */
public class Piano extends Instrument{

    public Piano() {
    }

    public Piano(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("钢琴，弹奏的曲目是致爱丽丝");
    }
}
