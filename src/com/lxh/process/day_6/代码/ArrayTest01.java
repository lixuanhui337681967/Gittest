package com.lxh.process.day_6.代码;

/**
 * @author Mr.Wang
 * @date 22-9-13
 */
public class ArrayTest01 {
    public static void main(String[] args) {
//        数组，静态声明
        int[] arr1={1,2,3,4,5};
//        数组，动态声明
        int[] arr2=new int[100];
        System.out.println(arr2[0]);
        int[] arr7= null;
//        空指针
//        System.out.println(arr7[0]);

        System.out.println("修改之前="+arr1[4]);
        arr1[0]=6;
        System.out.println("修改之后="+arr1[0]);

        int[] arr3=new int[6];
        arr3[0]=arr1[0];
        arr3[1]=arr1[1];
        arr3[2]=arr1[2];
        arr3[3]=arr1[3];
        arr3[4]=arr1[4];
        arr3[5]=6;
        System.out.println(arr3.length);
        System.out.println("=====================");
//        遍历：把每一项拿出来
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("=====================");
//        增强for
//        :右侧是你要循环的对象
//        :左侧是每一项
//        如果需求里没有涉及到下标操作，此时用增强for循环最方便
//        foreach
        for (int every: arr1) {
            System.out.println(every);
        }
    }
}
