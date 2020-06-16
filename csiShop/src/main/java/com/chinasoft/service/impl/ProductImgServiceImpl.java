package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductImgDao;
import com.chinasoft.entity.ProductImg;
import com.chinasoft.service.ProductImgService;

@Service
public class ProductImgServiceImpl implements ProductImgService{

	@Autowired
	private ProductImgDao productImgDao;
	
	public List<ProductImg> getProductImgById(long productId) {
		return productImgDao.getProductImgById(productId);
	}

}
