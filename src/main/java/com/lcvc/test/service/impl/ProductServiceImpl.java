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



    @Override
    public List<Product> getProducts() {
        return productDao.readAll();
    }

    @Override
    public List<Product> readNewTop() {
        return productDao.readNewTop();
    }

    @Override
    public int save(Product product) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return productDao.delete(id);
    }

    @Override
    public int update(Product product) {
        return productDao.update(product);
    }








   /* @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public int save(Product product) {
        return 0;
    }

    @Override
    public int update(Product product) {
        return 0;
    }*/


}
