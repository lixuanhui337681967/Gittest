package com.lxh.process.day_10.work;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 19:20:09
 * 女朋友类
 */
public class GirlFriendClass {
    private String name;
    private int weight;
    private int height;

    public GirlFriendClass() {
    }

    public GirlFriendClass(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void wash(){
        System.out.println(
                name + "开始给我做饭"
        );
    }
    public void cook(){
        System.out.println(
                name + "开始给我洗衣服"
        );
    }
    public void show(){
        System.out.println(
                "我叫" + name + "，我的身高是" + height + "cm，体重是" + weight + "kg"
        );
    }
}
