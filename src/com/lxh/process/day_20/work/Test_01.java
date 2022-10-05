package com.lxh.process.day_20.work;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 16:09:25
 */
public class Test_01 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        map.put("10",1);
        map.put("12",2);
        map.put("2",3);
        map.put("1",4);

        System.out.println(map);
    }
}
