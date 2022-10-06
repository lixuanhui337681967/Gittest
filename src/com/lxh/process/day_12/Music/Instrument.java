package com.lxh.process.day_12.Music;

import java.util.Objects;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 11:29:25
 * 乐器类
 */
public abstract class Instrument {
    String name;

    public Instrument() {
    }

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();

}
