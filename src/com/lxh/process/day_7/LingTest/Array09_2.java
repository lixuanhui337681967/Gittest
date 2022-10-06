package com.lxh.process.day_7.LingTest;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 16:19:06
 * 给定两个有序整数数组,nums1 和nums2 ,将nums2合并到nums1中,使得nums1成为一个有序数组
 */
public class Array09_2 {
    /**
     * 给定两个有序整数数组,nums1 和nums2 ,将nums2合并到nums1中,使得nums1成为一个有序数组
     *
     * 说明 : 初始化 nums1 和 nums2 的元素数量分别为 m 和 n
     *            你可以假设nums1有足够的空间(空间大小大于或等于 m+n),来保存nums2中的元素
     *
     * 示例 :
     * 输入 :  nums1 = {1,2,3,0,0,0} m = 3;
     * nums2 = {2,5,6}  n=3
     * 输出 : {1,2,2,3,5,6}
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int num1 = 3;
        int num2 = 3;
        mergeNum(nums1,num1,nums2,num2);
    }
    public static void mergeNum(int[] a,int a1, int[] b,int a2) {
        System.arraycopy(b, 0, a, a.length-a1, a2);
        Arrays.sort(a);
        for (int every: a) {
            System.out.print(every + " ");
        }
    }

}
