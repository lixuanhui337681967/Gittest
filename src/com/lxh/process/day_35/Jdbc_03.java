package com.lxh.process.day_35;

import java.sql.*;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 10:16:17
 * 增删改
 */
public class Jdbc_03 {
    public static void main(String[] args){
        m1("小李","18","男","中国大学生");
    }
    public static void m1(String name,String age,String sex,String school){
        Connection connection = null;
        Statement statement = null;
        try{
//        1.注册驱动（仅仅做一次）
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.建立连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student", "root", "123456");
//        3.创建运行SQL的语句对象(preparedStatement)
            String sql = "insert into student (name,age,sex,school) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        4.运行语句
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,age);
            preparedStatement.setString(3,sex);
            preparedStatement.setString(4,school);
//        5.处理运行结果(ResultSet)
            int i = preparedStatement.executeUpdate();
            System.out.println("影响了" + i + "行");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
//        6.释放资源
            try {
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
