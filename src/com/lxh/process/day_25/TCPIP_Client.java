package com.lxh.process.day_25;

import java.io.*;
import java.net.Socket;

/**
 * @author lixuanhui
 * @date 2022年 10月11日 14:36:43
 */
public class TCPIP_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",11000);
        System.out.println("与服务器连接成功！");
        InputStream inputStream = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        reader.close();
        inputStream.close();
        socket.close();
    }
}
