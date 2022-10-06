package com.lxh.process.day_4;

/**
 * @author lixuanhui
 * @date 2022年 09月09日 14:52:43
 * 1.求1+2+3+4…+n？（写成方法的形式，入参是long类型的n，返回值是long类型的值） 用循环求累加加和（也可以用递归，写出一种即可）
 */
public class ProgramTest {
    public static void main(String[] args) {
        long num = 100;
        long sum = getSum(num);
        System.out.println(sum);
    }
    public static long getSum(long num){
        if (num == 1){
            return 1;
        }else{
            return num + getSum(num-1);
        }
    }
}
