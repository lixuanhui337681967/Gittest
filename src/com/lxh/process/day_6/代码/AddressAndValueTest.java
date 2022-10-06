package com.lxh.process.day_6.代码;

/**
 * @author Mr.Wang
 * @date 22-9-13
 */
public class AddressAndValueTest {
    public static void main(String[] args) {
//        传值和传址
        int x=10;
        System.out.println(x);   //10
        a(x);
        System.out.println(x);//  10
        int[] f={1,2,3,4,5};
        System.out.println(f[0]);//1
        b(f);
        System.out.println(f[0]);//10
    }
    public static int a(int y){
        y++;
        System.out.println(y+10);//21
        return y;
    }
    public static int[]  b(int[] t){
        t[0]=10;
        return t;
    }
}
