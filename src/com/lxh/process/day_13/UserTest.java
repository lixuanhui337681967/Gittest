package com.lxh.process.day_13;

import java.util.Scanner;

import static com.lxh.process.day_13.User.login;

/**
 * @author lixuanhui
 * @date 2022年 09月21日 18:10:57
 * 用户测试类
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("admin","root","lixuanhui",18,"地球");
        User user2 = new User("337681967","lixuanhui","lixuanhui",18,"地球");
        login(user);
        login(user2);
        Scanner input = new Scanner(System.in);
        System.out.println("shuru");
        int i = input.nextInt();
//        switch (i) {
//            case 0:
//                System.out.println("1");
//                break;
//            case 1:
//
//        }
    }
}
