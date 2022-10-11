package com.lxh.process.day_25;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 10:41:54
 */
public class ProduceConsume {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Thread t1 = new ProduceTest(factory);
        Thread t2 = new Thread(new ConsumeTest(factory));
        t1.start();
        t2.start();
    }
}

class ProduceTest extends Thread {
    Factory factory;
    int count = 0;

    public ProduceTest() {
    }

    public ProduceTest(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            factory.Pro((char) (count + 'a'));
            count++;
        }
    }
}

class ConsumeTest implements Runnable {
    Factory factory;

    public ConsumeTest() {
    }

    public ConsumeTest(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            factory.Con();
        }
    }
}

class Factory {
    char[] data = new char[10];
    int count = 0;

    public synchronized void Pro(char c) {
        if (count == data.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count == 0) {
            this.notifyAll();
        }
        data[count] = c;
        count++;
        System.out.println("生产了" + c + "，目前有" + count + "个产品");
    }

    public synchronized void Con() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count < data.length) {
            this.notifyAll();
        }
        count--;
        char c = data[count];
        System.out.println("消费了" + c + "，目前有" + count + "个产品");
    }
}
