package com.lxh.process.day_7.LingTest;

/**
 * @author lixuanhui
 * @date 2022年 09月14日 14:18:42
 * 给定一个排序数组,你需要在原地删除重复出现的元素,使得每个元素只出现一次,返回移除后数组的新长度
 */
public class Array08_3 {
    /**
     * 给定一个排序数组,你需要在原地删除重复出现的元素,使得每个元素只出现一次,返回移除后数组的新长度
     *
     * 示例 1
     * 给定数组 nums ={1,1,2};
     * 函数应该返回新的长度 2,并且原数组 nums的前两个元素被修改为 1,2
     * 你不需要考虑数组中超出新长度后面的元素
     *
     * 示例 2
     * 给定 nums={0,0,1,1,1,2,2,3,3,4};
     * 函数应该返回新的长度 5 ,并原数组 nums的前5个元素被修改为 0,1,2,3,4
     * 你不需要考虑数组中超出新长度后面的元素
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {6,8,9,9,11,15,15,20,20,25,25,30};
        int[] a1 = {1,1,2};
        int[] a2 = {0,1,1,1,1,2,2,3,3,4};
        int res = deleteNum(a2);
        System.out.println(res);
        for (int eve: a2) {
            System.out.print(eve + " ");
        }
    }
    public static int deleteNum(int[] a) {
        int length = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[length] = a[i + 1];
                length++;
            }
        }
//        0 1 2 3 4 5
//        1 1
        return length;
    }
//        System.out.println("旧数组的长度为" + a.length);
//        for (int every1:a) {
//            System.out.print(every1 + " ");
//        }
//        System.out.println();
//        int count = 0;
//        int[] b = new int[a.length];
//        int j = 0;
//        if (a.length == 1) {
//            System.out.println(a[0]);
//        } else if (a.length > 1) {
//            for (int i = 0; i < a.length-1 ; i++) {
//                if (a[i] == a[i+1]) {
//                    count++;
//                }
//                else {
//                    b[j] = a[i];
//                    j++;
//                }b[j] = a[a.length-1];
//            }
//            int[] c = new int[a.length-count];
//            for (int i = 0; i < a.length-count; i++) {
//                c[i] = b[i];
//            }
//            System.out.println("数组的长度为" + c.length);
//            for (int every2:c) {
//                System.out.print(every2 + " ");
//            }
//        }

}
