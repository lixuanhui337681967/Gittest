package com.lxh.process.day_17.work;


import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月28日 15:32:58
 * 用户类
 */
public class User {
    private String username;
    private String password;
    static User[] userArr = new User[50];
    static int length = 0;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

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

    //用户注册
    public static void regist() {
        do {
            User user = new User();
            Scanner scanner = new Scanner(System.in);
            String username = "";
            boolean b = true;
            System.out.println("请输入用户名:");
            username = scanner.nextLine();
            if (username.length() <= 14 && username.length() >= 4 && b) {
                for (int i = 0; i < length; i++) {
                    if (username.equals(userArr[i].getUsername())) {
                        b = false;
                        throwException("用户名重复，请重新输入！");
                    }
                }
                if (b) {
                    user.setUsername(username);
                    String password = "";
                    String password2 = "";
                    System.out.println("请输入密码:");
                    password = scanner.nextLine();
                    if (password.length() <= 14 && password.length() >= 6) {
                        System.out.println("请再次确认密码:");
                        password2 = scanner.nextLine();
                        if (password.equals(password2)) {
                            user.setPassword(password);
                            if (length < userArr.length) {
                                userArr[length] = user;
                                length++;
                                System.out.println("注册成功！");
                                break;
                            } else {
                                throwException("注册人数已满！");
                            }
                        } else {
                            throwException("两次密码不相同，请重新输入！");
                        }
                    } else {
                        throwException("密码格式不正确，请重新输入！");
                    }
                }
            } else {
                throwException("用户名格式不正确，请重新输入！");
            }
        } while (true);
    }

    //用户登录
    public static void login() {
        do {
            Scanner scanner = new Scanner(System.in);
            boolean b = true;
            if (length > 0) {
                System.out.println("请输入用户名：");
                String username = scanner.next();
                if (username.length() <= 14 && username.length() >= 4) {
                    b = false;
                    for (int i = 0; i < length; i++) {
                        if (username.equals(userArr[i].getUsername())) {
                            b = true;
                            System.out.println("请输入密码：");
                            String password = scanner.next();
                            if (password.length() <= 14 && password.length() >= 6) {
                                if (userArr[i].getPassword().equals(password)) {
                                    System.out.println("登陆成功！");
                                    return;
                                } else {
                                    throwException("密码错误，请重新输入！");
                                }
                            }
                        } else {
                            if (i == length) {
                                throwException("用户名错误，请重新输入！");
                            }
                        }
                    }
                    if (!b) {
                        throwException("用户名错误，请重新输入！");
                    }
                } else {
                    throwException("用户名格式不正确，请重新输入！");
                }
            } else {
                throwException("库中没有用户数据，请重新输入！");
                break;
            }
        } while (true);
    }

    public static void throwException(String msg) {
        try {
            throw new Exception_Custom(msg);
        } catch (Exception_Custom e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
