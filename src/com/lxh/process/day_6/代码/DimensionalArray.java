package com.lxh.process.day_6.代码;

/**
 * @author Mr.Wang
 * @date 22-9-13
 */
public class DimensionalArray {
    public static void main(String[] args) {
//        声明：静态声明
        int[][] a={{1,2,3,4},{1,2,3},{1,2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
//            动态声明
        int[][] b=new int[5][];
        int[][] v=new int[5][6];
//        操作：增删改查，遍历

//        System.out.println(a[2][1]);
        a[2][1]=100;
        //遍历
        System.out.println("========================");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("========================");
        for (int[] eve:a) {
            for (int every:eve) {
                System.out.print(every+" ");
            }
            System.out.println();
        }
    }
}
