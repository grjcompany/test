package com.lcvc.test.service;


import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;
    /*
        登录方法
        @param username  账户名
        @param password  密码
        @return true表示登录成功，false表示登录失败
         */
    public boolean login(String username,String password){
        Admin admin=adminDao.login(username, password);
        if(admin!=null){
           return true;
        }else{
            return false;
        }
    }


}