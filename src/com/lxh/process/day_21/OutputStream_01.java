package com.lxh.process.day_21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lixuanhui
 * @date 2022年 10月06日 15:06:33
 */
public class OutputStream_01 {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("D:/outputStream.txt",false)) {
//            fileOutputStream.write(97);
//            fileOutputStream.write(98);
//            fileOutputStream.write(99);
//            fileOutputStream.write(100);
            String str = "abdefg";
            byte[] bytes = str.getBytes();
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
