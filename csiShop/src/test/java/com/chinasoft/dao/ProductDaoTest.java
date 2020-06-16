package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.Product;
import com.chinasoft.entity.ProductCategory;

public class ProductDaoTest extends BaseTest{

	@Autowired
	private ProductDao productDao;
	
	@Test
	@Ignore
	public void queryProductListByCategoryTest() {
		System.out.println("queryProductListByCategoryTest");
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
	@Ignore
	public void queryAllProductTest() {
		System.out.println("queryAllProductTest");
		List<Product> productList = productDao.queryProductList(null);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test
	@Ignore
	public void queryProductByIdTest() {
		System.out.println("queryProductByIdTest");
		Product productCondition = new Product();
		productCondition.setProductId(1L);
		List<Product> productList = productDao.queryProductList(productCondition);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test 
	@Ignore
	public void queryProductBySearchTest() {
		System.out.println("queryProductBySearchTest");
		Product productCondition = new Product();
		productCondition.setProductName("哇");
		List<Product> productList = productDao.queryProductList(productCondition);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test
	public void hotProductTest() {
		System.out.println("hotProductTest");
		List<Product> productList = productDao.hotSaleProductList(3);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	@Test
	public void newestProductTest() {
		System.out.println("newestProductTest");
		List<Product> productList = productDao.newestProductList(3);
		assertEquals(true,productList.size()>0);
		for(Product product:productList) {
			System.out.println(product.getProductName());
		}
	}
	
	
}
