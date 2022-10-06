package com.lxh.process.day_6.代码;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Mr.Wang
 * @date 22-9-13
 */
public class ArrayCopyTest {
    public static void main(String[] args) {
//        数组的复制
        int[] a={1,2,3,4,5};
        int[] b={11,12,13,14,15,16};
        for (int every:b) {
            System.out.println(every);
        }


        //数组的复制
//      第一个参数，源数组
//      第二个参数，源数组开始的位置
//      第三个参数，目标数组
//      第四个参数，目标数组开始的位置
//      第五个参数，复制的长度
        System.arraycopy(a,1,b,1,3);
        System.out.println("========================");
        for (int every:b) {
            System.out.println(every);
        }
    }
}
