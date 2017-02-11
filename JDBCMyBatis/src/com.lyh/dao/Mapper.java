package com.lyh.dao;

import com.lyh.dto.Orders;
import com.lyh.dto.OrdersCustom;
import com.lyh.dto.User;

import java.util.List;

/**
 * mapper
 *
 * @author Galaxy  Liu
 * @date 2017/1/17
 */
public interface Mapper {
    //查询订单关联查询用户信息
    public List<OrdersCustom> findOrdersUser() throws Exception;

    //根据id查询用户信息
    public User findUserById(int id) throws Exception;
    public List<Orders> findOrdersUserLazyLoading()throws Exception;

    public List<Orders>  findOrdersAndOrderDetailResultMap()throws Exception;


}

