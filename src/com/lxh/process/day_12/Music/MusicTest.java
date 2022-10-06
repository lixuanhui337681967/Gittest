package com.lxh.process.day_12.Music;

/**
 * @author lixuanhui
 * @date 2022年 09月20日 11:40:29
 * 音乐测试类
 */
public class MusicTest {
    public static void main(String[] args) {
//        三个乐器类
        Erhu erhu = new Erhu();
        Piano piano = new Piano();
        Violin violin = new Violin();
//        乐手类
        Musican musican = new Musican();

        musican.play(erhu);
        musican.play(piano);
        musican.play(violin);


    }
}
