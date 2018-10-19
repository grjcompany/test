package com.lcvc.test.service.impl;

import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.service.ProductService;

import javax.annotation.Resource;

public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;


}
