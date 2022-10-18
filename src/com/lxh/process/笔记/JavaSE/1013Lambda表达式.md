## Lambda表达式

1. #### 特点：允许把函数作为一个方法的参数

```java
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
```

#### 语法特点：

- 可选类名声明
- 可选的参数圆括号
- 可选的大括号
- 可选的返回关键字

#### 函数式接口

- 其本质是有且只有一个抽象方法，但是可以有多个非抽象方法
- 函数式接口都可以转换为Lambda表达式
