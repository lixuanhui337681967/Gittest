package com.lxh.process.day_11.Po;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 16:37:51
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5,5);
        circle.getArea();
        circle.getCircumference();
        cylinder.getVolumn();
        cylinder.getArea();
    }
}
