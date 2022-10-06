package com.lxh.process.day_4;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 15:42:57
 * 递归
 */
public class RecursiveTest {
    public static void main(String[] args) {

//        long num = 20;
//        long sum = getFibonacci(num);
//        System.out.println(sum);

        int num = 100;
        int sum = getSum(num);
        System.out.println(sum);

    }
//    1 1 2 3 5
    public static long getFibonacci(long num) {
        if (num == 1 || num == 2) {
            return 1;
        }else {
            return getFibonacci(num - 1) + getFibonacci(num - 2);
        }
    }

//    1+2+3+...+n
//    1+2+3+...+100 = 5050
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }else {
            return num + getSum(num - 1);
        }
    }
}
