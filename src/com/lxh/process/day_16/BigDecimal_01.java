package com.lxh.process.day_16;

import java.math.BigDecimal;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 16:12:46
 */
public class BigDecimal_01 {
    public static void main(String[] args) {
//        构造方法
        BigDecimal a = new BigDecimal(20.0);
        BigDecimal b = new BigDecimal(3.0);

        BigDecimal add = a.add(b);
        BigDecimal sub = a.subtract(b);
        BigDecimal mult = a.multiply(b);
//        注意点：除法：三个参数
//        1.除数 2.保留几位小数 3.取舍模式（用的时候自己查）
        BigDecimal div = a.divide(b,3,BigDecimal.ROUND_HALF_UP);
        BigDecimal rem = a.remainder(b);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(rem);
//        与钱相关的项目需要使用BigDecimal，精度高
    }
}
