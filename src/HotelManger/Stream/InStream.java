package HotelManger.Stream;

import HotelManger.dao.Room;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author lixuanhui
 * @date 2022年 10月07日 17:25:09
 * 序列化
 */
public class InStream {
    public static ArrayList<Room> inRoom(){
        ArrayList<Room> o = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream("./src/HotelManger/temp/a");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);)
        {
            o = (ArrayList) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}
