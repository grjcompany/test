package com.lcvc.test.service;


import com.lcvc.test.model.ProductType;

import java.util.List;

public interface ProductTypeService {

    /**
     * 获取所有账户集合
     */
    List<ProductType> getProductType();

    /**
     * 删除指定账户
     * @param id
     */
    void deleteProductType(Integer id);

    /*
	 * 编辑记录
	 */
    void updateProductType(ProductType productType);

    /*
	 * 读取记录
	 */
    ProductType get(Integer id);

}

