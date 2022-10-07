package com.lxh.process.day_22.work;

import java.io.*;
import java.util.Objects;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 16:33:51
 * 1 多文件内容合并读问题：
 * 任意给定多个文本文件路径合并为一个大的文本文件
 * ，并保存名为merge.txt。 1)、如给定"one.txt”
 * ,“two.txt”，“three.txt"三个文本文件路径 2)
 * 、内部分别存储内容"内容One"、“内容Two”、“内容Three" 3)
 * 、合并完成后merge.txt的结果为三行文字，分别为“内容One"
 * 、"内容Two"、"内容Three"
 */
public class workTest_01 {
    public static void main(String[] args) {
        File file = new File("./src/com/lxh/process/day_22/work/input");
//        System.out.println(file.listFiles());
        for (File file1 : file.listFiles()){
            try(FileReader fileReader = new FileReader(file1);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter("./src/com/lxh/process/day_22/work/output/merge.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                ) {
                int read = 0;
                while ((read = bufferedReader.read()) != -1) {
                    printWriter.write((char) read);
                }
                printWriter.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
