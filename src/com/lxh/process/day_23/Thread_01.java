package com.lxh.process.day_23;

/**
 * @author lixuanhui
 * @date 2022年 10月08日 19:20:25
 */
public class Thread_01 {
    public static void main(String[] args) {
//        Thread t = new ThreadTest_01();
//        t.start();

        Thread t2 = new Thread(new ThreadTest_02());
        t2.start();
        for (int i = 0; i < 25; i++) {
            System.out.println("-----------------分割线-----------------");
        }

    }
}
class ThreadTest_01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class ThreadTest_02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

