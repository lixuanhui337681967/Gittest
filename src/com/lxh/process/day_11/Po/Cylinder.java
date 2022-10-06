package com.lxh.process.day_11.Po;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 16:25:32
 * 圆柱体类
 */
public class Cylinder extends Circle{
    private double h;

    public Cylinder() {
    }

    public Cylinder(double h) {
        this.h = h;
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public Cylinder(int x, int y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void getVolumn(){
        System.out.println("圆柱的体积是:" + getΠ() * getR() * getR() * h);
    }

    public void getArea(){
        System.out.println("圆柱的表面积是:" + (2 * getΠ() * getR() * getR() + 2 * getΠ() * getR() * h));
    }
}
