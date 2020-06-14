package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductCategoryDao;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Override
	public List<ProductCategory> getProductCategoryList(ProductCategory productaCategoryCondition) {
		return productCategoryDao.queryProductCategory(productaCategoryCondition);
	}

}
