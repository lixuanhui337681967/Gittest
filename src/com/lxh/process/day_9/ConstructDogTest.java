package com.lxh.process.day_9;

/**
 * @author lixuanhui
 * @date 2022年 09月16日 15:38:15
 */
public class ConstructDogTest {

    String name;
    int age;
    String sex;
    String variety;
    static String eat = "eat";

    public ConstructDogTest() {
    }

    public ConstructDogTest(String name, int age, String sex, String variety) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.variety = variety;
    }

    public void eat(){
        sout();
    }

    public void eat(String eat){
        this.eat = eat;
        sout();
    }
    public void sout(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(variety);
        System.out.println(eat);
    }
    public static void main(String[] args) {
        ConstructDogTest dog = new ConstructDogTest("小黑", 1, "m", "田园犬");
        dog.eat("bones");
    }
}
