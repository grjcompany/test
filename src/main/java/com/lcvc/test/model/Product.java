package com.lcvc.test.model;


/**
 * 产品
 * 
 */

public class Product implements java.io.Serializable {

	private Integer id;
	private String name;//产品名称
	private Float price;//产品现价
	private Integer productTypeId;//产品分类Id

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
}