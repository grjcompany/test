package com.lcvc.test.web.shop;

import com.lcvc.test.model.Product;
import com.lcvc.test.model.ProductType;
import com.lcvc.test.service.ProductService;
import com.lcvc.test.service.ProductTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {
    @Resource
    private ProductTypeService productTypeService;
    @Resource
    private ProductService productService;
    /*
     * 跳转到首页
     */
    @RequestMapping(value = "/shop/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request,Integer page) {
        //获取产品栏目集合
        List<ProductType> productType=productTypeService.getProductType();
        request.setAttribute("productType", productType);
        //获取最新的8条产品集合
        List<Product> newProduct=productService.getProducts(page);
        request.setAttribute("newProduct", newProduct);
        request.setAttribute("maxPage", productService.maxPage());
        return "/jsp/shop/index.jsp";
    }
}
