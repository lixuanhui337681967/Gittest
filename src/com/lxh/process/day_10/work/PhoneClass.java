package com.lxh.process.day_10.work;

/**
 * @author lixuanhui
 * @date 2022年 09月17日 18:50:37
 * 手机类
 */
public class PhoneClass {
    private String brand;
    private int priceCall;
    private int priceMess;
    private String color;

    public PhoneClass() {

    }

    public PhoneClass(String brand, int priceCall, int priceMess, String color) {
        this.brand = brand;
        this.priceCall = priceCall;
        this.priceMess = priceMess;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPriceCall() {
        return priceCall;
    }

    public void setPriceCall(int priceCall) {
        this.priceCall = priceCall;
    }

    public int getPriceMess() {
        return priceMess;
    }

    public void setPriceMess(int priceMess) {
        this.priceMess = priceMess;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(){
        System.out.println(
                "我是"
                + color + "颜色的"
                + brand + "手机，我打电话的价格是"
                + (double)priceCall/10
        );
    }
    public void message(){
        System.out.println("我是"
                + color + "颜色的"
                + brand + "手机，我发短信的价格是"
                + (double)priceMess/10
        );
    }

}
