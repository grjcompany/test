package com.lcvc.test.dao;


import com.lcvc.test.model.Admin;
import com.lcvc.test.model.Details;
import com.lcvc.test.model.Order;
import com.lcvc.test.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;



/*
 * 该接口用来与mybatis的对应映射文件对接
 */
public interface DetailsDao {
	/**
	 * 读取所有记录
	 */
	List<Details> readAll();

	/**
	 * 插入记录
	 */
	int save(Details details);

	/*
	 * 删除记录
	 */
	int delete(int id);

	/*
	 * 读取记录
	 */
	Details get(int id);

	/*
	 * 编辑记录
	 */
	int update(Details details);
}

