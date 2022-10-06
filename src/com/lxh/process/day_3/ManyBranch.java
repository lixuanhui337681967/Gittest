package com.lxh.process.day_3;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 11:41:21
 * 多分支结构
 */
public class ManyBranch {
    public static void main(String[] args) {
//        int a = 100;
//        if (a > 20){
//            System.out.println(">20");
//        }else if(a < 20){
//            System.out.println("<20");
//        }else {
//            System.out.println("=20");
//        }

        //现在有一个1-100岁
        //1-10 幼年
        //11-18 少年
        //19-35 青年
        //36-60 中年
        //61-100 老年
        //小于1 未出生
        //大于100 入土
        System.out.println("输入年龄");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( 1 <= a && a <= 10){
            System.out.println("幼年");
        }else if( 10 < a && a <= 18){
            System.out.println("少年");
        }else if( 18 < a && a <= 35){
            System.out.println("青年");
        }else if( 35 < a && a <= 60){
            System.out.println("中年");
        }else if( 60 < a && a <= 100){
            System.out.println("老年");
        }else if( 100 < a){
            System.out.println("入土");
        }else {
            System.out.println("未出生");
        }
    }
}
