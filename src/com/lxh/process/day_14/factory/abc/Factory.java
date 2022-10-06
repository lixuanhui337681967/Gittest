package com.lxh.process.day_14.factory.abc;

/**
 * @author Mr.Wang
 * @date 22-9-22
 */
public class Factory {
    public Object getObj(int a){
        if(a==1){
//            返回衣服
            return new Clothes();
        }else if(a==2){
//            返回鞋
            return new Shoes();
        }else{
            return null;
        }
    }
}
