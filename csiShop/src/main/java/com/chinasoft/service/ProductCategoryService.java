package com.chinasoft.service;

import java.util.List;
import java.util.Map;

import com.chinasoft.entity.ProductCategory;

public interface ProductCategoryService {
	public int add(ProductCategory productCategory);
	
	public int edit(ProductCategory productCategory);
	
	public int delete(Long id);
	
	public List<ProductCategory> findList(Map<String, Object> queMap);
	
	public Integer getTotal(Map<String, Object> queryMap);
	
	public ProductCategory findById(Long id);
}
