package com.lxh.process.day_11.Car;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 19:02:02
 * 汽车测试类
 */
public class CarTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,10);
        Car car = new Car(4,15,4);
        Truck truck = new Truck(6,30,6,30);
        vehicle.output();
        car.output();
        truck.output();
    }
}
