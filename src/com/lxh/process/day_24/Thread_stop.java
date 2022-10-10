package com.lxh.process.day_24;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lixuanhui
 * @date 2022年 10月10日 09:48:55
 */
public class Thread_stop {

    public static void main(String[] args) {
        Thread_stopTest thread_stopTest = new Thread_stopTest();
        Thread t = new Thread(thread_stopTest);
        t.setName("test");
        t.start();
        try {
            Thread.sleep(5000);
            thread_stopTest.setStatus(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread_stopTest implements Runnable {
    private boolean isStatus = true;

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    @Override
    public void run() {
        int i = 1;
        while (isStatus) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            System.out.println(Thread.currentThread().getName() + "--" + i + "--" + format);
            i++;
        }
    }
}
