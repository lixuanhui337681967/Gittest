package com.lxh.process.day_21;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author lixuanhui
 * @date 2022年 10月06日 14:38:30
 */
public class Reader_01 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("./src/com/lxh/process/day_21/1006IO.md")){
            int read = 0;
            char[] chars = new char[1024];
            while ((read = fileReader.read(chars)) != -1){
                System.out.println(new String(chars,0,read));
                System.out.println(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
