package com.lxh.process.day_17.work;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月28日 15:33:29
 */
public class UserTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("请选择： 1.注册，2.登录，3退出");
            String num = input.next();
            switch (num) {
                case "1":
                    User.regist();
                    break;
                case "2":
                    User.login();
                    break;
                case "3":
                    System.out.println("提示：退出成功！");
                    return;
                default:
                    System.out.println("请重新输入！");
                    break;
            }
        }
    }
}
