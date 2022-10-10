package com.lxh.process.day_24;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 15:54:19
 */
public class DeadLock_Test {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new Thread_deadLockTest01(o1, o2);
        Thread t2 = new Thread(new Thread_deadLockTest02(o1, o2));
        t1.start();
        t2.start();
    }
}
class Thread_deadLockTest01 extends Thread {
    Object o1;
    Object o2;

    public Thread_deadLockTest01() {
    }

    public Thread_deadLockTest01(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println("锁住o1,调用o2");
            synchronized (o2) {
                System.out.println("调用o2");
            }
        }
    }
}
class Thread_deadLockTest02 implements Runnable {
    Object o1;
    Object o2;

    public Thread_deadLockTest02() {
    }

    public Thread_deadLockTest02(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println("锁住o2,调用o1");
            synchronized (o1) {
                System.out.println("调用o1");
            }
        }
    }
}
