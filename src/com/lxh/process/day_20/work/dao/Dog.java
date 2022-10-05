package com.lxh.process.day_20.work.dao;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 18:32:27
 */
public class Dog {
    private int id;
    private String name;

    public Dog() {
    }

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog：" +
                "id=" + id +
                ", name='" + name;
    }
}
