package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductCategoryDao;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.service.ProductCategoryService;


/**
 * productCategoryservicelmpl
 * @author THQ
 *
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	public int addProductCategoryById(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.addProductCategoryById(productCategory);
	}

	public int editProductCategoryById(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.editProductCategoryById(productCategory)
				;
	}

	public int deleteProductCategoryById(Long id) {
		// TODO Auto-generated method stub
		return productCategoryDao.deleteProductCategoryById(id);
	}

	public ProductCategory getProductCategoryById(Long id) {
		// TODO Auto-generated method stub
		return productCategoryDao.getProductCategoryById(id);
	}

	public List<ProductCategory> getProductCategoryList(ProductCategory productaCategoryCondition) {
		return productCategoryDao.queryProductCategory(productaCategoryCondition);
	}
	
	

}
