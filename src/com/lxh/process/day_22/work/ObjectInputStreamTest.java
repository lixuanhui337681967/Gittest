package com.lxh.process.day_22.work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 14:41:33
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("./src/com/lxh/process/day_22/user");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);)
            {
                Object o = objectInputStream.readObject();
                System.out.println(o);
            } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
