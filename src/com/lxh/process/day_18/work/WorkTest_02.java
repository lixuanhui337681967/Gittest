package com.lxh.process.day_18.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 15:47:31
 * 2.现在有ArrayList集合，内容是[12,,15,29,5,8,34,100,29],   1）编写程序创建该集合   2）利用迭代器，将偶数都删除掉，返回剩下的数组成的集合
 */
public class WorkTest_02 {
    public static void main(String[] args) {
        getOdd();
    }
    public static void getOdd(){
        ArrayList<Integer> coll = new ArrayList<Integer>(Arrays.asList(12,15,29,5,8,34,100,29));
        Iterator<Integer> iterator = coll.iterator();

        while (iterator.hasNext()) {
            int x = iterator.next();
            if (x % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(coll);
    }
}
