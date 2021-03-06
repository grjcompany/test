package com.lcvc.test.service;


import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface AdminService {
    /**
     * 登录方法
     *
     * @param username 账户名
     * @param password 密码
     * @return null表示登录失败
     */
    Admin login(String username, String password);

    /**
     * 获取所有账户集合
     */
    List<Admin> getAdmins();

    /**
     * 删除指定账户
     * @param id
     */
    void deleteAdmin(Integer id);


}

