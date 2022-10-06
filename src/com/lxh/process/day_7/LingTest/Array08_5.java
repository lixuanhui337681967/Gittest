package com.lxh.process.day_7.LingTest;

import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 15:30:42
 * 给定一个排序数组和一个目标值,在数组中找到目标值,并返回其索引,如果目标值不存在数组中,返回他将会被按顺序插入的位置 你可以假设数组中无重复元素
 */
public class Array08_5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,7,8,11};
        int target = 8;

        int[] a1 = {1,3,5,6};
        int target1 = 5;
        int target2 = 4;

        int output = insert(a, target);
        System.out.println(output);
    }
    public static int insert(int[] a, int b){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == b) {
                return i;
            }
            if (a[i] < b && a[i+1] > b) {
                return i+1;
            }
        }
        return -1;
    }
}
