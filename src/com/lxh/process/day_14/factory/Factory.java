package com.lxh.process.day_14.factory;

import java.util.Objects;

/**
 * @author lixuanhui
 * @date 2022年 09月22日 16:22:16
 * 工厂类
 */
public class Factory {
    public Object getObjects(int x) {
        if (x == 1){
            return new Clothes();
        }else if (x == 2){
            return new Shoes();
        }
        return null;
    }
}
