package service;

import com.lcvc.test.service.OrderService;
import com.lcvc.test.test.SpringJunitTest;
import org.junit.Test;

import javax.annotation.Resource;

public class OrderServiceTest extends SpringJunitTest {
  @Resource
    private OrderService orderService;

    @Test
    public void getOrdersTest(){
        System.out.println("账户总数："+ orderService.getOrders().size());
    }

}
