package com.lxh.process.day_18;

import com.lxh.process.day_14.User;
import com.lxh.process.day_14.WorkTest_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 10:45:18
 */
public class Collection_01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new User());
        collection.add(new User());
        collection.add(1);
        collection.add(new WorkTest_01());
        collection.remove(new WorkTest_01());
        collection.remove(new Integer(1));

        //        清空集合
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

    }
}
