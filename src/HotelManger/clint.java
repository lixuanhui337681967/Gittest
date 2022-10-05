package HotelManger;

import HotelManger.dao.Hotel;
import HotelManger.dao.Room;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author lixuanhui
 * @date 2022年 09月30日 15:50:56
 * 管理
 */
public class clint {
    public static void main(String[] args) {
        System.out.println("欢迎使用本酒店管理系统，本系统可以实现预定房间、退订房间的功能，请根据需求来进行选择");
        ArrayList<Room> rooms = Room.newRoom();
        Scanner input = new Scanner(System.in);
        Hotel.allRoom(rooms);
        while (true) {
//            System.out.println("1、预定房间，2、退订房间，3、查看房间，4、退出");
            System.out.println("1、预定房间，2、退订房间，3、查看指定房间信息，4、查看所有房间，5、退出");
            String num = input.next();
            switch (num) {
                case "1":
                    Hotel.orderOrExitRooms(rooms,"预定");
                    Hotel.allRoom(rooms);
                    break;
                case "2":
                    Hotel.orderOrExitRooms(rooms,"退订");
                    Hotel.allRoom(rooms);
                    break;
                case "3":
                    Hotel.selectRoom(rooms);
                    break;
                case "4":
                    Hotel.allRoom(rooms);
                    break;
                case "5":
                    System.out.println("提示：退出成功！");
                    return;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }
}
