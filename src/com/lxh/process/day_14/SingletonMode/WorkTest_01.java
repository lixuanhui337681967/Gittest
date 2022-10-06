package com.lxh.process.day_14.SingletonMode;

/**
 * @author lixuanhui
 * @date 2022年 09月22日 15:23:19
 * 测试类
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        LazyModel l = LazyModel.getL();
        LazyModel l1 = LazyModel.getL();
        HungryModel h = HungryModel.getH();
        HungryModel h1 = HungryModel.getH();
        System.out.println(l);
        System.out.println(l1);
        System.out.println(h);
        System.out.println(h1);
    }
}
