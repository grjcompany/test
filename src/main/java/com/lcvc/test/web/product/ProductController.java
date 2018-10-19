package com.lcvc.test.web.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcvc.test.bean.ProductBean;
import com.lcvc.test.bean.ProductTypeBean;
import com.lcvc.test.model.Admin;
import com.lcvc.test.model.Product;
import com.lcvc.test.model.ProductType;

@Controller
public class ProductController {
	@Resource
	private ProductBean productBean;
	@Resource
	private ProductTypeBean productTypeBean;
	
	
	@RequestMapping(value = "/admin/product/toManageProduct", method = RequestMethod.GET)
	public String toManageProduct(HttpServletRequest request){	
		List<Product> list=productBean.getProducts();
		request.setAttribute("list", list);
		return "/jsp/admin/product/productmanage.jsp";
	}
	
	@RequestMapping(value = "/admin/product/toAddProduct", method = RequestMethod.GET)
	public String toAddProduct(HttpServletRequest request){	
		//将产品分类信息从数据库中查找出来，并传递到页面中
		List<ProductType> productTypes=productTypeBean.getProductTypes();
		request.setAttribute("productTypes", productTypes);		
		return "/jsp/admin/product/productadd.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value = "/admin/product/doAddProduct", method = RequestMethod.POST)
	public Map<String,Object> doAddProduct(HttpServletRequest request,HttpSession session,Product product){
		Map<String,Object> map=new HashMap<String,Object>();//定义一个map集合			
		if(product.getProductTypeId()==null){
			map.put("myMessage", "产品信息添加失败：请选择产品分类");
		}else if(product.getName().length()==0){
			map.put("myMessage", "产品信息添加失败：请输入产品名称");
		}else if(product.getPrice()==null){
			map.put("myMessage", "创建产品信息失败：现价不能为空");
		}else{
			productBean.saveProduct(product, (Admin)session.getAttribute("admin"));
			map.put("status", 1);
		}		
		return map;
	}
	
	@RequestMapping(value = "/admin/product/toUpdateProduct", method = RequestMethod.GET)
	public String toUpdateProduct(HttpServletRequest request,Integer id){	
		//将产品分类信息从数据库中查找出来，并传递到页面中
		List<ProductType> productTypes=productTypeBean.getProductTypes();
		request.setAttribute("productTypes", productTypes);	
		request.setAttribute("product", productBean.getProduct(id));
		return "/jsp/admin/product/productupdate.jsp";
	}
	
	@RequestMapping(value = "/admin/product/doUpdateProduct", method = RequestMethod.POST)
	public String doUpdateProduct(HttpServletRequest request,Product product,HttpSession session){	
		//将产品分类信息从数据库中查找出来，并传递到页面中
		List<ProductType> productTypes=productTypeBean.getProductTypes();
		request.setAttribute("productTypes", productTypes);	
		productBean.updateProduct(product, (Admin)session.getAttribute("admin"));
		request.setAttribute("myMessage", "产品信息更新成功");		
		return "/jsp/admin/product/productupdate.jsp";
	}
	
	@ResponseBody
	@RequestMapping(value = "/admin/product/doDeleteProduct", method = RequestMethod.GET)
	public Map<String,Object> doDeleteProduct(Integer id,HttpServletRequest request){
		Map<String,Object> map=new HashMap<String,Object>();//定义一个map集合			
		productBean.deleteProduct(id);
		map.put("status", 1);		
		return map;
	}
}
