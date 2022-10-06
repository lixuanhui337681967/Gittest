package com.lxh.process.day_3;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 14:28:08
 * switch的使用
 */
public class SwitchTest {
    public static void main(String[] args) {
//        int a = 1;
//        switch (a){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

        System.out.println("输入成绩:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = a;
            switch ((int)(a/10)){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("差");
                    break;
                case 6:
                    System.out.println("及格");
                    break;
                case 7:
                case 8:
                    System.out.println("良好");
                    break;
                case 9:
                case 10:
                    System.out.println("优秀");
                    break;
                default:
                    System.out.println("不是1-100的成绩");
                    break;
            }
    }
}
