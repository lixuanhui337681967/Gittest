package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 10:42:23
 * jdbc工具类
 */
public class JdbcUtils {
    public static Connection getConnection(){
        try {
//        1.注册驱动（仅仅做一次）
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.建立连接数据库
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            return  DriverManager.getConnection(url, username, password);
//            return  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection(AutoCloseable autoCloseable){
        try {
            if (autoCloseable != null){
                autoCloseable.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
