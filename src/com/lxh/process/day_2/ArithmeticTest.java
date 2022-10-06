package com.lxh.process.day_2;

/**
 * @author lixuanhui
 * @date 2022年 09月06日 15:46:46
 * 算术运算符的使用
 */
public class ArithmeticTest {
    public static void main(String[] args) {
        int a = 12;
        int b = 24;

        int c= a++ + ++a ;
        int d= ++b + b++ ;
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(d);
        System.out.println(2<<4);
        System.out.println(2<<9);
        System.out.println((2<<30)-1);
        System.out.println(-2<<4);
        System.out.println(3<<2);
//        0000 0011  3 2+1
//        0000 1100  12 8+4
        System.out.println(-3<<2);
//        1000 0011 (源码) -> 1111 1100(反码) -> 1111 1101 (补码)
//        1111 0100 (移动后的补码) -> 1111 0011 (反码) -> 1000 1100 (源码) -12
        System.out.println(-3>>2);
//        1000 0011 (源码) -> 1111 1100 (反码) -> 1111 1101 (补码)
//        1111 1111 (移动后的补码) -> 1111 1110 (反码) -> 1000 0001 (源码) -1


    }
}
