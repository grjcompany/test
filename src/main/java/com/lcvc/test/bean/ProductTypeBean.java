package com.lcvc.test.bean;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.dao.ProductTypeDao;
import com.lcvc.test.model.ProductType;

@Service
public class ProductTypeBean {
	@Resource
	private ProductTypeDao productTypeDao;
	@Resource
	private ProductDao productDao;
	
	public List<ProductType> getProductTypes(){
		List<ProductType> list=productTypeDao.readAll();
		for(ProductType productType:list){
			//遍历产品分类集合，然后对各个分类对象的指定属性进行验证或者赋值
			//获取该栏目下的产品数量
			int productNumber=productDao.getNumberByProductType(productType.getId());
			/*productType.setProductNumber(productNumber);*/
		}
		return list;
	}
	
	public void deleteProductType(Integer id){
		if(id!=null){
			//获取该栏目下的产品数量
			int productNumber=productDao.getNumberByProductType(id);
			if(productNumber==0){//如果没有产品数量
				productTypeDao.delete(id);
			}		
		}		
	}
	
	public void saveProduct(ProductType productType){
		productTypeDao.save(productType);
	}
	
	public ProductType getProductType(Integer id){
		return productTypeDao.get(id);
	}
	
	public void updateProduct(ProductType productType){
		productTypeDao.update(productType);
	}
}
