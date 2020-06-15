package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.Product;
import com.chinasoft.entity.ProductCategory;

public class ProductDaoTest extends BaseTest{

	@Autowired
	private ProductDao productDao;
	
	@Test
	public void queryProductListByCategoryTest() {
		Product productCondition = new Product();
		ProductCategory productCategory = new ProductCategory();
		productCategory.setProductCategoryId(51L);
		productCondition.setProductCategory(productCategory);
		List<Product> productList = productDao.queryProductList(productCondition);
		assertEquals(2,productList.size());
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test
	public void queryAllProductTest() {
		List<Product> productList = productDao.queryProductList(null);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test
	public void queryProductById() {
		Product productCondition = new Product();
		productCondition.setProductId(1L);
		List<Product> productList = productDao.queryProductList(productCondition);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
}
