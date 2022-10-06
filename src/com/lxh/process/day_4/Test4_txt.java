package com.lxh.process.day_4;

import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 20:00:41
 * 实现代码:写一个递归方法,输入一个非负整数,返回组成它的数字之和  123：1+2+3
 */
public class Test4_txt {
    public static void main(String[] args) {
        System.out.println("输一个数字");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = addNum(n);
        System.out.println("数字之和为" + i);


//            int aa = 12 , bb =4;
//            int expr = aa++ % ++bb *2 + bb < aa ? aa+bb : aa-bb;
//        System.out.println(expr);

    }
    public static int addNum(int num) {
        if (num < 10){
            return num;
        }
        return num%10 + addNum(num/10);
    }
}

