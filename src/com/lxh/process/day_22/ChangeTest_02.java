package com.lxh.process.day_22;

import java.io.*;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 10:12:21
 */
public class ChangeTest_02 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("./src/com/lxh/process/day_22/test.txt",true);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ){
            bufferedWriter.write("abc");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
