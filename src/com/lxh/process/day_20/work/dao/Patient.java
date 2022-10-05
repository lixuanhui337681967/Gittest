package com.lxh.process.day_20.work.dao;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 19:11:06
 */
public class Patient {
    private int id;
    private int id_Card;
    private String name;

    public Patient() {
    }

    public Patient(int id, int id_Card, String name) {
        this.id = id;
        this.id_Card = id_Card;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Card() {
        return id_Card;
    }

    public void setId_Card(int id_Card) {
        this.id_Card = id_Card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "病人的编号为：" + id +
                ",身份证号为" + id_Card +
                ", 名字是" + name;
    }
}
