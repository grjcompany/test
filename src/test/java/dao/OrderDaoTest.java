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
		}
	}



	@Test
	public void saveTest(){

	}
}
