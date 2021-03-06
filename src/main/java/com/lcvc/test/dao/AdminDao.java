package com.lcvc.test.dao;


import com.lcvc.test.model.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/*
 * 该接口用来与mybatis的对应映射文件对接
 */
public interface AdminDao {
	/**
	 * 处理数据库的登录方法
	 * @param username 账户名
	 * @param password 密码
	 * @return  null表示登录失败
	 */
	Admin login(@Param(value = "username") String username, @Param(value = "password") String password);

	/**
	 * 根据账户的标志符删除对应的账户信息
	 * @param id 账户信息的id
	 * @return  删除的记录数
	 */
	int delete(int id);

	/**
	 *  根据账户的标志符读取对应的账户信息
	 * @param id 账户信息的id
	 * @return 账户对象，如果是null表示读取失败
	 */
	Admin get(int id);

	/**
	 * 	将账户信息存入账户表中
	 * @param admin 账户信息，注意表中的非空字段不能为空
	 * @return 添加了几条记录信息
	 */
	int add(Admin admin);

	/**
	 * 从数据库中读取所有账户记录
	 * @return 如果没有记录则集合为空（注意不是Null）
	 */
	List<Admin> readAll();
}

