package com.chinasoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.entity.ProductCategory;

public interface ProductCategoryDao {

	/**
	 * Author:Zenghuqiang
	 * 根据传入的productCategoryCondition进行商品类别的条件查询
	 * @return 商品类别的list
	 */
	List<ProductCategory> queryProductCategory(@Param("productCategoryCondition") ProductCategory productCategoryCondition);
	
}
