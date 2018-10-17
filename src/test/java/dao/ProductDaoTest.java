package dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.dao.ProductDao;
import com.lcvc.test.dao.ProductTypeDao;
import com.lcvc.test.model.Product;
import com.lcvc.test.model.ProductType;
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
			System.out.println(product.getPrice());
			System.out.println(product.getProductTypeId());
		}
	}

	@Test
	public void saveTest(){
		Product product=new Product();
		product.setName("红烧排骨");
		product.setPrice(3.2f);
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
		product.setProductTypeId(5);
		productDao.update(product);
	}

}
