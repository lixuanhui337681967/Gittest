package com.lxh.process.day_14;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author Mr.Wang
 * @date 22-9-22
 */
public class User {
    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;

    static User[] userArr=new User[10];

    static int length=0;
    public User() {
    }

    public User(String username, String password, String nickname, int age, String addr) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
        this.addr = addr;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public static void register(){
        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入用户名");
//        String username = scanner.nextLine();


        String username ="";
//        String username2 ="";
        boolean b = true;
        do {
            System.out.println("请输入用户名");
            username = scanner.nextLine();
            b = judge(username);
        }while (b);



//        do{
//            System.out.println("请输入用户名");
//            username = scanner.nextLine();
//            if (length > 0){
//                for (int i = 0; i < length; i++) {
//                    username2 = userArr[i].getUsername();
//                    if(username.equals(username2)){
//                        System.out.println("用户名相同");
//                        break;
//                    }
//                }
//            }
//        }while(username.equals(username2));

        String password ="";
        String password2 ="";
        do{
            System.out.println("请输入密码");
            password = scanner.nextLine();
            System.out.println("请再次确认密码");
            password2 = scanner.nextLine();
            if(!password.equals(password2)){
                System.out.println("密码不一致");
            }
        }while(!password.equals(password2));
        System.out.println("请输入昵称");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄");
        String ageStr = scanner.nextLine();
        int age=Integer.parseInt(ageStr);
        System.out.println("请输入地址");
        String address = scanner.nextLine();
        System.out.println("注册成功");
        User user=new User(username,password,nickname,age,address);
        if(length<10){
            userArr[length]=user;
            length++;
        }else{
            System.out.println("注册人数已满");
        }
    }

    private static boolean judge(String username) {
        for (int i = 0; i < length; i++) {
                if (userArr[i].getUsername().equals(username)){
                    System.out.println("用户名重复");

                    return true;
                }
            }return false;
    }

    public static void login(User user){
        for (int i = 0; i < length; i++) {
            if(!user.getUsername().equals(userArr[i].getUsername())){
                continue;
            }
            if(!user.getPassword().equals(userArr[i].getPassword())){
                continue;
            }
            System.out.println("登录成功");

            return;
        }
        System.out.println("登录失败");
    }
//    public static void login(User user){
//        if("admin".equals(user.getUsername())){
//            if("root".equals(user.getPassword())){
//                System.out.println("登录成功");
//            }else{
//                System.out.println("密码不正确");
//            }
//        }else{
//            System.out.println("用户名不正确");
//        }
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
