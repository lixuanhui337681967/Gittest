package com.lxh.process.day_24;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 10:02:23
 */
public class Thread_join {
    public static void main(String[] args) {
        Thread_joinTest thread_joinTest = new Thread_joinTest();
        Thread t = new Thread(thread_joinTest);
        t.setName("t");
        t.start();
//        Thread.yield();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.currentThread().setName("main");
        for (int i = 6; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "-----" + i);
        }
    }
}

class Thread_joinTest implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + "--------" + i);
        }
    }
}
