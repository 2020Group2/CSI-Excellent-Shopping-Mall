package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Product;

public interface ProductService {
	public int addProductCategoryById(Product product);
	
	public int editProductById(Product product);
	
	public int deleteProductById(Long id);

	/* public List<Product> findList(Map<String, Object> queryMap); */
	
	public Product getProductById(Long id);
	
	/* public int updateNum(Product product); */
	
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
