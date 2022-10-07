package HotelManger.Stream;

import HotelManger.dao.Room;
import com.lxh.process.day_22.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 17:24:50
 * 反序列化
 */
public class OutStream {
    public static void outRoom(ArrayList list){
        File file = new File("./src/HotelManger/temp");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath() + "/a");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);)
        {
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
