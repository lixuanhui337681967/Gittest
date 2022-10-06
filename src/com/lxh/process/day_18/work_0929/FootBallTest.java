package com.lxh.process.day_18.work_0929;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author lixuanhui
 * @date 2022年 09月29日 20:28:39
 * 已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数  2008 北京奥运会男足参赛国家： 科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
 */
public class FootBallTest {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚", "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"));
        getRandom(objects);
    }

    private static void getRandom(ArrayList arrayList) {
        int[] diff = getDifferentNum();
        for (int i = 0; i < 4; i++) {
            System.out.println(
                    "第" + (i + 1) + "组为:" + arrayList.get(diff[4 * i])
                            + "," + arrayList.get(diff[4 * i + 1])
                            + "," + arrayList.get(diff[4 * i + 2])
                            + "," + arrayList.get(diff[4 * i + 3])
            );
        }
    }

    public static int[] getDifferentNum() {
        int[] arr = new int[16];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
//            0-16
            arr[i] = random.nextInt(16);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        return arr;
    }
}
