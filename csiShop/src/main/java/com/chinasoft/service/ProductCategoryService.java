package com.chinasoft.service;


import java.util.List;

import com.chinasoft.dao.ProductCategoryDao;
import com.chinasoft.entity.ProductCategory;

public interface ProductCategoryService {

	public List<ProductCategory> getProductCategoryList(ProductCategory productaCategoryCondition);
	
}
