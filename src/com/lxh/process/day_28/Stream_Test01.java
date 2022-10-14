package com.lxh.process.day_28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author lixuanhui
 * @date 2022年 10月14日 09:13:31
 */
public class Stream_Test01 {
    public static void main(String[] args) {
//         数组方式生成
        String[] s1 = {"shadjkhsdjk","sahdjkasjdkla","ashjdjasdjk"};
        Stream<String> s11 = Stream.of(s1);
//        集合方式
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        Stream<Integer> stream = list.stream();
//        generate是一个无限流，你放什么，里面就是什么
        Stream<Integer> generate = Stream.generate(() -> 2);
        generate.forEach(x -> System.out.println(x));
//        iterate也是无限流，第一个传参初始值，第二个传参Lambda步长值
        Stream<Integer> iterate = Stream.iterate(6,x -> x+3);
        iterate.limit(3).forEach(x -> System.out.println(x));
//        String的chars()
        String s2 = "1561651561";
        IntStream chars = s2.chars();
        chars.forEach(x -> System.out.println((char)x));
    }
}
