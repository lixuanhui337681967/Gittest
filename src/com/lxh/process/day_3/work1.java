package com.lxh.process.day_3;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 19:41:02
 * 作业累加加和
 * 求出 1-100之间的加和
 * 求出 1-100之间的所有奇数和  *
 */
public class work1 {
    public static void main(String[] args) {
//      求出 1-100之间的加和
        int all1 = 0;
        for (int i = 0; i <= 100; i++) {
            all1 += i;
        }
        System.out.println("1-100之间的加和为" + all1);

//      求出 1-100之间的所有奇数和
        int all2 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0){

            }else {
                all2 += i;
            }
        }
        System.out.println("1-100之间所有奇数和为"+ all2);
    }
}
