package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 20:09:25
 */
public class SeletALL_06 {
    public static void main(String[] args) {
//        查询出所有的订单信息
        selectAllOrder();
    }
    public static void selectAllOrder(){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "select * from t_order";
            PreparedStatement preparedStatement = null;
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("id = " + resultSet.getString("id")
                        + ",订单号 = " + resultSet.getString("num")
                        + ",收货地址 = " + resultSet.getString("addr")
                        + ",收货人 = " + resultSet.getString("name")
                        + ",收货人电话 = " + resultSet.getString("phone")
                );
            }
            JdbcUtils.closeConnection(resultSet);
            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
