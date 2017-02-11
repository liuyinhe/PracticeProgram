package com.lyh.dto;

import java.util.Date;

/**
 * User
 *
 * @author Galaxy  Liu
 * @date 2017/1/2
 */
public class UserInfor {
    //属性名要和数据库表的字段对应
    private int id;
    private String user_name;// 用户姓名
    private String sex;// 性别
    private Date birthday_Date;// 生日
    private String address_infor;// 地址

    @Override
    public String toString() {
        return "UserInfor{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday_Date=" + birthday_Date +
                ", address_infor='" + address_infor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday_Date() {
        return birthday_Date;
    }

    public void setBirthday_Date(Date birthday_Date) {
        this.birthday_Date = birthday_Date;
    }

    public String getAddress_infor() {
        return address_infor;
    }

    public void setAddress_infor(String address_infor) {
        this.address_infor = address_infor;
    }
}
