package com.lxh.process.day_37;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月23日 09:19:07
 */
public class test_01 {
    public static void main(String[] args) {
        try {
//            注册驱动+创建连接
            Connection connection = JdbcUtils.getConnection();
//            创建运行sql的对象
            String sql = "select * from student";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            运行语句
            ResultSet resultSet = preparedStatement.executeQuery();
//            处理与逆行结果
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
//            释放资源
            JdbcUtils.closeConnection(resultSet);
            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
