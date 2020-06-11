package com.chinasoft.entity;

import java.util.Date;

public class ShopCar {

	private Long shopCarId;
	private String description;
	private int number;
	private String shopCarPrice;
	private Date createTime;
	private Date lastEditTime;
	private Product product;
	private Long userId;
	public Long getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(Long shopCarId) {
		this.shopCarId = shopCarId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getShopCarPrice() {
		return shopCarPrice;
	}
	public void setShopCarPrice(String shopCarPrice) {
		this.shopCarPrice = shopCarPrice;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	
	
}
