package com.lcvc.test.model;


/**
 * 产品类别
 * 
 */

public class ProductType {

	private Integer id;
	private String dessert;//甜品
	private String chinese;//中餐
	private String west;//西餐
	private String drinks;//饮料
	private Integer wine;//酒水
	private String cold;//凉菜
	private String fish;//鱼类
	private String lce;//冰淇淋
	private String tea;//茶水
	private String noodle;//面食

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getChinese() {
		return chinese;
	}

	public void setChinese(String chinese) {
		this.chinese = chinese;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public Integer getWine() {
		return wine;
	}

	public void setWine(Integer wine) {
		this.wine = wine;
	}

	public String getCold() {
		return cold;
	}

	public void setCold(String cold) {
		this.cold = cold;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getLce() {
		return lce;
	}

	public void setLce(String lce) {
		this.lce = lce;
	}

	public String getTea() {
		return tea;
	}

	public void setTea(String tea) {
		this.tea = tea;
	}

	public String getNoodle() {
		return noodle;
	}

	public void setNoodle(String noodle) {
		this.noodle = noodle;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ProductType that = (ProductType) o;

		return id.equals(that.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}