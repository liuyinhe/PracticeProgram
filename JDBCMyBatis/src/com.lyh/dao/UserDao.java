package com.lyh.dao;

import com.lyh.common.exception.DaoException;
import com.lyh.dto.User;

import java.util.List;

/**
 * UserDao
 *
 * @author Galaxy  Liu
 * @date 2017/1/2
 */
public interface UserDao {
    //根据id查询用户信息
    public User findUserById(int id) throws DaoException;

    //根据用户名列查询用户列表
    public List<User> findUserByName(String name) throws DaoException;

    //添加用户信息
    public void insertUser(User user) throws DaoException;

    //删除用户信息
    public void deleteUser(int id) throws DaoException;
}
