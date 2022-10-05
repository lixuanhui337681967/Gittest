package com.lxh.process.day_20;

import java.util.*;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 15:29:07
 */
public class Map_Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        map.put(1, "451");
        map.put(3, "224");
        map.put(2, "3211");
        map.put(5, "44");
        System.out.println(map);

//        Map转List
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        List<Map.Entry<Integer, String>> list = new ArrayList<>(entries);
        Collections.sort(list,new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return Integer.parseInt(o1.getValue()) - Integer.parseInt(o2.getValue());
            }
        });
        System.out.println("-----------------分割线-----------------");
        System.out.println(list);
    }
}
