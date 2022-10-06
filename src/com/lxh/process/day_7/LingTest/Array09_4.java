package com.lxh.process.day_7.LingTest;

import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 19:45:50
 * 给定一个由整数组成的非空数组所表示的非负整数,在该数的基础上加一, 最高位数字存放在数组的首位,数组中每个元素只存储一个数字 你可以假设除了整数0之外,这个整数不会以 零 开头
 */
public class Array09_4 {
    public static void main(String[] args) {
        int[] a = {6,4,1,2,1,2,4};
        int[] a1 = {2,2,1};
        int[] a2 = {4,1,2,1,2};
        findOnlyOneNum(a);
    }
    public static void findOnlyOneNum(int[] a){
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b = b ^ a[i];
        }
        System.out.println(b);
    }


    //        Arrays.sort(a);
//        if (a.length == 0){
//            System.out.println("是空的数组");
//            return false;
//        }
//        for (int i = 0; i < a.length; i++) {
//            boolean flag = false;
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//                    i++;
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                continue;
//            }
//            System.out.println(a[i] + "只出现了一次");
//        }
//        return false;

}
