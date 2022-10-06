package com.lxh.process.day_16.work;

import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 09月27日 17:07:27
 * 生成五个不同的数 [1~5]
 * 		不能保证每次生成的数据是不同的
 * 		创建一个长度为5的数组,把生成的数据放到数组中,并保证数据不重复
 * 		1 1~5中生成数据
 * 		2 判断数组中是否有该数据
 * 		3 有就跳过继续生成
 * 		4 没有就放进去
 * 		5 一直把数组放满为止
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        for (int eve: getDifferentNum()) {
            System.out.println(eve);
        }
    }
    public static int[] getDifferentNum(){
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5)+1;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        return arr;
    }
    public static int[] getDifferentNum2(){
        int index=0;
        int[] arr = new int[5];
        Random random = new Random();
        while (index<arr.length){
            int count=0;
            int num = (random.nextInt(5)+1);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=num){
                    count++;
                }
            }
            if (count==arr.length){
                arr[index]=num;
                index++;
            }
        }
        return arr;
    }

}
