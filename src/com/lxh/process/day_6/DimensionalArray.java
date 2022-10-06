package com.lxh.process.day_6;

import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 15:07:40
 * 二维数组
 */
public class DimensionalArray {
    public static void main(String[] args) {
//        静态声明
        int[][] a= {{1,2,3,4},{1,2,3},{1,2}};
//        动态声明
        int[][] b = new int[5][];
//        int[][] c = new int[][6];
        int[][] d = new int[5][6];

        System.out.println(a[2][1]);
        System.out.println("-----------------分割线-----------------");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------分割线-----------------");
        for (int[] every: a) {
            for (int every2: every) {
                System.out.print(every2 + " ");
            }
            System.out.println();
        }
    }
}
