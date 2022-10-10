package com.lxh.process.day_23;

import java.io.*;

/**
 * @author lixuanhui
 * @date 2022年 10月08日 10:39:04
 */
public class Recursion_copy01 {
    public static void main(String[] args) {
        File file = new File("./src/com/lxh/process/day_23/测试目录");
        recursionCopy(file);
    }
    public static void recursionCopy(File file){
        if (file.isFile()) {
            String absolutePath = file.getAbsolutePath();
            String newPath = absolutePath.substring(0,66) + "测试目录2" + absolutePath.substring(70);
//            String newPath = "目标主路径"  + "切割后面的目标路径";

//            String absolutePath = file.getAbsolutePath();
//            String newPath = "E:/TianLiangJiaoYu/JavaSE/HelloWorld/src/com/lxh/process/day_23/" + "测试目录1" + absolutePath.substring(70);

            File newFile = new File(newPath);
            File parentFile = newFile.getParentFile();
            if (!newFile.getParentFile().exists()){
                parentFile.mkdirs();
            }

//            try {
//                FileOutputStream fileOutputStream = new FileOutputStream(newFile);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }

            try(FileInputStream fis = new FileInputStream(absolutePath);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(newPath);
                BufferedOutputStream bos = new BufferedOutputStream(fos))
                {
                int read = 0;
                byte[] bytes = new byte[1024];
                while ((read = bis.read(bytes)) != -1){
                    bos.write(bytes, 0, read);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else {
            File[] files = file.listFiles();
            for (File eve: files) {
                recursionCopy(eve);
            }
        }
    }
}
