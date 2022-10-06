package com.lxh.process.day_16.work;

import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 20:36:14
 */
public class test01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(5)+1;
//
//            for (int j = 0; j < i; j++) {
//                if (arr[j] == arr[i]) {
//                    i--;
//                    break;
//                }
//            }
//        }

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
