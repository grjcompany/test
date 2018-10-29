package com.lcvc.test.web.admin;


import com.lcvc.test.model.Product;
import com.lcvc.test.service.ProductService;
import com.lcvc.test.test.SpringJunitTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController  extends SpringJunitTest {
    @Resource
    private ProductService productService;

    @RequestMapping(value = "/admin/product", method = RequestMethod.GET)
    public String toManageProduct(HttpServletRequest request){

        request.setAttribute("list",  productService.getProduct());

        return "/jsp/admin/product.jsp";
    }

    @RequestMapping(value = "/admin/doDeleteProduct", method = RequestMethod.GET)
    public String doDeleteProduct(Integer id,HttpServletRequest request){
        productService.deleteProduct(id);
        request.setAttribute("list",  productService.getProduct());
        return "/jsp/admin/product.jsp";
    }

    @RequestMapping(value = "/admin/toUpdateProduct")
    public String toUpdateProduct(Integer id, HttpServletRequest request) {
        request.setAttribute("p", productService.get(id));
        return "/jsp/admin/productupdat.jsp";
    }

    @RequestMapping(value = "/admin/doUpdateProduct")
    public String doUpdateProduct(Product product, HttpServletRequest request) {
        productService.updateProduct(product);
        request.setAttribute("list", productService.getProduct());
        return "/jsp/admin/product.jsp";
    }
}












