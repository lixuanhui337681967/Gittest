package com.lxh.process.day_23.Work;

import java.io.*;

/**
 * @author lixuanhui
 * @date 2022年 10月08日 18:35:57
 */
public class WorkTest {
    public static void main(String[] args) {
        File file = new File("./src/com/lxh/process/day_21");
        recursionCopy(file);
    }

    public static void recursionCopy(File file) {
        if (file.isFile()) {
            if (file.getName().endsWith(".java")) {
                String absolutePath = file.getAbsolutePath();
                String newPath = "./src/com/lxh/process/day_23/work/test.txt";

                File newFile = new File(newPath);
                File parentFile = newFile.getParentFile();
                if (!newFile.getParentFile().exists()) {
                    parentFile.mkdirs();
                }

                try (FileReader fis = new FileReader(absolutePath);
                     BufferedReader bis = new BufferedReader(fis);
                     FileWriter fos = new FileWriter(newPath, true);
                     BufferedWriter bos = new BufferedWriter(fos)) {


                    int read = 0;
                    char[] chars = new char[1024];
                    while ((read = bis.read(chars)) != -1) {
                        bos.write(chars, 0, read);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {
            File[] files = file.listFiles();
            for (File eve : files) {
                recursionCopy(eve);
            }
        }
    }
}
