package com.lxh.process.day_7.LingTest;

import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月15日 09:49:45
 * 给定一个由整数组成的非空数组所表示的非负整数,在该数的基础上加一, 最高位数字存放在数组的首位,数组中每个元素只存储一个数字 你可以假设除了整数0之外,这个整数不会以 零 开头
 */
public class Array09_5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] a1 = {9,8,9};
        int[] a2 = {4,3,2,1};
        int[] ints = addOne(a1);
        for (int eve: ints) {
            System.out.print(eve + " ");
        }
    }
    public static int[] addOne(int[] a){
        for (int i = a.length - 1; i >= 0 ; i--) {
            if (a[i] != 9){
                a[i] += 1;
                return a;
            }
            a[i] = 0;
        }
        int[] newArr = new int[a.length+1];
        newArr[0] = 1;
        return  newArr;
    }
//        if (a.length == 0){
//            System.out.println("是空的数组");
//        }
//        System.out.println("原数组" + Arrays.toString(a));
//        a[a.length-1] += 1;
//        System.out.println("新数组" + Arrays.toString(a));
}
