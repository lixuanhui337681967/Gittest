package com.lxh.process.day_22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 14:37:57
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
//        User user = new User("张三", "zhangsan1");
        list.add(new User("张一", "zhangyi"));
        list.add(new User("张二", "zhanger"));
        list.add(new User("张三", "zhangsan"));

        try (FileOutputStream fileOutputStream = new FileOutputStream("./src/com/lxh/process/day_22/user");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);)
            {
                objectOutputStream.writeObject(list);
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
