package com.lxh.process.day_38;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author lixuanhui
 * @date 2022年 10月24日 15:52:26
 * Jdbc工具类
 */
public class JdbcUtils {
    public static Connection getConnection(){
        try {
//            注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc2.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void closeConnection(AutoCloseable autoCloseable){
        try {
            if (autoCloseable != null) {
                autoCloseable.close();
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
