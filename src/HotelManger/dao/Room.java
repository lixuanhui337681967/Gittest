package HotelManger.dao;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author lixuanhui
 * @date 2022年 09月30日 15:49:48
 * 房间类
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    //    房间id
    private int room_id;
    //    房间层数
    private int room_layer;
    //    是否被预定，默认没有false
    private boolean status = false;
    //    标准or豪华
    private String room_kind;

    public Room() {
    }

    public Room(int room_layer, int room_id, boolean status, String room_kind) {
        this.room_layer = room_layer;
        this.room_id = room_id;
        this.status = status;
        this.room_kind = room_kind;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_layer() {
        return room_layer;
    }

    public void setRoom_layer(int room_layer) {
        this.room_layer = room_layer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRoom_kind() {
        return room_kind;
    }

    public void setRoom_kind(String room_kind) {
        this.room_kind = room_kind;
    }

    //    初始化50个房间
    public static ArrayList<Room> newRoom() {
        ArrayList<Room> rooms = new ArrayList<>();
        String type = "";
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i <= 2) {
                    type = "标准间";
                }
                if (i > 2 && i <= 4) {
                    type = "双人间";
                }
                if (i == 5) {
                    type = "豪华间";
                }
                rooms.add(new Room(i, 100 * i + j, false, type));
            }
        }
        return rooms;
    }

    @Override
    public String toString() {
        String status_re = "";
        if (status) {
            status_re = "占用";
        } else {
            status_re = "空闲";
        }
        return "[" + room_id + " " + room_kind +
                " " + status_re + "]";
    }
}
