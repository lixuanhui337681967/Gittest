package com.lxh.process.day_14.SingletonMode;

/**
 * @author lixuanhui
 * @date 2022年 09月22日 15:23:50
 * 饿汉模式
 */
public class HungryModel {
    private HungryModel() {
    }

    static HungryModel a = new HungryModel();

    public static HungryModel getH() {
        return a;
    }
}
