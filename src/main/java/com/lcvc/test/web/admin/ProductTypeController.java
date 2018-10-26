package com.lcvc.test.web.admin;

import com.lcvc.test.dao.ProductTypeDao;
import com.lcvc.test.model.ProductType;
import com.lcvc.test.service.ProductTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductTypeController {
    @Resource
    private ProductTypeService productTypeService;

    @RequestMapping(value = "/admin/producttype", method = RequestMethod.GET)
    public String toManageProductType(HttpServletRequest request){

        request.setAttribute("list",  productTypeService.getProductType());

        return "/jsp/admin/producttype.jsp";
    }

    @RequestMapping(value = "/admin/doDeleteProductType", method = RequestMethod.GET)
    public String doDeleteProductType(Integer id,HttpServletRequest request){
        productTypeService.deleteProductType(id);
        request.setAttribute("list",  productTypeService.getProductType());
        return "/jsp/admin/producttype.jsp";
    }

    @RequestMapping(value = "/admin/toUpdateProductType")
    public String toUpdateProductType(Integer id,HttpServletRequest request){
        request.setAttribute("p", productTypeService.get(id));
        return "/jsp/admin/producttypeupdat.jsp";
    }

    @RequestMapping(value = "/admin/doUpdateProductType")
    public String doUpdateProductType(ProductType productType,HttpServletRequest request){
        productTypeService.updateProductType(productType);
        request.setAttribute("list",  productTypeService.getProductType());
        return "/jsp/admin/producttype.jsp";
    }
}
