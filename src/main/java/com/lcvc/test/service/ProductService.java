package com.lcvc.test.service;


import com.lcvc.test.model.Admin;
import com.lcvc.test.model.Product;

import java.util.List;

public interface ProductService {
    /**
     * 读取所有记录
     */
  /*  List<Product> readAll();*/

    List<Product> getProducts();
    /*
	 * 读取最新的几条记录
	 */
    List<Product> readNewTop();
    /**
     * 插入记录
     */
    int save(Product product);


    /*
     * 删除指定记录
     */
    int delete(int id);

      /*
	 * 编辑记录
	 */

    int update(Product product);
}

