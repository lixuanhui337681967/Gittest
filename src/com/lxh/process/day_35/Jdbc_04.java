package com.lxh.process.day_35;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 10:50:20
 */
public class Jdbc_04 {
    public static void main(String[] args) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        String sql = "select * from student";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
        JdbcUtils.closeConnection(resultSet);
        JdbcUtils.closeConnection(preparedStatement);
        JdbcUtils.closeConnection(connection);
    }
}
