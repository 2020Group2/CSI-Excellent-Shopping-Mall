package com.chinasoft.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.entity.Product;
public interface ProductDao {

	
	/**
	 * 根据传入productCondition条件来筛选商品
	 * @param productCategoryId
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> queryProductList(@Param("productCondition")Product productCondition);
	
	/**
	 * 获取热销商品
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> hotSaleProductList(int size);
	
	/**
	 * 获取最新商品
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> newestProductList(int size);
	

}
