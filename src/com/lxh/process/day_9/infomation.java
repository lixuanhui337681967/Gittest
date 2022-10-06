package com.lxh.process.day_9;

/**
 * @author lixuanhui
 * @date 2022年 09月16日 16:27:48
 * 5、某公司正在进行人员信息登记，请编写“个人信息”类，并实现下列属性： 姓名、性别、年龄、家庭住址、学历和对其属性的操作方法。 String name;//姓名 String sex;//性别 int age;//年龄 String address;//家庭住址 String education;//学历
 */
public class infomation {
    /**
     *5、某公司正在进行人员信息登记，请编写“个人信息”类，并实现下列属性：
     * 姓名、性别、年龄、家庭住址、学历和对其属性的操作方法。
     * String name;//姓名
     * String sex;//性别
     * int age;//年龄
     * String address;//家庭住址
     * String education;//学历
     */

     String name;//姓名
     String sex;//性别
     int age;//年龄
     String address;//家庭住址
     String education;//学历


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public infomation() {
    }

    public infomation(String name, String sex, int age, String address, String education) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.education = education;
    }

    public void sout(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(address);
        System.out.println(education);
    }
    public static void main(String[] args) {
        infomation member = new infomation("子黑小", "男", 20, "地球","不告诉你");
        member.sout();
    }
}
