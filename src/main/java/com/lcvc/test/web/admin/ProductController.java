package com.lcvc.test.web.admin;


import com.lcvc.test.model.Product;
import com.lcvc.test.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController {
    @Resource
    private ProductService productService;


    /*读取所有记录*/
    @RequestMapping(value = "/admin/product")
    public String product(HttpServletRequest request, HttpSession session){

        request.setAttribute("product", productService.getProducts());
        return "jsp/admin/product.jsp";
    }
    @RequestMapping(value = "/admin/product/", method = RequestMethod.GET)
    public String toManageProduct(HttpServletRequest request){
        List<Product> list=productService.getProducts();
        request.setAttribute("list", list);
        return "/jsp/admin/product/productmanage.jsp";
    }

    /* 删除*/
    @RequestMapping(value = "/admin/products")
    public String products(Integer id, HttpServletRequest request){
        productService.delete(id);
        request.setAttribute("product", productService.getProducts());
        return "/jsp/admin/product.jsp";
    }

    /*修改*/
    @RequestMapping(value = "/admin/productss")
    public String productss(Product product, HttpServletRequest request){
        productService.update(product);
        request.setAttribute("product", productService.getProducts());
        return "/jsp/admin/add.jsp";
    }











}
