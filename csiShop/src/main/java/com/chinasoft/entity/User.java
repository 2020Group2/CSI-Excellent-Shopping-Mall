package com.chinasoft.entity;

import java.util.Date;
import java.util.List;

public class User {
	private Long user_id;//用户id号
	private String name;//用户名
	private String password;//用户登陆密码
	private String profileImg;//头像
	private String phone;//电话
	private String email;//邮箱
	private String gender;//性别
	private Integer enable_status;//帐号状态0：不可登录 1：可登录
	private Date create_time;//账户创建时间
	private Date last_edit_time;//上次编辑信息时间
	private List<UserAddress> userAddressList;
	private List<UserOrder> orderList;
	private List<ProductCollection> productCollectionList;
	private List<ShopCar> shopCarList;
<<<<<<< Updated upstream
	public Long getUser_id() {
		return user_id;
=======
	
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
>>>>>>> Stashed changes
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Integer getEnable_status() {
		return enable_status;
	}
	public void setEnable_status(Integer enable_status) {
		this.enable_status = enable_status;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getLast_edit_time() {
		return last_edit_time;
	}
	public void setLast_edit_time(Date last_edit_time) {
		this.last_edit_time = last_edit_time;
	}
<<<<<<< Updated upstream
	public List<UserAddress> getUserAddressList() {
		return userAddressList;
	}
	public void setUserAddressList(List<UserAddress> userAddressList) {
		this.userAddressList = userAddressList;
	}
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
	public User(Long user_id, String name, String password, String profileImg, String phone, String email,
			String gender, Integer enable_status, Date create_time, Date last_edit_time,
			List<UserAddress> userAddressList, List<UserOrder> orderList, List<ProductCollection> productCollectionList,
			List<ShopCar> shopCarList) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.password = password;
		this.profileImg = profileImg;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.enable_status = enable_status;
		this.create_time = create_time;
		this.last_edit_time = last_edit_time;
		this.userAddressList = userAddressList;
		this.orderList = orderList;
		this.productCollectionList = productCollectionList;
		this.shopCarList = shopCarList;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", password=" + password + ", profileImg=" + profileImg
				+ ", phone=" + phone + ", email=" + email + ", gender=" + gender + ", enable_status=" + enable_status
				+ ", create_time=" + create_time + ", last_edit_time=" + last_edit_time + ", userAddressList="
				+ userAddressList + ", orderList=" + orderList + ", productCollectionList=" + productCollectionList
				+ ", shopCarList=" + shopCarList + "]";
	}
=======
>>>>>>> Stashed changes
	
	
	
	
	
}

