package com.chinasoft.service;

import com.chinasoft.entity.Product;

public interface ProductService {
	public int addProductCategoryById(Product product);
	
	public int editProductById(Product product);
	
	public int deleteProductById(Long id);

	/* public List<Product> findList(Map<String, Object> queryMap); */
	
	public Product getProductById(Long id);
	
	/* public int updateNum(Product product); */
}
