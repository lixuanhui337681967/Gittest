package com.lxh.process.day_37;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * @author lixuanhui
 * @date 2022年 10月23日 09:10:45
 * Jdbc工具类
 */
public class JdbcUtils {
//    注册+创建链接
    public static Connection getConnection(){
        try {
//            注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            创建连接
            Properties properties = new Properties();
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    释放资源
    public static void closeConnection(AutoCloseable autoCloseable){
        try {
            if (autoCloseable != null){
                autoCloseable.close();
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
