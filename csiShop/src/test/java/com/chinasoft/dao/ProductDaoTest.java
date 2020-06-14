package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.Product;

public class ProductDaoTest extends BaseTest{

	@Autowired
	private ProductDao productDao;
	
	@Test
	public void queryProductListByCategoryTest() {
		List<Product> productList = productDao.queryProductListByCategory(51L);
		assertEquals(2,productList.size());
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
		
	}
}
