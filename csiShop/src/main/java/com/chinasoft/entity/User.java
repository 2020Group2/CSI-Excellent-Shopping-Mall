package com.chinasoft.entity;

import java.util.Date;
import java.util.List;

public class User {
	private Long userId;
	private String name;
	private String profileImg;
	private String phone;
	private String email;
	private String gender;
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
	private List<UserAddress> userAddressList;
	private List<Order> orderList;
	private List<ProductCollection> productCollectionList;
	private List<ShopCar> shopCarList;
	
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public List<ProductCollection> getProductCollectionList() {
		return productCollectionList;
	}
	public void setProductCollectionList(List<ProductCollection> productCollectionList) {
		this.productCollectionList = productCollectionList;
	}
	public List<ShopCar> getShopCarList() {
		return shopCarList;
	}
	public void setShopCarList(List<ShopCar> shopCarList) {
		this.shopCarList = shopCarList;
	}
	public List<UserAddress> getUserAddressList() {
		return userAddressList;
	}
	public void setUserAddressList(List<UserAddress> userAddressList) {
		this.userAddressList = userAddressList;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getEnableStatus() {
		return enableStatus;
	}
	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
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
	
	
	
}
