package com.lxh.process.day_16.work;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 19:58:45
 * 使用 Math.random()  完成随机数
 * 		要求 随机生成 a-z中的任意一个
 *
 * 		注意 : 0<= random()  < 1
 */
public class WorkTest_02 {
    public static void main(String[] args) {
        System.out.println(outStr());
    }
    public static char outStr(){
//        97<= ascii <123 左开右闭
        double ceil = Math.floor(Math.random() * 26 + 97);
//        int ascii = (int) ceil;
        return (char) ceil;

    }
}
