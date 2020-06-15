package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.entity.Product;
import com.chinasoft.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	@Override
	public List<Product> getProductList(Product productCondition) {
		return productDao.queryProductList(productCondition);
	}

}
