package com.lxh.process.day_11.Po;

/**
 * @author lixuanhui
 * @date 2022年 09月19日 16:20:20
 * Po(点)类
 */
public class Po {
    private int x;
    private int y;

    private  final double Π = 3.14;

    public Po() {
    }

    public Po(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getΠ() {
        return Π;
    }
}
