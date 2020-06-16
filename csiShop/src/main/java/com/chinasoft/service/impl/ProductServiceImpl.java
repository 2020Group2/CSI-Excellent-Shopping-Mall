package com.chinasoft.service.impl;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.entity.Product;
import com.chinasoft.service.ProductService;


/**
 * productservicelmpl
 * @author THQ
 *
 */
public class ProductServiceImpl implements ProductService{
	
	private ProductDao productDao;

	public int addProductCategoryById(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProductCategoryById(product);
	}

	public int editProductById(Product product) {
		// TODO Auto-generated method stub
		return productDao.editProductById(product);
	}

	public int deleteProductById(Long id) {
		// TODO Auto-generated method stub
		return productDao.deleteProductById(id);
	}

	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}
	


}
