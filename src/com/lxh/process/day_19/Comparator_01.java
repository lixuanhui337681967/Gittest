package com.lxh.process.day_19;

import java.util.*;

/**
 * @author lixuanhui
 * @date 2022年 09月30日 14:37:35
 */
public class Comparator_01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;

                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);

                return i2-i1;
            }
        });
        set.add("123");
        set.add("832");
        set.add("165");
        set.add("138");
        set.add("2523");
        set.add("523");
        set.add("023");
        set.add("923");

        System.out.println(set);
    }
}
