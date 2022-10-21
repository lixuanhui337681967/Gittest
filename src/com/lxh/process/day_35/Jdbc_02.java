package com.lxh.process.day_35;

import java.sql.*;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 10:09:45
 * 优化JDBC
 */
public class Jdbc_02 {
    public static void main(String[] args){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
//        1.注册驱动（仅仅做一次）
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.建立连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "123456");
//        3.创建运行SQL的语句对象(Statement)
            statement = connection.createStatement();
            String sql = "select * from student";
//        4.运行语句
            resultSet = statement.executeQuery(sql);
//        5.处理运行结果(ResultSet)
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
//        6.释放资源
            try {
                if (resultSet != null){
                    resultSet.close();
                }
                if (statement != null){
                    statement.close();
                }
                if (connection != null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
