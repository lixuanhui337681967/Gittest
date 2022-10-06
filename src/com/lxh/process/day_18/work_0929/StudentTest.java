package com.lxh.process.day_18.work_0929;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 18:46:58
 * 学生测试类
 */
public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("小明",1);
        Student student2 = new Student("张三",2);
        Student student3 = new Student("李四",3);
        Student student4 = new Student("张三",4);
        Student student5 = new Student("王五",5);

        ArrayList<Student> studentArr = new ArrayList<Student>(){
            {
                add(student1);
                add(student2);
                add(student3);
                add(student4);
                add(student5);
            }
        };

        Iterator<Student> iterator = studentArr.iterator();

        studentArr.set(4,new Student("小黑",5));

        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student.toString());
        }

    }
}
