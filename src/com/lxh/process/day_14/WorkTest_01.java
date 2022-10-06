package com.lxh.process.day_14;

import java.util.Scanner;

/**
 * @author Mr.Wang
 * @date 22-9-22
 */
public class WorkTest_01 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    public static void main(String[] args) {
//        User user=new User("admin","root","小明",18,"石家庄");
//        System.out.println(user.getUsername());
//        User.login(user);

        while(true){
            Scanner scanner=new Scanner(System.in);
            System.out.println("请选择：1注册，2登录");
            String type = scanner.nextLine();
            if("1".equals(type)){
                User.register();
            }else if("2".equals(type)){
                System.out.println("请出入用户名");
                String username = scanner.nextLine();
                System.out.println("请输入密码");
                String password = scanner.nextLine();
                User user=new User(username,password);
                User.login(user);
            }else{
                System.out.println("输入错误");
            }
        }


    }
}
