package com.lxh.process.day_14;

/**
 * @author lixuanhui
 * @date 2022年 09月23日 15:39:15
 */

class Test {

    int i = 2;

    String s = null;

    void Test() {

        i = 3;

        s = "days";

    }

    public static void main(String args[]) {

        Test t = new Test();

        System.out.println(t.i + t.s);

    }

}