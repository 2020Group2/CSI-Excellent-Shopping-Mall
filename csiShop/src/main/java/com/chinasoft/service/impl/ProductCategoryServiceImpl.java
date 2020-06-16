package com.chinasoft.service.impl;

import com.chinasoft.dao.ProductCategoryDao;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.service.ProductCategoryService;


/**
 * productCategoryservicelmpl
 * @author THQ
 *
 */
public class ProductCategoryServiceImpl implements ProductCategoryService{

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
	
	

}
