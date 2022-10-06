package com.lxh.process.day_10.work;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 18:52:11
 * 手机测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        PhoneClass Apple = new PhoneClass("Apple" ,5,1, "白色");
        PhoneClass HuaWei = new PhoneClass("HuaWei" ,4,2, "红色");
        Apple.call();
        Apple.message();
        HuaWei.call();
        HuaWei.message();
    }
}
