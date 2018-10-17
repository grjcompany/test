package com.lcvc.test.model;
public class Order {
    private Integer id;
    private String picture;
    private String name;
    private Float UnitPrice;
    private Integer number;
    private Float total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        UnitPrice = unitPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
}