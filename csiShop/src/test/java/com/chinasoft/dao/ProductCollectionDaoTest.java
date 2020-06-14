package com.chinasoft.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.ProductCollection;

public class ProductCollectionDaoTest extends BaseTest{

	@Autowired
	ProductCollectionDao productCollectionDao;
	
	@Test
	public void queryUserAddressTest() {
		List<ProductCollection> list = productCollectionDao.queryProductCollection();
		for(ProductCollection productCollection:list) {
			System.out.println(productCollection);
		}
		assertEquals(2,list.size());
	}
	

	
}
