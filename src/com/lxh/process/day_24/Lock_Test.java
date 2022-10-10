package com.lxh.process.day_24;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 14:29:30
 */
public class Lock_Test {
    public static void main(String[] args) {
        Num num = new Num(10);
        Thread thread1 = new Thread_LockTest01(num);
        Thread thread2 = new Thread(new Thread_LockTest02(num));
        thread1.start();
        thread2.start();
    }
}

class Num {
    int a;

    public Num() {
    }

    public Num(int a) {
        this.a = a;
    }

    Lock lock = new ReentrantLock();

    public void add() {
        try {
            lock.lock();
            System.out.println("============");
            System.out.println(++a);
            System.out.println("============");
        } finally {
            lock.unlock();
        }
    }

}

class Thread_LockTest01 extends Thread {
    Num num;

    public Thread_LockTest01() {
    }

    public Thread_LockTest01(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.add();
    }
}

class Thread_LockTest02 implements Runnable {
    Num num;

    public Thread_LockTest02() {
    }

    public Thread_LockTest02(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        num.add();
    }
}