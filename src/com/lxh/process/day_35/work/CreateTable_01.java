package com.lxh.process.day_35.work;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 16:52:21
 * 两张表
 *     1 订单表 t_order
 *         id 整型 主键 自增
 *         num 整型 订单号
 *         addr 字符 收货地址
 *         name 字符 收货人
 *         phone 字符 收货人电话
 *      物品表  t_goods
 *         id  整型 主键 自增
 *         name 字符
 *         price 小数
 *         order_id 整型 外键关联t_order
 */
public class CreateTable_01 {
    public static void main(String[] args) {
        creatTable();
    }
    public static void creatTable(){
        try {
            Connection connection = JdbcUtils.getConnection();
//            生成表t_order
            String sql1 = "create table t_order(\n" +
                    "id int AUTO_INCREMENT PRIMARY KEY,\n" +
                    "num  int comment '订单号',\n" +
                    "addr varchar(20) comment '收货地址',\n" +
                    "name varchar(20) comment '收货人',\n" +
                    "phone varchar(100)  comment '收货人电话'\n" +
                    ") COMMENT '订单表';";
//            生成表t_goods
            String sql2 = "create table t_goods(\n" +
                    "id int AUTO_INCREMENT PRIMARY KEY,\n" +
                    "name varchar(20),\n" +
                    "price DECIMAL(4,2),\n" +
                    "order_id int ,\n" +
                    "foreign key(order_id) REFERENCES t_order(id)\n" +
                    ") COMMENT '物品表';";
            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
            preparedStatement = connection.prepareStatement(sql2);
            int i1 = preparedStatement.executeUpdate();
            System.out.println(i1);

            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
