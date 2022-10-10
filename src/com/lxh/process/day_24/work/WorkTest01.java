package com.lxh.process.day_24.work;


import java.util.Arrays;
import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 18:49:06
 * 声明一个共享数组，起两个线程，两个线程分别隔一段时间(可以写一个随机数0-10)
 * ，给数组中添加数据
 * ，每一个线程为数组添加3个数据即可。
 */
public class WorkTest01 {
    public static void main(String[] args) {
        Num num = new Num(new int[6]);
        Thread t1 = new ArrayTest01(num);
        Thread t2 = new Thread(new ArrayTest02(num));
        t1.start();
        t2.start();
    }
}

class Num {
    private int[] a;
    private int i = 0;
    private boolean isStatus = true;

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    public Num() {
    }

    public Num(int[] a) {
        this.a = a;
    }

    Random random = new Random();

    public synchronized void add1() {
        if (i == 6) {
            this.notifyAll();
            System.out.println("数组为：" + Arrays.toString(a));
            setStatus(false);
        } else {
//            0-10
            a[i] = random.nextInt(10) + 1;
            System.out.println("add1方法正在写入，数值为：" + a[i]);
            i++;
            try {
                this.notifyAll();
                Thread.sleep(500);
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void add2() {
        if (i == 6) {
            this.notifyAll();
            System.out.println("数组为：" + Arrays.toString(a));
            setStatus(false);
        } else {
//            0-10
            a[i] = random.nextInt(10) + 1;
            System.out.println("add2方法正在写入，数值为：" + a[i]);
            i++;
            try {
                this.notifyAll();
                Thread.sleep(500);
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ArrayTest01 extends Thread {

    Num num;

    public ArrayTest01() {
    }

    public ArrayTest01(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.isStatus()) {
            num.add1();
        }
    }
}

class ArrayTest02 extends Thread {
    Num num;

    public ArrayTest02() {
    }

    public ArrayTest02(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.isStatus()) {
            num.add2();
        }
    }
}
