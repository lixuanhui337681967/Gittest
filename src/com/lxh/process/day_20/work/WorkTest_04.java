package com.lxh.process.day_20.work;

import com.lxh.process.day_20.work.dao.Patient;

import java.util.*;

/**
 * @author lixuanhui
 * @date 2022年 10月05日 17:04:31
 * 有10个病例类的实例，
 * 有编号、身份证号、姓名属性，
 * 计算按身份征号去重后，
 * 按编号升序打印病例信息
 */
public class WorkTest_04 {

    public static void main(String[] args) {
        HashMap<Integer, Patient> map = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            Patient patient = new Patient(random.nextInt(10), random.nextInt(1000), "一");
            if (!map.containsValue(patient) && !map.containsKey(patient.getId())) {
                map.put(patient.getId_Card(), patient);
            }
        }

        Set<Map.Entry<Integer, Patient>> set = map.entrySet();
        ArrayList<Map.Entry<Integer, Patient>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Patient>>() {
            @Override
            public int compare(Map.Entry<Integer, Patient> o1, Map.Entry<Integer, Patient> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
//        System.out.println(list);
        for (Map.Entry<Integer, Patient> patient :
                list) {
            System.out.println(patient);
        }
    }
}
