package com.chinasoft.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 商品分类dao层测试
 * @author THQ
 *
 */
public class ProductCategoryDaoTest {
	@Autowired
<<<<<<< Updated upstream
	ProductCategoryDao productCategoryDao;
	@Test
	public void queryParentCategoryTest() {
		List<ProductCategory> list = productCategoryDao.queryProductCategory(null);
		assertEquals(1,list.size());
		for(ProductCategory p:list) {
			System.out.println(p.getProductCategoryName());
		}
=======
	private ProductCategoryDao productcategoryDao;
>>>>>>> Stashed changes
		
	@Test
	@Ignore
	public void addProductCategoryByIdTest(){
			
	}
	
	@Test
<<<<<<< Updated upstream
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
=======
	@Ignore
	public void editProductCategoryByIdTest(){
>>>>>>> Stashed changes
		
	}
	
	@Test
	@Ignore
	public void deleteProductCategoryByIdTest(){
		
	}
	
	@Test
	@Ignore
	public void getProductCategoryByIdTest(){
		
	}

}
