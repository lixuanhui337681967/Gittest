package com.lxh.process.day_21.Work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author lixuanhui
 * @date 2022年 10月06日 16:31:32
 */
public class WorkTest_02 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        try (FileReader fileReader = new FileReader("./src/com/lxh/process/day_21/work/input.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String read = "";
            while ((read = bufferedReader.readLine()) != null) {
                set.add(Integer.valueOf(read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("去重后还有" + list.size() + "行" + "\n" + "分别是" + list);

    }
}
