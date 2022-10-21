package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 19:47:33
 * 把小米电视的价格更改为1888
 */
public class UpdateData_04 {
    public static void main(String[] args) {
        deleteData("小米电视");
    }
    public static void deleteData(String name){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "UPDATE t_goods SET price = '1888' WHERE name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            int i = preparedStatement.executeUpdate();
            System.out.println("修改了" + i + "行数据，运行成功");

            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
