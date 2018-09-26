package com.lcvc.test.service;


import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.model.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminDao adminDao;

    public boolean login(String username,String password){
        Admin admin=adminDao.login(username, password);
        if(admin!=null){
           return true;
        }else{
            return false;
        }
    }


}
