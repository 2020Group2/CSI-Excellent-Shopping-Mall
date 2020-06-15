package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Product;

public interface ProductService {

	/**
	 * 根据productCategoryId获取商品集合
	 * @param productCategoryId
	 * @return
	 * Author：Zenghuqiang
	 */
	public List<Product> getProductByCategory(Product productCondition);
}
