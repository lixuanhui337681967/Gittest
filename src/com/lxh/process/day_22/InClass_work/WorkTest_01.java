package com.lxh.process.day_22.InClass_work;

import java.io.*;
/**
 * @author lixuanhui
 * @date 2022年 10月06日 16:31:24
 */
public class WorkTest_01 {
    public static void main(String[] args) {
        try (
             FileInputStream fileInputStream = new FileInputStream("./src/com/lxh/process/day_22/Work/input.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
             FileOutputStream fileOutputStream = new FileOutputStream("./src/com/lxh/process/day_22/Work/output.txt");
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             PrintStream printStream = new PrintStream(bufferedOutputStream);
        ) {
            int read = 0;
            while ((read = bufferedInputStream.read()) != -1) {
                printStream.print((char)read);
                System.out.print(((char)read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
