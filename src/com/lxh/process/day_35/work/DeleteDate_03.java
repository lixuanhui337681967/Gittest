package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 19:42:15
 * 删除格力空调
 */
public class DeleteDate_03 {
    public static void main(String[] args) {
        deleteData("格力空调");
    }
    public static void deleteData(String name){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "DELETE FROM t_goods WHERE name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            int i = preparedStatement.executeUpdate();
            System.out.println("删除了" + i + "行数据，运行成功");

            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
