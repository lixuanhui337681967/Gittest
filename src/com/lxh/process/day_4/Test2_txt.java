package com.lxh.process.day_4;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 19:55:13
 * 实现代码:递归求1+2+3+…+10
 */
public class Test2_txt {
    public static void main(String[] args) {
        int num2 = 10;
        int sum = getSum(num2);
        System.out.println("递归求1+2+3+…+10的结果为" + sum);
    }
    public static int getSum(int num) {
        if (num == 1) {
            return 1;
        }else {
            return num + getSum(num - 1);
        }
    }
}
