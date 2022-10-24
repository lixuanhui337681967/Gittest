package com.lxh.process.day_38;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月24日 15:59:31
 */
public class Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入IP地址：");
            String ip = sc.next();
            if (judge(ip)) {
                try {
                    Connection connection = JdbcUtils.getConnection();
                    String sql = "SELECT prefix,suffix,location FROM ip_location_relation WHERE INET_ATON('" + ip + "') >= INET_ATON(prefix) AND INET_ATON('" + ip + "') <= INET_ATON(suffix)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("location"));
                    }
                    JdbcUtils.closeConnection(resultSet);
                    JdbcUtils.closeConnection(preparedStatement);
                    JdbcUtils.closeConnection(connection);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("格式错误");
            }
        }
    }

    //    判断传入的格式是否正确
    public static boolean judge(String ip) {
        String[] result = ip.split("\\.");
        if (result.length != 4) {
            return false;
        }
        for (String eve : result) {
            if (eve.matches("0|[1-9][0-9]*")) {
                int temp = Integer.parseInt(eve);
                if (temp > 255 || temp < 0) {
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
