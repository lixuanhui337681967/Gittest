package com.lxh.process.day_35;

import com.lxh.process.day_35.test.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 14:27:58
 */
public class Java_Batch_01 {
    public static void main(String[] args) {
//        添加学生信息
//        addUser("李4","24","男","毕业");
//        删除学生信息
//        deleteUser("name");
//        修改学生信息
        updateUser("李四");
    }
    public static void addUser(String name,String age,String sex,String school){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "insert into student (name,age,sex,school) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,age);
            preparedStatement.setString(3,sex);
            preparedStatement.setString(4,school);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            System.out.println("执行成功");
//            释放资源
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void deleteUser(String name){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "DELETE FROM student where name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            int i = preparedStatement.executeUpdate();
            System.out.println("影响了" + i + "行");
//            释放资源
            JdbcUtils.close(preparedStatement);
            JdbcUtils.close(connection);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateUser(String name){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql1 = "select * from student where name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")
                        + resultSet.getString("age")
                        + resultSet.getString("sex")
                        + resultSet.getString("school"));
            }
            String sql2 = "update student set name = ? ,age = ? ,sex = ? ,school = ? where name = ? ";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(5,name);
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入修改的姓名：");
            String name1 = scanner.next();
            preparedStatement.setString(1,name1);
            System.out.println("输入修改的年龄：");
            String age1 = scanner.next();
            preparedStatement.setString(2,age1);
            System.out.println("输入修改的性别：");
            String sex1 = scanner.next();
            preparedStatement.setString(3,sex1);
            System.out.println("输入修改的学校：");
            String school1 = scanner.next();
            preparedStatement.setString(4,school1);
            int i = preparedStatement.executeUpdate();
            System.out.println("修改成功");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
