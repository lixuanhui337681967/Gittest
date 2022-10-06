package com.lxh.process.day_16;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 15:21:32
 */
public class Math_01 {
    public static void main(String[] args) {
//        绝对值
        System.out.println(Math.abs(-1));
//        开平方
        System.out.println(Math.sqrt(4));
//        开立方
        System.out.println(Math.cbrt(8));
//        a的b次方
        System.out.println(Math.pow(2,3));
//        向上取整
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.ceil(2.001));
//        向下取整
        System.out.println(Math.floor(2.001));
        System.out.println(Math.floor(2.999));
//        0-1左开右闭
        System.out.println(Math.random());
//        1-10
        System.out.println(Math.random()*9+1);
//        10-20
        System.out.println(Math.random()*10+10);
//        15-30
        System.out.println(Math.random()*15+15);
//        规律：  *（最大值 - 最小值） + 最小值

//        四舍五入  四舍六入五留双
//        小数点后面是5，小数点后面除了5之外还有没有其他的书
//        有，进位
//        没有：判断小数点前面的数是奇数还是偶数
//        奇数：进位  偶数：保留
        System.out.println(Math.rint(6.5));






    }
}
