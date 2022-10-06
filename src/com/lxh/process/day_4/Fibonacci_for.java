package com.lxh.process.day_4;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 15:55:39
 * for循环实现Fibonacci
 */
public class Fibonacci_for {
    public static void main(String[] args) {

        long num = 20;
        long number = getNumber(num);
        System.out.println(number);
//        if (i == 1 || i == 2) {
//            System.out.println("第" + i + "个位置为1");
//        }else {
//            long j_1 = 1;
//            long j_2 = 1;
//            long j_3;
//            for (int j = 3; j <= i; j++) {
//                j_3 = j_1 + j_2;
//                j_1 = j_2;
//                j_2 = j_3;
//                num = j_3;
//            }
//        }
//        System.out.println(num);
    }
    public static long getNumber(long num){
        if (num == 1 || num == 2) {
            return 1;
        }else{
            long i_1 = 1;
            long i_2 = 1;
            long i_3 = 0;
            for (int i = 3;i <= num; i++){
                i_3 = i_1 + i_2;
                i_1 = i_2;
                i_2 = i_3;
            }
            return i_3;
        }
    }
}
