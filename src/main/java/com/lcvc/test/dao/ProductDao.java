package com.lcvc.test.dao;

import java.util.List;

import com.lcvc.test.model.Product;

public interface ProductDao {
	/**
	 * 读取所有记录
	 */
	List<Product> readAll();

    /*
	 * 编辑记录
	 */

	int update(Product product);
	
	/*
         * 读取指定记录
         */
	Product get(int id);
	/**
	 * 插入记录
	 */
	int save(Product product);
	/*
         * 删除指定记录
         */
	int delete(int id);

	/*
         * 获取指定栏目下的产品数量集合
         */
	int getNumberByProductType(int productTypeId);
}
