package com.lxh.process.day_37.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lixuanhui
 * @date 2022年 10月23日 15:12:32
 */
public class practice {
    public static void main(String[] args) {
        try {
//        建立连接
            Connection connection = JdbcUtils.getConnection();
//        创建运行sql语句的对象
            String sql = "select * from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            执行语句
            ResultSet resultSet = preparedStatement.executeQuery();
//            处理运行结果
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
//            释放资源
            JdbcUtils.closeConnection(resultSet);
            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
