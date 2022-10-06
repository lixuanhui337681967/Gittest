package com.lxh.process.day_7;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 10:24:00
 * 二分法
 */
public class DichotomyTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b =6;
        dichotomy(a, b);
    }

    public static int dichotomy(int[]arr, int num){
        int first = 0;
        int end = arr.length - 1;
        int middle = (first + num)/2;
        System.out.println(first);
        System.out.println(end);
        System.out.println(middle);
        return 0;
    }
}
