package HotelManger.dao;


import HotelManger.Exception_NoMem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


/**
 * @author lixuanhui
 * @date 2022年 09月30日 15:49:28
 * 酒店类
 */
public class Hotel extends Room {

    public Hotel() {
    }

    public Hotel(int room_id, int room_layer, boolean status, String room_kind) {
        super(room_id, room_layer, status, room_kind);
    }

    //    预定或退订房间
    public static void orderOrExitRooms(ArrayList<Room> rooms, String status) {
        Scanner scanner = new Scanner(System.in);
        Iterator<Room> iterator = rooms.iterator();
        System.out.println("请输入房间编号");
        int inputId = 0;
        try {
            inputId = scanner.nextInt();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("输入错误");
            return;
        }
        while (iterator.hasNext()) {
            Room room = iterator.next();

            if (room.getRoom_id() == inputId) {
                if (room.isStatus() && "预定".equals(status)) {
                    System.out.println("房间已被订阅");
                }
                if (room.isStatus() && "退订".equals(status)) {
                    room.setStatus(false);
                    System.out.println("房间退订成功");
                }
                if (!room.isStatus() && "预定".equals(status)) {
                    room.setStatus(true);
                    System.out.println("房间预定成功");
                    System.out.println("您预定的房间为" + room.getRoom_layer() + "层的" + room.getRoom_id() + "号");
                }
                if (!room.isStatus() && "退订".equals(status)) {
                    System.out.println("房间没有被订阅");
                }
                break;
            } else if (!iterator.hasNext()) {
                throwException("房间不存在");
            }
        }
    }


    //    选择房间
    public static void selectRoom(ArrayList<Room> rooms) {
        Scanner input = new Scanner(System.in);
        System.out.println("1、查看单人间，2、查看双人间，3、查看豪华间，4、返回上一级");
        String num = input.next();
        switch (num) {
            case "1":
                chooseRoom(rooms, "单人间");
                return;
            case "2":
                chooseRoom(rooms, "双人间");
                return;
            case "3":
                chooseRoom(rooms, "豪华间");
                return;
            case "4":
                System.out.println("提示：返回成功！");
                return;
            default:
                System.out.println("输入错误，请重新输入！");
                break;
        }
    }

    //查看房间间
    public static void chooseRoom(ArrayList<Room> rooms, String name) {
        Iterator<Room> iterator = rooms.iterator();
        System.out.println("目前的" + name + "有：");
        while (iterator.hasNext()) {
            for (int i = 1; i <= 50; i++) {
                Room x = iterator.next();
                if ("单人间".equals(name) && i <= 20) {
                    System.out.print(x);
                }
                if ("双人间".equals(name) && i >= 21 && i <= 40) {
                    System.out.print(x);
                }
                if ("豪华间".equals(name) && i >= 41) {
                    System.out.print(x);
                }
                if (i % 10 == 0) {
                    System.out.println();
                }
                if ("单人间".equals(name) && i == 20) {
                    break;
                } else if ("双人间".equals(name) && i == 40) {
                    break;
                } else if ("豪华间".equals(name) && i == 50) {
                    break;
                }
            }
            break;
        }
    }

    //    查看所有房间
    public static void allRoom(ArrayList<Room> rooms) {
        Iterator<Room> iterator = rooms.iterator();
        System.out.println("目前的房间有：");
        while (iterator.hasNext()) {
            for (int i = 1; i <= 50; i++) {
                Room x = iterator.next();
                System.out.print(x);
                if (i % 10 == 0) {
                    System.out.println();
                }
            }

        }
    }

    public static void throwException(String msg) {
        try {
            throw new Exception_NoMem(msg);
        } catch (Exception_NoMem e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
