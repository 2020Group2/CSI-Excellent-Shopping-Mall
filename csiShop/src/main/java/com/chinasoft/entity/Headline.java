package com.chinasoft.entity;

import java.util.Date;

public class Headline {

	private Long headlineId;
	private String headlineName;
	private String headlineImg;
	private Integer priority;
	//0:不可用  1：可用
	private Integer enableStatus;
	private Date createTime;
	private Date lastEditTime;
	
	public Long getHeadlineId() {
		return headlineId;
	}
	public void setHeadlineId(Long headlineId) {
		this.headlineId = headlineId;
	}
	public String getHeadlineName() {
		return headlineName;
	}
	public void setHeadlineName(String headlineName) {
		this.headlineName = headlineName;
	}
	public String getHeadlineImg() {
		return headlineImg;
	}
	public void setHeadlineImg(String headlineImg) {
		this.headlineImg = headlineImg;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
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
