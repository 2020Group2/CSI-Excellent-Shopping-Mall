package com.chinasoft.service.impl;

<<<<<<< HEAD
import com.chinasoft.service.ProductCollectionService;

public class ProductCollectionServiceImpl implements ProductCollectionService{
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
>>>>>>> 4a6d0c718c9d0e745b1e4160408bc78247ccad38

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

