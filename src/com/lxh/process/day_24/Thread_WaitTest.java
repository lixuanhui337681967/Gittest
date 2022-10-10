package com.lxh.process.day_24;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 16:47:35
 */
public class Thread_WaitTest {

    public static void main(String[] args) {
        Number number = new Number(0);
        Thread thread1 = new Thread_WaitTest01(number);
        Thread thread2 = new Thread(new Thread_WaitTest02(number));
        thread1.start();
        thread2.start();
    }
}

class Number {
    int a;

    public Number() {
    }

    public Number(int a) {
        this.a = a;
    }


    public synchronized void m1() {
        a++;
        System.out.println(Thread.currentThread().getName() + "-----" + a);
        try {
            this.notifyAll();
            Thread.sleep(500);
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void m2() {
        a++;
        System.out.println(Thread.currentThread().getName() + "-----" + a);
        try {
            this.notifyAll();
            Thread.sleep(500);
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Thread_WaitTest01 extends Thread {
    Number number;

    public Thread_WaitTest01() {
    }

    public Thread_WaitTest01(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            number.m1();
        }
    }
}

class Thread_WaitTest02 implements Runnable {
    Number number;

    public Thread_WaitTest02() {
    }

    public Thread_WaitTest02(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            number.m2();
        }
    }
}
