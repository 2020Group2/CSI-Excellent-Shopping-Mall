package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.dao.ProductCategoryDao;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.service.ProductCategoryService;

public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	public int add(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.add(productCategory);
	}
	
	public int edit(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.edit(productCategory);
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return productCategoryDao.delete(id);
	}

	public List<ProductCategory> findList(Map<String, Object> queMap) {
		// TODO Auto-generated method stub
		return productCategoryDao.findList(queMap);
	}

	public Integer getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return productCategoryDao.getTotal(queryMap);
	}

	public ProductCategory findById(Long id) {
		// TODO Auto-generated method stub
		return productCategoryDao.findById(id);
	}

}
