package com.lcvc.test.model;

public class Details {
    private Integer id;
    private String name;//产品名称
    private String picture;//产品现价
    private Float originalPrice;//产品分类Id
    private Float promotion;
    private String number;
    private String sales;

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

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Float getPromotion() {
        return promotion;
    }

    public void setPromotion(Float promotion) {
        this.promotion = promotion;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }
}
