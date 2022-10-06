package com.lxh.process.day_3;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 15:11:48
 * @date 2018
 * 循环结构
 */

public class CycleTest {
    public static void main(String[] args) {
//        2022-09-07 15:13:10

//        while 先判断，在执行
        int a = 1;
        while(a <= 5) {
            System.out.println("a=" + a);
            a++;
        }
        System.out.println("while-->先判断，在执行");
//        do while 先执行一次，再进行判断
        int b =1;
        do {
            System.out.println("b=" + b);
            b++;
        }while (b <= 5);
        System.out.println("do while-->先执行一次");

//       for 变量：判断：步长值
        for (int c = 1; c <= 5; c++){
            System.out.println("c=" + c);
        }
        System.out.println("for循环-->变量：判断：步长值");


//        九九乘法表
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i*j) + " ");
            }
            System.out.println();
        }
    }
}
