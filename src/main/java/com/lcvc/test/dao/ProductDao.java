package com.lcvc.test.dao;

import com.lcvc.test.model.Product;

import java.util.List;

public interface ProductDao {
	/**
	 * 读取所有记录
	 */
	List<Product> readAll();

	/*
	 * 读取最新的几条记录
	 */
	List<Product> readNewTop();
	/**
	 * 插入记录
	 */
	int save(Product product);

    /*
	 * 编辑记录
	 */

	int update(Product product);
	
	/*
         * 读取指定记录
         */
	Product get(int id);



	/*
         * 获取指定栏目下的产品数量集合
         */
	int getNumberByProductType(int productTypeId);

	/*
     * 删除指定记录
     */
	int delete(int id);


}
