package com.lcvc.test.dao;

import java.util.List;

import com.lcvc.test.model.Product;
import com.lcvc.test.model.ProductType;

public interface ProductTypeDao {
	/*
	 * 读取所有记录
	 */
	List<ProductType> readAll();
	
	/*
	 * 删除记录
	 */
	int delete(int id);
	
	/*
	 * 添加记录
	 */
	int save(ProductType productType);
	
	/*
	 * 读取记录
	 */
	ProductType get(int id);
	
	/*
	 * 编辑记录
	 */
	int update(ProductType productType);

}
