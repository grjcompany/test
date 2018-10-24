package com.lcvc.test.service.impl;

import com.lcvc.test.dao.OrderDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class OrderServiceImpl {
    @Resource
    private OrderDao orderDao;




}
