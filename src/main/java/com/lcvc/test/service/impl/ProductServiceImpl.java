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
    public List<Product> getProduct() {
        return productDao.readAll();
    }

    @Override
    public void deleteProduct(Integer id) {
        productDao.delete(id);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.update(product);
    }

    @Override
    public Product get(Integer id) {
        return productDao.get(id);
    }

    @Override
    public List<Product> getProducts(Integer page) {
        //每页显示记录数
        int pageSize=6;
        //获取产品总记录数
        int total=productDao.getNumberOfProduct();
        //获取最大页
        int maxpage=0;
        if (total % pageSize == 0) {
            maxpage=total/pageSize;
        }else{
            maxpage=total/pageSize+1;
        }
        if(page==null){
            page=1;
        }
        if(page>maxpage){
            page=maxpage;
        }
        //获取数据库中的数据起始位置
        int index=pageSize*(page-1);
        //获取数据库中数据的结束个数（需要判定，不能超出表中的最大记录数）
        if(total<pageSize*page){
            pageSize=total-pageSize*(page-1);
        }
        //从数据库中得出记录
        List<Product> list=productDao.getPageList(index,pageSize);
        return list;
    }

    @Override
    public int maxPage() {
        //每页显示记录数
        int pageSize=6;
        //获取产品总记录数
        int total=productDao.getNumberOfProduct();
        //获取最大页
        int maxpage=0;
        if (total % pageSize == 0) {
            maxpage=total/pageSize;
        }else{
            maxpage=total/pageSize+1;
        }
        return maxpage;
    }
}



