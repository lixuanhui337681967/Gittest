package com.lxh.process.day_35;

import java.sql.*;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 09:26:26
 */
public class Jdbc_01 {
    public static void main(String[] args) throws Exception{
//        1.注册驱动（仅仅做一次）
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.建立连接数据库
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "123456");
//        3.创建运行SQL的语句对象(Statement)
        Statement statement = connection.createStatement();
        String sql = "select * from student";
//        4.运行语句
        ResultSet resultSet = statement.executeQuery(sql);
//        5.处理运行结果(ResultSet)
        while (resultSet.next()) {
//            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString("name"));
        }
//        释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
