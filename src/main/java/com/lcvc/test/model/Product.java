package com.lcvc.test.model;

public class Product {
    private Integer id;
    private String name;//产品名称
    private String picture;//产品图片
    private Float price;//产品价格
    private Float promotion;//促销价
    private String num;//产品数量
    private String sales;//累计销量
    private String total;//总计
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPromotion() {
        return promotion;
    }

    public void setPromotion(Float promotion) {
        this.promotion = promotion;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}
