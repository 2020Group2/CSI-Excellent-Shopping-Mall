package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.ProductCategory;

public class ProductCategoryDaoTest extends BaseTest{

	@Autowired
	ProductCategoryDao productCategoryDao;
	@Test
	public void queryParentCategoryTest() {
		List<ProductCategory> list = productCategoryDao.queryProductCategory(null);
		assertEquals(1,list.size());
		for(ProductCategory p:list) {
			System.out.println(p.getProductCategoryName());
		}
		
	}
	@Test
	public void queryChildCategoryTest() {
		ProductCategory parentCategoryCondition = new ProductCategory();
		parentCategoryCondition.setProductCategoryId(1L);
		ProductCategory childCategoryCondition = new ProductCategory();
		childCategoryCondition.setParent(parentCategoryCondition);
		List<ProductCategory> list = productCategoryDao.queryProductCategory(childCategoryCondition);
		assertEquals(1, list.size());
		for(ProductCategory p:list) {
			System.out.println(p.getProductCategoryName());
		}
		
	}
	
	
}
