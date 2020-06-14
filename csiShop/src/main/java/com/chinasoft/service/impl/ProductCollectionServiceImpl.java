package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductCollectionDao;
import com.chinasoft.entity.ProductCollection;
import com.chinasoft.service.ProductCollectionService;

@Service
public class ProductCollectionServiceImpl implements ProductCollectionService{
	@Autowired
	private ProductCollectionDao productCollectionDao ;
	
	public List<ProductCollection> getProductCollectionList() {	
		return productCollectionDao.queryProductCollection();
	}
}

