package com.lcvc.test.service.impl;

import com.lcvc.test.dao.OrderDao;
import com.lcvc.test.dao.ProductTypeDao;
import com.lcvc.test.model.ProductType;
import com.lcvc.test.service.ProductTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Resource
    private ProductTypeDao productTypeDao;

    public List<ProductType> getProductType() {
        return productTypeDao.readAll();
    }

    @Override
    public void deleteProductType(Integer id){
        productTypeDao.delete(id);
    }

    @Override
    public void updateProductType(ProductType productType){
        productTypeDao.update(productType);
    }

    @Override
    public ProductType get(Integer id) {
        return productTypeDao.get(id);
    }
}
