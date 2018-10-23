package com.lcvc.test.service.impl;

import com.lcvc.test.dao.DetailsDao;
import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.model.Details;
import com.lcvc.test.service.DetailsService;
import com.lcvc.test.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DetailsServiceImpl implements DetailsService {
    /*@Resource
    private DetailsDao detailsDao;

    @Override
    public List<Details> getDetails() {
        return detailsDao.readAll();
    }


    @Override
    public void deleteDetails(Integer id){
        detailsDao.delete(id);
    }*/
}
