package com.lxh.process.day_12.Music;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 11:29:41
 * 二胡类
 */
public class Erhu extends Instrument{

    public Erhu() {
    }

    public Erhu(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("二胡，弹奏的曲目是二泉映月");
    }


}
