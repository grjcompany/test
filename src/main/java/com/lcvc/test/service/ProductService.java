package com.lcvc.test.service;


import com.lcvc.test.model.Admin;
import com.lcvc.test.model.Product;

import java.util.List;

public interface ProductService {
    /**
     * 获取所有账户集合
     */
    List<Product> getProduct();

    /**
     * 删除指定账户
     * @param id
     */
    void deleteProduct(Integer id);

    /*
	 * 编辑记录
	 */
    void updateProduct(Product product);

    /*
	 * 读取记录
	 */
    Product get(Integer id);

    /**
     * 显示当前页的记录数
     * @param page 当前页
     * @return
     */
    List<Product> getProducts(Integer page);

    /**
     * 获取最大页
     * @return
     */
    int maxPage();
}

