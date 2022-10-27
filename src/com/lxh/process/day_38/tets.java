package com.lxh.process.day_38;

import java.util.Arrays;

import static com.lxh.process.day_38.Solution.runningSum;

/**
 * @author lixuanhui
 * @date 2022年 10月25日 19:59:22
 */
public class tets {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = runningSum(nums);
        System.out.println(Arrays.toString(ints));
    }
}

class Solution {
    public static int[] runningSum(int[] nums) {
        int[] sum =new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            if (i>=1){
                sum[i] = sum[i-1] + nums[i];
            }else {
                sum[i] = sum[i] + nums[i];
            }
        }
        return sum;
    }
}