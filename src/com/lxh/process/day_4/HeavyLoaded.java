package com.lxh.process.day_4;

/**
 * @author lixuanhui
 * @date 2022年 09月08日 11:29:30
 * 方法的重载
 */
public class HeavyLoaded {
    public static void main(String[] args) {

        long a = getLong(2);
        short b = getShort((short) 2);
        int c = getInte(2);


    }

    public static int getSum(){
        return 2+3;
    }
//    public static int getSum(){
//        return 2+3;
//    }

    public static long getLong(long i){
        return i;
    }
    public static short getShort(short i){
        return i;
    }
    public static int getInte(int i){
        return i;
    }
//
    public static int getNum(int i){
        return i;
    }
    public static long getNum(long i){
        return i;
    }
    public static short getNum(short i){
        return i;
    }
}
