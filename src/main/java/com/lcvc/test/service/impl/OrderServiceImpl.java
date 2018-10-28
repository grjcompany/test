package com.lcvc.test.service.impl;

import com.lcvc.test.dao.OrderDao;
import com.lcvc.test.model.Order;
import com.lcvc.test.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderDao orderDao;

    public List<Order> getOrders(){
        return orderDao.readAll();
    }




}
