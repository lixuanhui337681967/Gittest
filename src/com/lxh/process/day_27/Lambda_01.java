package com.lxh.process.day_27;

/**
 * @author lixuanhui
 * @date 2022年 10月13日 09:43:22
 */
public class Lambda_01 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
//    1.初始写法
//        for (int i :
//             ints) {
//            System.out.println("=====" + i);
//        }
//    2.匿名内部类
//        forEach(ints, new Lambda() {
//            @Override
//            public void m1(int a) {
//                System.out.println("=====" + a);
//            }
//        });
//    3.子实现类
//        forEach(ints, new lam());
//    4.Lambda
        forEach(ints, i -> System.out.println("======" + i));
    }

    public static void forEach(int[] ints, Lambda lambda) {
        for (int i :
                ints) {
            lambda.m1(i);
        }
    }
}

interface Lambda {
    void m1(int a);
}

class lam implements Lambda {
    @Override
    public void m1(int a) {
        System.out.println("=====" + a);
    }
}