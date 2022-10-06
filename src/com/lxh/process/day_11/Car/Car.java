package com.lxh.process.day_11.Car;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 19:01:30
 * 小汽车类
 */
public class Car extends Vehicle{
    private int loader;

    public Car() {
    }

    public Car(int wheels, int weight) {
        super(wheels, weight);
    }

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void output() {
        super.output();
        System.out.println(
                "可装载" + loader + "人"
        );
    }
}
