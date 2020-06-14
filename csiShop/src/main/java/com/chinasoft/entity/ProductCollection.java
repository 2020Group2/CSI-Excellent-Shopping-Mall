package com.chinasoft.entity;

import java.util.Date;

public class ProductCollection {

	@Override
	public String toString() {
		return "ProductCollection [collectionId=" + collectionId + ", product=" + product + ", user=" + user
				+ ", createTime=" + createTime + ", lastEditTime=" + lastEditTime + "]";
	}
	private Long collectionId;
	private Product product;
	private User user;
	private Date createTime;
	private Date lastEditTime;
	public Long getCollectionId() {
		return collectionId;
	}
	public void setCollectionId(Long collectionId) {
		this.collectionId = collectionId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public ProductCollection(Long collectionId, Product product, User user, Date createTime, Date lastEditTime) {
		super();
		this.collectionId = collectionId;
		this.product = product;
		this.user = user;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	public ProductCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductCollection(Long collectionId, Date createTime, Date lastEditTime) {
		super();
		this.collectionId = collectionId;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}
	
	
	
}
