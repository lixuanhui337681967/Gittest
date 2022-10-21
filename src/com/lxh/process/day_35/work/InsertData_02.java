package com.lxh.process.day_35.work;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lixuanhui
 * @date 2022年 10月21日 19:06:51
 * 向订单表中插入数据
 *     订单号 : 100001
 *     收货地址 : 河北石家庄裕华区师大科技园B座1808
 *     收货人 : 小张
 *     电话 : 1893137xxxx
 * 向商品表中插入数据
 *     商品名称 : 小米电视
 *     价格 : 3999
 *     订单ID : 为订单号100001 的ID
 *     (需要根据100001查询出ID是多少,再插入对应的ID)
 *
 *     商品名称 : 格力空调
 *     价格 : 5999
 *     订单ID : 为订单号100001 的ID
 */
public class InsertData_02 {
    public static void main(String[] args) {
//  "100001"  "河北石家庄裕华区师大科技园B座1808" "小张" "1893137xxxx"
        insertOrder("100001", "河北石家庄裕华区师大科技园B座1808","小张","1893137xxxx");
        insertGoods("小米电视", "3999","1");
        insertGoods("格力空调", "5999","1");
    }
//    insert 订单表
    public static void insertOrder(String num,String addr,String name,String phone){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql = "insert into t_order (num,addr,name,phone) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,num);
            preparedStatement.setString(2,addr);
            preparedStatement.setString(3,name);
            preparedStatement.setString(4,phone);
            int i = preparedStatement.executeUpdate();
            System.out.println("插入了" + i + "条数据,运行成功");

            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//    insert 商品表
    public static void insertGoods(String name,String price,String order_id){
        try {
            Connection connection = JdbcUtils.getConnection();
            String sql1 = "SELECT id FROM t_order WHERE num = 100001;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
            ResultSet resultSet = preparedStatement.executeQuery();
            String i = null;
            while (resultSet.next()) {
                i = resultSet.getString("id");
            }
            String sql2 = "insert into t_goods (name,price,order_id) values (?,?,?)";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,price);
            preparedStatement.setString(3,i);
            int i2 = preparedStatement.executeUpdate();
            System.out.println("插入了" + i2 + "条数据,运行成功");

            JdbcUtils.closeConnection(preparedStatement);
            JdbcUtils.closeConnection(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
