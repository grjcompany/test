package dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.lcvc.test.dao.AdminDao;
import com.lcvc.test.dao.ProductTypeDao;
import com.lcvc.test.model.ProductType;
import com.lcvc.test.test.SpringJunitTest;

public class ProductTypeDaoTest extends SpringJunitTest {

	@Resource
	private ProductTypeDao productTypeDao;

	@Test
	public void readAllTest() {
		List<ProductType> list = productTypeDao.readAll();
		System.out.println(list.size());
	}
	@Test
	public void deleteTest(){
		productTypeDao.delete(1);
	}
	@Test
	public void getTest(){
		ProductType p=productTypeDao.get(3);
		System.out.println(p.getDessert());
	}
	@Test
	public void saveTest(){
		ProductType productType=new ProductType();
		productType.setDessert("菜单1");
		productType.setChinese("cc");
		productType.setWest("dd");
		productType.setDrinks("cc");
		productType.setWine(30);
		productType.setCold("栏目1");
		productType.setFish("cc");
		productType.setLce("dd");
		productType.setLce("cc");
		productType.setNoodle("本栏目是……");
		productTypeDao.save(productType);
	}
	@Test
	public void updateTest(){
		ProductType p=productTypeDao.get(2);
		p.setDessert("bb");
		productTypeDao.update(p);
	}

}
