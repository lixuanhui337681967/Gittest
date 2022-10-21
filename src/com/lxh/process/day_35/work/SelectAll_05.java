package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 19:49:42
 * 查询出所有的物品信息
 * 查询出所有的订单信息
 */
public class SelectAll_05 {
    public static void main(String[] args) {
//        查询出所有的订单信息
        selectAll("t_order");
//        查询出所有的物品信息
        selectAll("t_goods");
    }
//    查询出所有的订单信息
    public static void selectAll(String tableName){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "select * from " + tableName;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                if ("t_order".equals(tableName)){
                    System.out.println("id = " + resultSet.getString("id")
                            + ",订单号 = " + resultSet.getString("num")
                            + ",收货地址 = " + resultSet.getString("addr")
                            + ",收货人 = " + resultSet.getString("name")
                            + ",收货人电话 = " + resultSet.getString("phone")
                    );
                }
                if ("t_goods".equals(tableName)){
                        System.out.println("id = " + resultSet.getString("id")
                                + ",商品名 = " + resultSet.getString("name")
                                + ",价格 = " + resultSet.getString("price")
                                + ",order_id = " + resultSet.getString("order_id")
                        );
                }
            }

            JdbcUtils.closeConnection(resultSet);
            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
