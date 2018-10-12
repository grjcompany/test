package com.lcvc.test.model;


/**
 * 产品类别
 * 
 */

public class ProductType{

	private Integer id;
	private String name;//产品类别名称
	private String linkUrl;//转向链接地址（如果存在则直接转向链接地址，否则打开本网站栏目）
	private String imageUrl;//栏目的标题图片地址
	private String intro;//栏目简介
	private Integer orderNum;//排序（默认0，规则由前台决定，一般排序为最大）
	
	//非数据库字段
	//private List<Product> productList = new ArrayList<Product>();//该栏目下的产品集合
	private Integer productNumber;//该栏目下的产品数量
	//private Float totalPriceOfTrade;//该栏目的总交易额
	//private Integer totalNumberOfOrder;//该栏目的订单成交数
	
	
	public ProductType() {
	}
	
	public ProductType(int id) {
		this.id=id;
	}

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

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(Integer productNumber) {
		this.productNumber = productNumber;
	}
	
}