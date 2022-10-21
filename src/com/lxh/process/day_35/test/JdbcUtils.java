package com.lxh.process.day_35.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 14:19:19
 * Jdbc工具类
 */
public class JdbcUtils {
    public static Connection getConnection(){
        try {
//            1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            2.建立连接
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(AutoCloseable autoCloseable){
        try {
            if (autoCloseable != null) {
                autoCloseable.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
