package com.lxh.process.day_6;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 17:54:38
 * 给出数组 int[] a = { 3, 2, 4, 5, 1 }; 请把该数组以升序排序
 */
public class MustDone1 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 4, 5, 1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++){
                if (a[j] > a[j+1]) {
                    int c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                }
            }
        }
        for (int every:
             a) {
            System.out.print(every + "  ");
        }
    }
}
