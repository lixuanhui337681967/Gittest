package com.lxh.process.day_3;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 19:43:17
 * 我国最高山峰是珠穆朗玛峰：8848m，
 * 我现在有一张足够大的纸张，厚度为：0.01m。
 * 请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
 */
public class Test_2 {
    public static void main(String[] args) {
//        double height = 8848;
        int number = 0;
        double thick;
        for (thick = 0.01; thick < 8848; thick*=2) {
            number++;
        }
        System.out.println("至少需要折叠" + number + "次可以保证厚度不低于珠穆朗玛峰的高度");
    }
}
