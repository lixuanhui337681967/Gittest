package com.lxh.process.day_25;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 14:36:30
 */
public class TCPIP_Service {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        while (true) {
        ServerSocket serverSocket = new ServerSocket(11000);
        System.out.println("服务器创建成功,正在等待连接ing");
        Socket accept = serverSocket.accept();
        System.out.println("用户连接成功!");
        OutputStream outputStream = accept.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.out.println("请输入要传达的信息");
        String line = scanner.nextLine();
        printStream.print(line);
//        printStream.print("你好！");
        printStream.flush();
        System.out.println("与该客户端断开连接！" + "\n");
        printStream.close();
        outputStream.close();
        accept.close();
        serverSocket.close();
//        }
    }
}
