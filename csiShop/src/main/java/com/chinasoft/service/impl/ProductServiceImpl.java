package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.entity.Product;
import com.chinasoft.service.ProductService;


/**
 * productservicelmpl
 * @author THQ
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
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
	
	public List<Product> getProductList(Product productCondition) {
		return productDao.queryProductList(productCondition);
	}
	
	public List<Product> getHotProductList(int size) {
		return productDao.hotSaleProductList(size);
	}
	
	public List<Product> getNewestProductList(int size) {
		return productDao.newestProductList(size);
	}
	


}
