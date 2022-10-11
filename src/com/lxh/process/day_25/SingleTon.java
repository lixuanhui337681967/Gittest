package com.lxh.process.day_25;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 09:39:23
 * 单例模式
 */
public class SingleTon {
    private SingleTon() {

    }
    private static volatile SingleTon singleton = null;

    public static SingleTon singleton() {
        if (singleton == null) {
            synchronized (SingleTon.class) {
                if (singleton == null) {
                    singleton = new SingleTon();
                }
            }
        }
        return singleton;
    }
}
