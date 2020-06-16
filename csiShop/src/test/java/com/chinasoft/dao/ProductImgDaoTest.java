package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
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
	
	@Test
	public void testABatchInsertProductImg() throws Exception{
		ProductImg img01 = new ProductImg();
		img01.setImgAddr("图片01");
		img01.setDescription("测试图片01");
		img01.setPriority(1);
		img01.setCreateTime(new Date());
		img01.setLastEditTime(new Date());
		img01.setProductId(1L);
		ProductImg img02 = new ProductImg();
		img02.setImgAddr("图片02");
		img02.setDescription("测试图片02");
		img02.setPriority(1);
		img02.setCreateTime(new Date());
		img02.setProductId(1L);
		List<ProductImg> productImgList = new ArrayList<ProductImg>();
		productImgList.add(img01);
		productImgList.add(img02);
		int effectedNum = productImgDao.batchInsertProductImg(productImgList);
		assertEquals(2,effectedNum);
		
	}
}
