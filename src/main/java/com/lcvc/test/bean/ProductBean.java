package com.lcvc.test.bean;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.model.Admin;
import com.lcvc.test.model.Product;

@Service
public class ProductBean {
	@Resource
	private ProductDao productDao;

	public List<Product> getProducts() {
		return productDao.readAll();
	}

	/*public List<Product> getNewTopProducts() {
		return productDao.readNewTop();
	}*/

	public int getProductNumberByProductType(Integer productTypeId){
		return productDao.getNumberByProductType(productTypeId);
	}
	
	/*
	 * 添加产品
	 * @param product
	 * @param creator 发布这个信息的管理账户
	 */
	public void saveProduct(Product product,Admin creator){
		//设置发布者信息
		/*product.setCreator(creator);
		product.setCreateTime(new Date());*/
		productDao.save(product);
	}
	
	public Product getProduct(Integer id){
		Product product=null;
		if(id!=null){
			product=productDao.get(id);
		}
		return product;
	}
	
	public void updateProduct(Product product,Admin finalEditor){
		//最后编辑者信息
		/*product.setFinalEditor(finalEditor);*/
		//最后编辑时间
		/*product.setUpdateTime(Calendar.getInstance().getTime());*/
		//在数据库中更新产品信息
		productDao.update(product);
	}
	
	public void deleteProduct(Integer id){
		if(id!=null){
			productDao.delete(id);
		}
	}

}
