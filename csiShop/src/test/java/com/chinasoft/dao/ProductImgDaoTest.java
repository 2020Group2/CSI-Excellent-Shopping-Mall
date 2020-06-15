package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.ProductImg;

public class ProductImgDaoTest extends BaseTest{
	@Autowired
	ProductImgDao productImgDao;
	
	@Test
	public void getProductImgTest() {
		List<ProductImg> list = productImgDao.getProductImgById(1);
		assertEquals(true,list.size()>0);
		for(ProductImg productImg:list) {
			System.out.println(productImg.getProductId()+":"+productImg.getImgAddr());
		}
	}
}
