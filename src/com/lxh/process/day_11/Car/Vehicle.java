package com.lxh.process.day_11.Car;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 19:01:13
 * 汽车类
 */
public class Vehicle {
    private int wheels;
    private int weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void output(){
        System.out.println(
                "汽车的轮子数量为："
                        + wheels + "，汽车的重量为："
                        + weight + "t"
        );
    }
}
