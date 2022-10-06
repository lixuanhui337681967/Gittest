package com.lxh.process.day_7.LingTest;

import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 14:58:41
 * 给定一个数组 nums 和一个值 val 你需要原地移除所有数值等于val的元素,返回移除后数组的新长度,不要使用额外的数组空间 元素的顺序可以改变,你不需要考虑数组中超出新长度后面的元素
 */
public class Array08_4 {
    /**
     * 给定一个数组 nums 和一个值 val 你需要原地移除所有数值等于val的元素,返回移除后数组的新长度,不要使用额外的数组空间
     * 元素的顺序可以改变,你不需要考虑数组中超出新长度后面的元素
     *
     * 示例 1
     * 给定 nums = {3,2,2,3};  val = 3;
     * 函数应该返回新的长度 2 , 并且 nums中的前两个元素均为 2
     * 你不需要考虑数组中超出新长度后面的元素
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {4,5,6,3,2,2,2,3,7,8,9};
        int[] a = {3,2,2,3};
        int val = 3;
        remove(a, val);
//        System.out.println(b);
//        for (int eve: a) {
//            System.out.print(eve);
//        }
    }
    public static void remove(int[] nums, int val) {
//        int length = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == val){
//                nums[length] = nums[i];
//                length++;
//            }
//        }return length;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == val) {
                nums[i] = nums[nums.length-1];
                nums = Arrays.copyOf(nums, nums.length-1);
            }else {
                i++;
            }
        }
        for (int every: nums) {
            System.out.print(every + " ");
        }
        System.out.println("\n" + "数组的长度为" + nums.length);
    }
}
