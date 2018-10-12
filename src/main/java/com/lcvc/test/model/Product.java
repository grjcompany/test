package com.lcvc.test.model;


/**
 * 产品
 * 
 */

public class Product implements java.io.Serializable {

	private Integer id;
	//private Integer productTypeId;//产品分类外键
	private ProductType productType;//所属产品类别
	private String name;//产品名称
	private Integer orderNum;//优先级
	private String description;//产品描述
	private String content;//产品详细描述
	private Float price;//产品现价
	private Float originalPrice;//产品原价
	private String picUrl;//产品图片路径
	private Integer number;//库存数量

	//非数据库字段
	//private List<ProductOrder> productOrders = new ArrayList<ProductOrder>();//该产品对应的订单
	//private Float totalPriceOfTrade;//该产品的总交易额
	private Integer totalNumberOfOrder;//该产品的订单数
	
	//private Integer numberOfCart;//获取购物车的数量，用于在下订单时候显示
	
	//用于前台显示字段
	//private Integer onSaleOfSelect;//上架选择，目前是-1表示永久上架、1表示临时上架和0表示下架



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}