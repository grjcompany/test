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
	public void readAllTest(){
		List<Order> list=orderDao.readAll();
		System.out.println(list.size());
		for(Order order:list){
			System.out.println(order.getName());
			System.out.println(order.getNumber());
			System.out.println(order.getPicture());
			System.out.println(order.getTotal());
			System.out.println(order.getUnitPrice());
		}
	}

/*	@Test
	public void saveTest(){
		Order order=new Order();
		order.setName("红烧排骨");
		order.setNumber("20");
		order.setTotal("16");
		order.setUnitPrice(20f);
		orderDao.save(order);
	}*/

}
