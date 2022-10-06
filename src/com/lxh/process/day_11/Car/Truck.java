package com.lxh.process.day_11.Car;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 19:01:39
 * 卡车类
 */
public class Truck extends Car{
    private int payload;

    public Truck() {
    }

    public Truck(int wheels, int weight) {
        super(wheels, weight);
    }

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public Truck(int loader) {
        super(loader);
    }

    public Truck(int wheels, int weight, int loader) {
        super(wheels, weight, loader);
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public void output() {
        super.output();
        System.out.println(
                "载重量为" + payload + "t"
        );
    }
}
