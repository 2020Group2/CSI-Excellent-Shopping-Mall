package com.chinasoft.service.impl;

import java.util.List;
import java.util.Map;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.entity.Product;
import com.chinasoft.service.ProductService;

public class ProductServiceImpl implements ProductService{
	
	private ProductDao productDao;
	
	public int add(Product product) {
		// TODO Auto-generated method stub
		return productDao.add(product);
	}

	public int edit(Product product) {
		// TODO Auto-generated method stub
		return productDao.edit(product);
	}

	public int delete(Long id) {
		// TODO Auto-generated method stub
		return productDao.delete(id);
	}

	public List<Product> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return productDao.findList(queryMap);
	}

	public Integer getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return productDao.getTotal(queryMap);
	}

	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

	public int updateNum(Product product) {
		// TODO Auto-generated method stub
		return productDao.updateNum(product);
	}

}
