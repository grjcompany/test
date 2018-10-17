package com.lcvc.test.dao;

import com.lcvc.test.model.Order;
import com.lcvc.test.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/*
 * 该接口用来与mybatis的对应映射文件对接
 */
public interface OrderDao {
	/**
	 * 读取所有记录
	 */
	List<Order> readAll();

	/**
	 * 插入记录
	 */
	int save(Order order);
}
