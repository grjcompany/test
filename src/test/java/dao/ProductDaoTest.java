package dao;

import java.util.List;

import javax.annotation.Resource;

import com.lcvc.test.model.Product;
import org.junit.Test;

import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.test.SpringJunitTest;

public class ProductDaoTest extends SpringJunitTest{
	
	@Resource
	private ProductDao productDao;
	
	@Test
	public void readAllTest(){
		List<Product> list=productDao.readAll();
		System.out.println(list.size());
		for(Product product:list){
			System.out.println(product.getName());
			System.out.println(product.getNum());
			System.out.println(product.getPrice());
			System.out.println(product.getPicture());
			System.out.println(product.getPromotion());
			System.out.println(product.getSales());
			System.out.println(product.getTotal());
			System.out.println(product.getProductTypeId());
		}
	}

	@Test
	public void saveTest(){
		Product product=new Product();
		product.setName("番茄炒蛋");
		product.setPicture("aa");
		product.setPrice(22.2f);
		product.setPromotion(16.2f);
		product.setNum("20");
		product.setSales("ds");
		product.setTotal("cc");
		product.setProductTypeId(2);
		productDao.save(product);
	}
	@Test
	public void deleteTest(){
		System.out.println(productDao.delete(4));
	}

	@Test
	public void updateTest(){
		Product product=productDao.get(3);
		product.setName("螺蛳粉");
		product.setPrice(38.2f);
		product.setPicture("ss");
		product.setPromotion(22.0f);
		product.setNum("www");
		product.setSales("fff");
		product.setTotal("cc");
		product.setProductTypeId(5);
		productDao.update(product);
	}

	@Test
	public void getPageListTest(){
		List<Product> list=productDao.getPageList(3,7);
		System.out.println(list.size());
		for(Product product:list){
			System.out.println(product.getName());
		}
	}

	@Test
	public void getNumberOfProduct(){
		System.out.println(productDao.getNumberOfProduct());

	}



}
