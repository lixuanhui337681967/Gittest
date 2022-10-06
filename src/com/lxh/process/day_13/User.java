package com.lxh.process.day_13;

/**
 * @author lixuanhui
 * @date 2022年 09月21日 18:03:23
 * User类
 */
public class User {
    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;

    public User() {
    }

    public User(String username, String password, String nickname, int age, String addr) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
        this.addr = addr;
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



    public static void login(User user){
        System.out.println(
                "当前用户为：" + user.username
        );
//          Objects.equals("admin",user.getUsername())
            if ("admin".equals(user.username)){
                if ("root".equals(user.password)) {
                    System.out.println("登陆成功");
                }else {
                    System.out.println("密码不对");
                }
            }else {
                System.out.println("用户名不正确");
            }
    }

}
