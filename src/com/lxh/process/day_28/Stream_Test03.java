package com.lxh.process.day_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lixuanhui
 * @date 2022年 10月14日 11:23:01
 */
public class Stream_Test03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Stream<Integer> stream = list.stream();
//        forEach遍历数组
        stream.map(x->x*2).forEach(x-> System.out.println(x));

//        min取排好序的最左边，max取排好序的最右边
        stream = list.stream();
        Optional<Integer> min = stream.map(x -> x * 2).min((o1, o2) -> o2 - o1);
        System.out.println(min);
        stream = list.stream();
        Optional<Integer> max = stream.map(x -> x * 2).max((o1,o2) -> o2 - o1);
        System.out.println(max);

//        count
        stream = list.stream();
        long count = stream.filter(x -> x!=3).count();
        System.out.println(count);

//        collect 收集器，一般传Collectors.toList(),返回一个新的集合，集合中数据就是处理好的数据
        stream = list.stream();
        List<Integer> collect = stream.map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);

//        anyMatch 是否包含,contains有局限性，用anyMatch可以完成自定义类的判断
        stream = list.stream();
        boolean b = stream.map(x -> x * 2).anyMatch(x -> x ==4);
        System.out.println(b);
        String a ="asdda";
        System.out.println(a.contains("z"));

        Student student1 = new Student("张三1", 21);
        Student student2 = new Student("张三2", 22);
        Student student3 = new Student("张三3", 23);
        Student student4 = new Student("张三4", 24);
        Student student5 = new Student("张三5", 25);
        List<Student> list1 = Arrays.asList(student1, student2, student3, student4, student5);
        boolean b1 = false;
        for (Student student : list1) {
            if (student.getAge() == 21){
                b1 = true;
                break;
            }
        }
        System.out.println(b1);
        boolean b2 = list1.stream().anyMatch(new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                if (student.getAge() == 21){
                    return true;
                }
                return false;
            }
        });
        System.out.println(b2);
        boolean b3 = list1.stream().anyMatch(x -> x.getAge() == 21);
        System.out.println(b3);
    }
}

class Student{
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
