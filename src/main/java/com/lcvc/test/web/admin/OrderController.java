package com.lcvc.test.web.admin;

import com.lcvc.test.dao.OrderDao;
import com.lcvc.test.model.Order;
import com.lcvc.test.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {

 /* @Resource
    private OrderService orderService;
    private OrderDao orderDao;

    *//*读取所有记录*//*
    @RequestMapping(value = "/order/list")
    public String order(HttpServletRequest request, HttpSession session){
        List<Order> list = orderDao.readAll();
        session.setAttribute("list", orderService.readAll());
        return "/jsp/admin/order.jsp";
    }
*/

}
