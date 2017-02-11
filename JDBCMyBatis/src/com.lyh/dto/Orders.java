package com.lyh.dto;

import java.util.Date;
import java.util.List;

/**
 * Orders
 *
 * @author Galaxy  Liu
 * @date 2017/1/17
 */
public class Orders {

    private User user;
    private int id;
    private int userId;
    private String number;
    private Date createtime;
    private String note;
    private List<OrderSDetail> orderdetails;

    public List<OrderSDetail> getOrderdetails() {
        return orderdetails;
    }


    public void setOrderdetails(List<OrderSDetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                '}';
    }
}
