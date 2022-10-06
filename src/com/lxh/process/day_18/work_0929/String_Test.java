package com.lxh.process.day_18.work_0929;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 19:47:35
 * 现在有一个都存放String类型的集合，内容为["asd","qwe","aaa","sdz"] 	1)编写程序，把他们挨个添加进去 	2）统计该集合中每个字符 （注意，不是字符串）出现的次数。例如：集合中有”abc”、”bcd”两个元素， 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class String_Test {
    public static void main(String[] args) {
        ArrayList<String> info = new ArrayList<>(Arrays.asList("asd", "qwe", "aaa", "sdz"));
        Iterator<String> iterator = info.iterator();
        String str = "";
        while (iterator.hasNext()) {
            str += iterator.next();
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        int count = 0;
        int count1 = chars.length;

        for (int i = 0; i < chars.length - 1; i++) {
            for (char item : chars) {
                if (item == chars[i]) {
                    count++;
                }
            }
            if (chars[i] != chars[i + 1]) {
                System.out.println(chars[i] + "出现的次数" + count);
                count1 = count1 - count;
            }
            if (i == chars.length - 2) {
                System.out.println(chars[i + 1] + "出现的次数" + count1);
            }
            count = 0;
        }
    }
}
