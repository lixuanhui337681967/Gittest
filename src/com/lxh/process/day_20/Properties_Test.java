package com.lxh.process.day_20;

import java.util.Properties;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 15:58:26
 */
public class Properties_Test {
    public static void main(String[] args) {
        Properties properties = new Properties();
//        第一步，读取配置文件
//        properties.load();
        properties.setProperty("username","admin");
        properties.setProperty("password","admin123");

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("username2","admin123456"));
    }
}
