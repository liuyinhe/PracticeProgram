package com.lyh.dao;

import com.lyh.dto.Orders;
import com.lyh.dto.QueryConditionVo;
import com.lyh.dto.User;
import com.lyh.dto.UserInfor;

import java.util.List;

/**
 * Created by galaxy on 2017/1/7.
 */
public interface UserMapper {
    //根据id查询用户信息
    public User findUserById(int id) throws Exception;

    //根据用户名列查询用户列表
    public List<User> findUserByName(String name) throws Exception;
    public List<User> findUserByName(User name) throws Exception;
    //查询订单关联查询用户，用户信息是延迟加载
    public List<Orders> findOrdersUserLazyLoading()throws Exception;

    public List<UserInfor> findUserByUserName(QueryConditionVo name) throws Exception;

    //添加用户信息
    public void insertUser(User user) throws Exception;

    //删除用户信息
    public void deleteUser(int id) throws Exception;

    //更新用户
    public void updateUser(User user)throws Exception;
}
