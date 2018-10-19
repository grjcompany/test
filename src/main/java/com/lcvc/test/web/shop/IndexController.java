package com.lcvc.test.web.shop;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lcvc.test.bean.ProductBean;
import com.lcvc.test.bean.ProductTypeBean;
import com.lcvc.test.model.Product;
import com.lcvc.test.model.ProductType;

@Controller
public class IndexController {
	@Resource
	private ProductTypeBean productTypeBean;
	@Resource
	private ProductBean productBean;
	/*
	 * 跳转到首页
	 */
	@RequestMapping(value = "/shop/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request) {
		//获取产品栏目集合
		List<ProductType> productTypes=productTypeBean.getProductTypes();
		request.setAttribute("productTypes", productTypes);
		//获取最新的8条产品集合
		List<Product> newProducts=productBean.getNewTopProducts();
		request.setAttribute("newProducts", newProducts);
		return "/jsp/shop/index.html";
	}

}
