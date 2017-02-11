package com.lyh.dto;

import java.io.Serializable;

/**
 * QueryConditionVo
 *
 * @author Galaxy  Liu
 * @date 2017/1/7
 */
public class QueryConditionVo implements Serializable{
    private static final long serialVersionUID = 6025845092554691899L;
    private String userName;
    private  int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
