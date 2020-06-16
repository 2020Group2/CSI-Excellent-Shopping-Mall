package com.chinasoft.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.dto.ImageHolder;
import com.chinasoft.dto.ProductExecution;
import com.chinasoft.entity.Product;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.enums.ProductStateEnum;


public class ProductServiceTest extends BaseTest{

	@Autowired
	private ProductService productService;
	
	@Test
	public void testAAddProduct() throws RuntimeException,FileNotFoundException{
		ProductCategory pc1 = new ProductCategory();
		pc1.setProductCategoryId(51L);
		Product product1 = new Product();
		product1.setProductName("Service测试商品01");
		product1.setProductDesc("Service测试商品01");
		product1.setPriority(20);
		product1.setCreateTime(new Date());
		product1.setLastEditTime(new Date());
		product1.setStock(100);
		product1.setProductCategory(pc1);
		product1.setEnableStatus(ProductStateEnum.SUCCESS.getState());
		//创建缩略图文件流
		File thumbnailFile = new File("F:/csiShop/images/test01.jpg");
		
		InputStream is = new FileInputStream(thumbnailFile);
		ImageHolder thumbnail = new ImageHolder(is,thumbnailFile.getName());
		//创建两个商品详情图文件流将他们添加到详情图列表中
		File productImg1 = new File("F:/csiShop/images/test02.jpg");
		InputStream is1 = new FileInputStream(productImg1);
		File productImg2 = new File("F:/csiShop/images/test03.jpg");
		InputStream is2 = new FileInputStream(productImg2);
		List<ImageHolder> productImgList = new ArrayList<ImageHolder>();
		productImgList.add(new ImageHolder(is1,productImg1.getName()));
		productImgList.add(new ImageHolder(is2,productImg2.getName()));
		//添加商品并验证
		ProductExecution pe = productService.addProduct(product1, thumbnail, productImgList);
		assertEquals(ProductStateEnum.SUCCESS.getState(),pe.getState());
		
	}
}
