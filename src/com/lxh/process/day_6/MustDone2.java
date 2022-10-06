package com.lxh.process.day_6;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 17:59:48
 * 杨辉三角
 */
public class MustDone2 {
    /**
     * 观察下面杨辉三角（前5行）并打印出前7行
     *         二维数组,每个一维数组 都是一行
     *         第一行1列,第二行2列,第三行3列
     *
     *         		        1
     *        		 1	1
     *         	           1       2	     1
     *         	1	3	3	1
     *         1	4	6	4	       1
     *
     * n行m列 = (n-1)行(m-1)列 + (n-1)行m列
     */
    public static void main(String[] args) {
//        int[][] arr = new int[7][7];
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < i+1; j++) {
//                    arr[i][0] = 1;
//                    arr[i][j] = 1;
//                    if (j >= 1){
//                        arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
//                    }
//            }
//        }
//        for (int[] every: arr) {
//            for (int every2: every) {
//                if (every2 != 0) {
//                    System.out.print(every2 + " ");
//                }
//            }
//            System.out.println();
//        }
        PrintYang(7);
    }

    public static void PrintYang(int n){
        int[][] a = new int[n][];
        for (int i = 0; i < a.length; i++) {
//            初始化二维数组的每一项
            a[i] = new int[i+1];
//            初始化每一行的第一个值和最后一个值为1
            a[i][0] = 1;
            a[i][i] = 1;
            for (int j = 1; j < a[i].length-1; j++) {
                a[i][j] = a[i-1][j-1]+a[i-1][j];
            }
        }
        for (int[] every: a) {
            for (int every2: every) {
                System.out.print(every2 + " ");
            }
            System.out.println();
        }
    }
}
