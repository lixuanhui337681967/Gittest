package com.lxh.process.day_20;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 10:32:48
 */
public class Map_Test01 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("name",null);
        map.put("name","bigdata");
        System.out.println(map.get("name"));
    }
}
