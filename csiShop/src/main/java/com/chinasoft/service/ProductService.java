package com.chinasoft.service;

import java.util.List;
import java.util.Map;

import com.chinasoft.entity.Product;

public interface ProductService {
	public int add(Product product);
	
	public int edit(Product product);
	
	public int delete(Long id);

	public List<Product> findList(Map<String, Object> queryMap);
	
	public Integer getTotal(Map<String, Object> queryMap);
	
	public Product findById(Long id);
	
	public int updateNum(Product product);
}
