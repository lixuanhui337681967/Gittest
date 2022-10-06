package com.lxh.process.day_11.Po;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 16:21:40
 * 圆类
 */
public class Circle extends Po{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void getArea(){
        System.out.println("圆的面积是:" + getΠ() * r * r);
    }
    public void getCircumference(){
//        System.out.println("圆的周长是:" + 2 * getΠ() * r);
        System.out.println("圆的周长是:" + String.format("%.1f",2 * getΠ() * r) );
    }
}
