package com.lxh.process.day_21;

import java.io.*;

/**
 * @author lixuanhui
 * @date 2022年 10月06日 15:23:03
 */
public class Writer_01 {
    public static void main(String[] args) {
        String s = "";
        long start = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader("./src/com/lxh/process/day_21/1006IO.md");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            int read = 0;
            char[] chars = new char[1024];
            while ((read = bufferedReader.read(chars)) != -1) {
                s = new String(chars, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("./src/com/lxh/process/day_21/test.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write(s.toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader fileReader = new FileReader("./src/com/lxh/process/day_21/test.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            int read = 0;
            while ((read = bufferedReader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("使用了" + (end - start) + "毫秒");
    }
}
