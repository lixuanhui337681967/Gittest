package com.lxh.process.day_14.factory;

/**
 * @author lixuanhui
 * @date 2022年 09月22日 16:39:06
 */
public class Test {
    public static void main(String[] args) {

        Factory factory=new Factory();
        Shoes obj = (Shoes) factory.getObjects(2);
    }
}
