package com.lxh.process.day_28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lixuanhui
 * @date 2022年 10月14日 11:15:35
 */
public class Stream_Test02 {
    public static void main(String[] args) {
//        常用转换算子：filter，distinct，map，limit,skip,flatMap等
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);

        Stream<Integer> stream = list.stream();
//        filter：对元素进行过滤筛选，不符合的就不要了,为true留下，为false过滤掉
        stream.filter(x -> x!=3).forEach(x -> System.out.println(x));
        stream = list.stream();
        stream.filter(x -> x!=1).forEach(x -> System.out.println(x));

//        迭代器、matcher、stream再次调用需要重新创建，否则报错
//        distinct：去掉重复的元素
        stream = list.stream();
        stream.distinct().forEach(x -> System.out.println(x));

//        skip：跳过多少元素
        stream = list.stream();
        stream.skip(3).forEach(x -> System.out.println(x));

//        limit：去一个集合的前几条数据
        stream = list.stream();
        stream.limit(3).forEach(x -> System.out.println(x));

//        map：处理每一项的值，将返回值覆盖掉每一项
        stream = list.stream();
        stream.map(x -> x+2).filter(x -> x!=5).forEach(x -> System.out.println(x));

//        sorted：排序
        stream = list.stream();
        stream.sorted((o1,o2) -> o2-o1).forEach(x -> System.out.println(x));
    }
}
