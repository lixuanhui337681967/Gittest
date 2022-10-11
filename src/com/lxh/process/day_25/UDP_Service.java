package com.lxh.process.day_25;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 16:01:23
 */
public class UDP_Service {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(12000);
        System.out.println("服务启动成功");

        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        while (true) {
            datagramSocket.receive(datagramPacket);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            System.out.println(dataInputStream.readUTF());
        }
    }
}
