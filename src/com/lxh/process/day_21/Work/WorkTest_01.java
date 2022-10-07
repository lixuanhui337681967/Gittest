package com.lxh.process.day_21.Work;

import java.io.*;
/**
 * @author lixuanhui
 * @date 2022年 10月06日 16:31:24
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("./src/com/lxh/process/day_21/Work/input.zip");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream("./src/com/lxh/process/day_21/Work/output.zip");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
