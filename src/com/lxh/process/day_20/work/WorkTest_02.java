package com.lxh.process.day_20.work;

import com.lxh.process.day_20.work.dao.User;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 17:03:56
 * 有10个电话号码-学生信息对象对应关系，
 * 学员信息包括id、name、age、address属性，
 * 编码实现输入电话号码得到学生信息对象。
 */
public class WorkTest_02 {
    public static void main(String[] args) {
        HashMap<Integer, Object> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put((12300 + i), new User(i, "一", 10 + i, "河北"));
        }
//        手机号12300-12310
        getUser(map);
    }

    public static void getUser(HashMap<Integer, Object> map) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码：");
            String input = scanner.nextLine();
            if (map.containsKey(Integer.parseInt(input))) {
                System.out.println(map.get(Integer.parseInt(input)));
            } else {
                System.out.println("电话号码不存在");
            }
        }
    }
}
