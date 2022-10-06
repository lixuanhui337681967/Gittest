package com.lxh.process.day_10;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 10:39:01
 */
public class Test1 {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher("teacher",18);
        Student student = new Student("Li", 18, "class24", new Teacher("Wang",18));
        student.getInfo();
    }
}
