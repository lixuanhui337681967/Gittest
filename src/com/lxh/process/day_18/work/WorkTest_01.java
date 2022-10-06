package com.lxh.process.day_18.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 15:40:15
 * 1.产生10个1-100的随机数，并放到一个数组中，
 * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        getArr();
    }
    public static void getArr(){
        Random rand = new Random();
        Collection<Integer> coll = new ArrayList<Integer>();

        for (int i: new int[10]) {
//            1-100
            i = rand.nextInt(100)+1;
            if (i >= 10) {
                coll.add(i);
            }
        }
        System.out.println(coll);
    }
}
