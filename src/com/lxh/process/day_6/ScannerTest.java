package com.lxh.process.day_6;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月13日 15:35:06
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入：");
        String input = scanner.next();
        System.out.println("你输入的是：" + input);
    }
}
