package com.lxh.process.day_15.work;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 16:51:59
 * 模拟用户登录，登录用户名root，密码123456；登录三次之内，提示账号（密码）错误，三次以上，则提示登录失败，退出输入监听（Scanner in）
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        System.out.println(login());
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1 + "毫秒");
    }
    public static String login(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("输入用户名：");
            String username = input.next();
            System.out.println("输入密码：");
            String password = input.next();
            if ("root".equals(username)  && "123456".equals(password)){
                return "登陆成功";
            }else {
                System.out.println("账号(密码)错误");
            }
        }
        return "登陆失败";
    }
}
