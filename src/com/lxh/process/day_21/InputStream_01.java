package com.lxh.process.day_21;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author lixuanhui
 * @date 2022年 10月06日 11:31:00
 */
public class InputStream_01 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("./src/com/lxh/process/day_21/1006IO.md")){
            int read = 0;
//        while ((read = fileInputStream.read()) != -1) {
//            System.out.print((char)read);
//        }

            byte[] bytes = new byte[1024];
            while ((read = fileInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes,0,read));
                System.out.println(read);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
