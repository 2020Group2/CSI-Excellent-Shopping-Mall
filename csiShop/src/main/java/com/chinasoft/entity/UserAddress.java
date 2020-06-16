package com.chinasoft.entity;

import java.util.Date;

public class UserAddress {

	private Long AddrId;
	private String content;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	private Long userId;
	public Long getAddrId() {
		return AddrId;
	}
	public void setAddrId(Long addrId) {
		AddrId = addrId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
}
