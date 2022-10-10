package com.lxh.process.day_20.work;

import java.util.*;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 16:13:13
 */
public class Test_02 {
    public static void main(String[] args) {
        String str = "saefgwsadfwebatgfnlswepkjibdnj";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char eve : str.toCharArray()) {
            if (map.containsKey(eve)) {
                map.put(eve, map.get(eve) + 1);
            } else {
                map.put(eve, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
//        System.out.println("初始为" + list);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        System.out.println("排序后为" + list);
    }
}
