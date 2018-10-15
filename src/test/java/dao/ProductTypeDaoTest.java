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
		System.out.println(p.getName());
	}
	@Test
	public void saveTest(){
		ProductType productType=new ProductType();
		productType.setName("栏目1");
		productType.setImageUrl("cc");
		productType.setOrderNum(30);
		productType.setLinkUrl("cc");
		productType.setIntro("本栏目是……");
		productTypeDao.save(productType);
	}
	@Test
	public void updateTest(){
		ProductType p=productTypeDao.get(2);
		p.setName("bb");
		productTypeDao.update(p);
	}

}
