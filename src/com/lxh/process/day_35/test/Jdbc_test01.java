package com.lxh.process.day_35.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 14:08:44
 */
public class Jdbc_test01 {
    public static void main(String[] args) {
        try {
//            1.注册驱动
//            2.建立连接
            Connection connection = JdbcUtils.getConnection();
//            3.创建运行SQL的语句对象
            String sql = "select * from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            4.运行语句
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
            JdbcUtils.close(resultSet);
            JdbcUtils.close(preparedStatement);
            JdbcUtils.close(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
