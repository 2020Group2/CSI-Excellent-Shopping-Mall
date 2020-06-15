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
	public List<Product> getProductList(Product productCondition);
	
	/**
	 * 获取热销榜前size的商品集合
	 * @param size
	 * @return
	 * Author：Zenghuqiang
	 */
	public List<Product> getHotProductList(int size);
	
	/**
	 * 获取最新商品中前size的商品集合
	 * @param size
	 * @return
	 * Author：Zenghuqiang
	 */
	public List<Product> getNewestProductList(int size);
}
