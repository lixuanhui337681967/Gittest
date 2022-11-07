package com.lxh.process.day_2;

/**
 * @author lixuanhui
 * @date 2022年 09月06日 19:59:59
 * 练习2.docx 第1题
 */
public class MathDemo {
    public static void main(String[] args) {
        //将变量m的初值赋值为10，变量n的初值赋值为5
        int m = 10,n = 5;
        //变量m的值加3，n的值加5
        m+=3;
        n+=5;
        //求m和n的平均值，并将结果存于变量p中
        double p;
        p = (double)(m+n)/2;
        //求m的平方乘以n的平方，并将结果存于变量q中
        int q;
        q = m*n;
        //将p和q的值打印输出
        System.out.println("p的值为：" + p);
        System.out.println("q的值为：" + q);
    }
}
