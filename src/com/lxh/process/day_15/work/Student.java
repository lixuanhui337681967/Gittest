package com.lxh.process.day_15.work;

/**
 * @author lixuanhui
 * @date 2022年 09月26日 19:50:10
 * WorkTest_05的实体类
 */
public class Student {
    private String name;
    private String sex;
    private String age;
    private String schoolName;
    private final String a = "&";

    public Student() {
    }

    public Student(String name, String sex, String age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getA() {
        return a;
    }

    public Student newStudent(String s){
        String[] split = s.split(a);
        Student student = new Student();
        for (String eve: split) {
            if (eve.contains("name")) {
                String value = eve.substring(eve.indexOf("=") + 1);
                student.setName(value);
            }
            if (eve.contains("age")) {
                String value = eve.substring(eve.indexOf("=") + 1);
                student.setAge(value);
            }
            if (eve.contains("sex")) {
                String value = eve.substring(eve.indexOf("=") + 1);
                student.setSex(value);
            }
            if (eve.contains("school")) {
                String value = eve.substring(eve.indexOf("=") + 1);
                student.setSchoolName(value);
            }
        }
        return student;
    }
}
