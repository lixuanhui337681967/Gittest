package com.lxh.process.day_6;

import java.util.Arrays;

/**
 * @author Mr.Wang
 * @date 22-9-13
 */
public class ArraySortTest {
    public static void main(String[] args) {
        /**
         * 排序
         *  1.冒泡排序
         *  2.选择排序
         *  3.api排序
         */
//        冒泡排序
        int[] a={3,2,4,5,1};
//        for (int i = 0; i < a.length-1; i++) {
//            for (int j = 0; j < a.length-1-i; j++) {
//                if(a[j] >a[j+1]){
//                    int c=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=c;
//                }
//            }
//        }
//        for (int eve:a) {
//            System.out.println(eve);
//        }

//        选择排序
//        外层循环比较当前是哪个下标
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j <=a.length-1 ; j++) {
                if(a[min] >a[j]){
                    min=j;
                }
            }
            if(min!=i){
                int c=a[min];
                a[min]=a[i];
                a[i]=c;
            }
        }
        for (int eve:a) {
            System.out.println(eve);
        }
//        api排序
        Arrays.sort(a);
        for (int eve:a) {
            System.out.println(eve);
        }


    }
    public static void exchange(){
        //交换两个数的值
        int a=3;
        int b=4;
//        1.借助中间值
//        int c=a;
//        a=b;
//        b=c;
//        2.加法操作
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        3.异或  ^
//        a    0000 0011
//        b    0000 0100
//        a^b  0000 0111  =7
//             0000 0011  =3
//             0000 0100  =4
        a=a^b;//7
        b=a^b;
        a=a^b;


        System.out.println(a);
        System.out.println(b);
    }
}
