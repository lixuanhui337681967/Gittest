package com.lxh.process.day_20.work;

import com.lxh.process.day_20.work.dao.Dog;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 17:04:18
 * 有5条狗，有编号和名字，
 * 将5个狗对象加入到List集合中，
 * 求集合的长度并判断是否包含某条指定的狗。
 */
public class WorkTest_03 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Dog(1, "John1"));
        list.add(new Dog(2, "John2"));
        list.add(new Dog(3, "John3"));
        list.add(new Dog(4, "John4"));
        list.add(new Dog(5, "John5"));
        System.out.println("list数组的长度为：" + list.size());
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1、编号查询，2、名字查询");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    queryDog(list,"编号");
                    break;
                case 2:
                    queryDog(list,"名字");
                    break;
                case 3:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误！");
                    break;
            }
        }
    }
    public static void queryDog(ArrayList<Object> list,String status){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查询狗的" + status);

        if ("编号".equals(status)){
            int id = scanner.nextInt();
            for (Object dog : list) {
                if (((Dog) dog).getId() == id) {
                    System.out.println(dog);
                    break;
                }
            }
            System.out.println("输入错误！");
        }else if("名字".equals(status)){
            String name = scanner.next();
            for (Object dog : list) {
                if (name.equals(((Dog) dog).getName())) {
                    System.out.println(dog);
                    break;
                }
            }
            System.out.println("输入错误！");
        }
    }
}
