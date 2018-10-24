package com.lcvc.test.service.impl;


import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.model.Product;
import com.lcvc.test.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    public  List<Product> getProducts()
    {
        return productDao.readAll();
    }



}
