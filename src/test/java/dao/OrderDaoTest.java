package dao;

import com.lcvc.test.dao.OrderDao;

import com.lcvc.test.model.Order;

import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class OrderDaoTest extends SpringJunitTest{
	
	@Resource
	private OrderDao orderDao;
	@Test
	public void readAllTest() {
		List<Order> list = orderDao.readAll();
		System.out.println(list.size());
		for (Order order : list) {
			System.out.println(order.getName());
			System.out.println(order.getNum());
			System.out.println(order.getPicture());
			System.out.println(order.getTotal());
			System.out.println(order.getUnitprice());
		}
	}
		@Test
		public void deleteTest(){
			orderDao.delete(1);
		}

	@Test
	public void saveTest(){
		Order order=new Order();
		order.setName("红烧排骨");
		order.setNum(16);
		order.setPicture("gg");
		order.setTotal(15.8f);
		order.setUnitprice(10.3f);
		orderDao.save(order);
	}

	@Test
	public void updateTest(){
		Order order=orderDao.get(1);
		order.setPicture("qq");
		order.setPicture("aa");
		order.setName("ss");
		order.setNum(5);
		order.setUnitprice(12.6f);
		order.setTotal(14.2f);
		orderDao.update(order);
	}

}
