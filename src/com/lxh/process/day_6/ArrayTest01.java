package com.lxh.process.day_6;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 11:03:34
 * 数组题：新增577到最后一位
 * 然后把578新增到第一位
 * 遍历输出新数组(两组方法)
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr1 = {3,5,37,56,187};
        int[] arr2 = new int[6];
        int[] arr3 = new int[7];
//循环arr2使其前面几位和arr1相同，然后添加最后一位为577
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        arr2[arr2.length-1] = 577;
//循环arr3使后面几位相等，然后使第一位等于578
        System.arraycopy(arr2, 0, arr3, 1, arr2.length);
        arr3[0] = 578;
//for循环
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("-----------------分割线-----------------");
//增强for
        for (int every : arr3) {
            System.out.println(every);
        }

    }
}
