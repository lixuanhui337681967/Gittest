package com.lxh.process.day_15.work;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 19:49:51
 * 编写程序，现在有一个实体类，类中有属性name，sex，age，school四个属性，还有一个字符串，用&分割， 	现在编写一个方法拆分字符串，比如String  s="name=小明&sex=男&age=18&school=河北科技大学", 	输入到方法中，返回则是一个实体类，该类的name，sex，age，school则被赋上述值。
 */
public class WorkTest_05 {
    public static void main(String[] args) {
        String  s = "name=小明 &sex=男&age=18&school=河北科技大学";
        Student student = new Student();
        Student student1 = student.newStudent(s);
        System.out.println("学生的姓名是：" + student1.getName());
        System.out.println("学生的性别是：" + student1.getSex());
        System.out.println("学生的年龄是：" + student1.getAge());
        System.out.println("学生的学校是：" + student1.getSchoolName());
    }
}
