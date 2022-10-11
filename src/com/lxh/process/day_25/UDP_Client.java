package com.lxh.process.day_25;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 16:01:12
 */
public class UDP_Client {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while (!s.equals("exit")){
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF(s);

            byte[] bytes = byteArrayOutputStream.toByteArray();
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 10000);
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetSocketAddress);
            DatagramSocket datagramSocket = new DatagramSocket(9999);

            datagramSocket.send(datagramPacket);

            datagramSocket.close();
            s = scanner.next();
        }
    }
}
