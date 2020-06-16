package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.ProductImg;

public interface ProductImgService {

	public List<ProductImg> getProductImgById(long productId);
}
