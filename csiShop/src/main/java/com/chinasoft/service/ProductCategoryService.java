package com.chinasoft.service;

import com.chinasoft.entity.ProductCategory;

public interface ProductCategoryService {
	public int addProductCategoryById(ProductCategory productCategory);
	
	public int editProductCategoryById(ProductCategory productCategory);
	
	public int deleteProductCategoryById(Long id);
	
	/*
	 * public List<ProductCategory> findList(Map<String, Object> queMap);
	 * 
	 * public Integer getTotal(Map<String, Object> queryMap);
	 */
	
	public ProductCategory getProductCategoryById(Long id);
}
