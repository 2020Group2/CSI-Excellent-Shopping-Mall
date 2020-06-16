package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.ProductImg;

public interface ProductImgDao {

	/**
	 * 根据商品Id获取所有的商品详情图
	 * @param productId
	 * @return
	 */
	List<ProductImg> getProductImgById(long productId);
	
	//批量添加图片
	int batchInsertProductImg(List<ProductImg> productImgList );
}
