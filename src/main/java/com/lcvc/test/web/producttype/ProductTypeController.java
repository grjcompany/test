package com.lcvc.test.web.producttype;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lcvc.test.bean.ProductBean;
import com.lcvc.test.bean.ProductTypeBean;
import com.lcvc.test.model.ProductType;

@Controller
public class ProductTypeController {
	
	@Resource
	private ProductTypeBean productTypeBean;
	@Resource
	private ProductBean productBean;

	/*
	 * 张三丰，20180325
	 * 处理登录请求
	 */
	@RequestMapping(value = "/admin/producttype/toManageProductType", method = RequestMethod.GET)
	public String toManageProductType(HttpServletRequest request){	
		List<ProductType> list=productTypeBean.getProductTypes();
		request.setAttribute("list", list);
		return "/jsp/admin/producttype/producttypemanage.jsp";
	}
	
	@RequestMapping(value = "/admin/producttype/doDeleteProductType", method = RequestMethod.GET)
	public String doDeleteProductType(Integer id,HttpServletRequest request){
		productTypeBean.deleteProductType(id);
		return "/admin/producttype/toManageProductType";
	}
	
	
	@RequestMapping(value = "/admin/producttype/toAddProductType")
	public String toAddProductType(){		
		return "/jsp/admin/producttype/producttypeadd.jsp";
	}
	
	@RequestMapping(value = "/admin/producttype/doAddProductType", method = RequestMethod.POST)
	public String doAddProductType(ProductType productType){		
		productTypeBean.saveProduct(productType);
		return "/jsp/admin/producttype/producttypeadd.jsp";
	}
	
	@RequestMapping(value = "/admin/producttype/toUpdateProductType")
	public String toUpdateProductType(Integer id,HttpServletRequest request){	
		request.setAttribute("productType", productTypeBean.getProductType(id));
		return "/jsp/admin/producttype/producttypeupdate.jsp";
	}
	
	@RequestMapping(value = "/admin/producttype/doUpdateProductType")
	public String doUpdateProductType(ProductType productType,HttpServletRequest request){		
		productTypeBean.updateProduct(productType);
		return "/jsp/admin/producttype/producttypeupdate.jsp";
	}
	
}
