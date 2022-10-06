package com.lxh.process.day_6;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 14:25:31
 * 传值和传址
 */
public class AddressAndValueTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        a(x);
        System.out.println(x);

        int[] y = {2,4,5,6};
        System.out.println(y[0]);
        b(y);
        System.out.println(y[0]);
    }

    public static int a(int x) {
        x++;
        System.out.println(x+10);
        return x;
    }
    public static int[] b(int[] y){
        y[0] = 10;
        return y;
    }
}
