package com.lxh.process.day_14.SingletonMode;

/**
 * @author lixuanhui
 * @date 2022年 09月22日 15:24:12
 * 懒汉模式
 */
public class LazyModel {
    private LazyModel() {
    }

    static LazyModel a;

    public static LazyModel getL() {
        if (a == null) {
            a = new LazyModel();
        }
        return a;
    }
}
