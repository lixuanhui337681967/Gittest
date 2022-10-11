package com.lxh.process.day_25;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 09:40:56
 */
public class SingleTonTest {
    public static void main(String[] args) {
        Thread t1 = new SingleTonTest_01();
        Thread t2 = new SingleTonTest_02();
        t1.start();
        t2.start();
    }
}
class SingleTonTest_01 extends Thread{
    @Override
    public void run() {
        System.out.println(SingleTon.singleton());
    }
}
class SingleTonTest_02 extends Thread{
    @Override
    public void run() {
        System.out.println(SingleTon.singleton());
    }
}