package com.lxh.process.day_3;

/**
 * @author lixuanhui
 * @date 2022年 09月07日 19:41:53
 * 有100匹马,分别是大马,中马,和小马 ,有100块砖头
 * 大马 一次能驮3块砖
 * 中马 一次能驮2块砖
 * 三匹小马 一次能驮 1块砖
 * 刚好一次驮完,问 有多少大马,多少中马,多少小马(每种马的个数不能为0,并且不能有闲着的马)
 * 注意 : 小马个数 是3的倍数,类型可以使用double
 */
public class work2 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        for ( x = 1; x < 100; x++) {
            for ( y = 1; y < 100; y++) {
                for ( z = 3; z < 100; z+=3) {
                    if ( x + y + z == 100 && 3*x + 2*y + z/3 == 100){
                        System.out.println("大马有" + x + "匹," + "中马有" + y + "匹," + "小马有" + z + "匹");
                        System.out.println("大马拉" + 3*x + "块砖," + "中马拉" + 2*y + "块砖," + "小马拉有" + z/3 + "块砖");
                        System.out.println();
                    }
                }}
        }
    }
}
