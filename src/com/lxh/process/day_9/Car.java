package com.lxh.process.day_9;

/**
 * @author lixuanhui
 * @date 2022年 09月16日 16:33:10
 * 6、定义一个Car类，具有： 属性：品牌、速度（默认速度为60）、模式（默认是人工驾驶） 功能：输出当前驾驶模式和驾驶速度
 */
public class Car {
    String kind;
    static int speed = 60;
    static String mode = "人工驾驶";

    public Car(String kind, int speed, String mode) {
        this.kind = kind;
        this.speed = speed;
        this.mode = mode;
    }

    public void Fuction(String c){
        System.out.println("驾驶速度为" + speed + "当前驾驶模式为" + mode);
    }
    public static void main(String[] args) {
        Car car = new Car("卡车", 100, "自动驾驶");
        car.Fuction("卡车");
    }
//  0000 0001
//  0000 0010
//  0000 0000
//  0000 0011
}
