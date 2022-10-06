package com.lxh.process.day_16;

/**
 * @author Mr.Wang
 * @date 22-9-27
 */
public class Integer_01 {
    public static void main(String[] args) {
//        int---Integer,构造方法
        int a=10;
        long b=1L;
        as(b);
        as(a);
//        Integer i=new Integer(a);
        Integer i= a;
        Integer inte = new Integer("10");
        System.out.println(inte);
//        Integer---int   intValue()
//        int i1=inte.intValue();
        int i1 = inte;
//        String---int  Integer.parseInt()
        int i2 = Integer.parseInt("11");
//        int----String   拼接空字符串
        int i3=13;
        String ss=i3+"";
//        String --Integer  构造方法
        Integer inte2 = new Integer("10");
        Integer integer = Integer.valueOf("12");
//        Integer--String  toString()
        inte2.toString();

    }

    public static void as(Object a){
        System.out.println(a);
    }
}
