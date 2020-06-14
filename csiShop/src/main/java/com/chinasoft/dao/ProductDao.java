package com.chinasoft.dao;
import java.util.List;

import com.chinasoft.entity.Product;
public interface ProductDao {

	
	/**
	 * 根据传入productCategoryId来筛选商品
	 * @param productCategoryId
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> queryProductListByCategory(Long productCategoryId);
}
