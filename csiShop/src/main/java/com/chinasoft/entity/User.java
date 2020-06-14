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
	private List<UserOrder> orderList;
	private List<ProductCollection> productCollectionList;
	private List<ShopCar> shopCarList;
	
	public List<UserOrder> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<UserOrder> orderList) {
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId) {
		super();
		this.userId = userId;
	}
	public User(Long userId, String name, String profileImg, String phone, String email, String gender,
			Integer enableStatus, Date createTime, Date lastEditTime, List<UserAddress> userAddressList,
			List<Order> orderList, List<ProductCollection> productCollectionList, List<ShopCar> shopCarList) {
		super();
		this.userId = userId;
		this.name = name;
		this.profileImg = profileImg;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.enableStatus = enableStatus;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
		this.userAddressList = userAddressList;
		this.orderList = orderList;
		this.productCollectionList = productCollectionList;
		this.shopCarList = shopCarList;
	}
	public User(Long userId, String name, String profileImg, String phone, String email, String gender,
			Integer enableStatus, Date createTime, Date lastEditTime) {
		super();
		this.userId = userId;
		this.name = name;
		this.profileImg = profileImg;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.enableStatus = enableStatus;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", profileImg=" + profileImg + ", phone=" + phone
				+ ", email=" + email + ", gender=" + gender + ", enableStatus=" + enableStatus + ", createTime="
				+ createTime + ", lastEditTime=" + lastEditTime + ", userAddressList=" + userAddressList
				+ ", orderList=" + orderList + ", productCollectionList=" + productCollectionList + ", shopCarList="
				+ shopCarList + "]";
	}
	
	
	
}
