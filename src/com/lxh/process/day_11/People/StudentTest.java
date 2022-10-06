package com.lxh.process.day_11.People;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 11:10:09
 * 学生类
 */
public class StudentTest {
    public static void main(String[] args) {

        LittleStudent littleStudent = new LittleStudent("小学生", 8, "男", "是少先队员");
        MiddleStudent middleStudent = new MiddleStudent("中学生", 16, "男", "理科生");
        BigStudent bigStudent = new BigStudent("大学生", 24, "男", "正在实习");

//  输出上课方法
        littleStudent.goClass();
        middleStudent.goClass();
        bigStudent.goClass();
//  输出请假方法
        littleStudent.absence();
        middleStudent.absence();
        bigStudent.absence();
//  输出独特的方法和属性
        System.out.println(littleStudent.getPioneer());
        System.out.println(middleStudent.getSubject());
        littleStudent.outIdentity();
        middleStudent.outSubject();
        bigStudent.outInternship();
    }
}

