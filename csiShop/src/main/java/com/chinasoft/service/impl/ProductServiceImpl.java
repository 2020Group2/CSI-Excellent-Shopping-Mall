package com.chinasoft.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.ProductDao;
import com.chinasoft.dao.ProductImgDao;
import com.chinasoft.dto.ImageHolder;
import com.chinasoft.dto.ProductExecution;
import com.chinasoft.entity.Product;
import com.chinasoft.entity.ProductImg;
import com.chinasoft.enums.ProductStateEnum;
import com.chinasoft.service.ProductService;
import com.chinasoft.util.ImageUtil;
import com.chinasoft.util.PathUtil;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductImgDao productImgDao;
	@Autowired
	private ProductDao productDao;

	public int addProductCategoryById(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProductCategoryById(product);
	}

	public int editProductById(Product product) {
		// TODO Auto-generated method stub
		return productDao.editProductById(product);
	}

	public int deleteProductById(Long id) {
		// TODO Auto-generated method stub
		return productDao.deleteProductById(id);
	}

	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

	public List<Product> getProductList(Product productCondition) {
		return productDao.queryProductList(productCondition);
	}

	public List<Product> getHotProductList(int size) {
		return productDao.hotSaleProductList(size);
	}

	public List<Product> getNewestProductList(int size) {
		return productDao.newestProductList(size);
	}

	@Override
	public ProductExecution addProduct(Product product, ImageHolder image, List<ImageHolder> imageList) {
		// 空值判断
		if (product != null) {
			// 给商品设置默认属性
			product.setCreateTime(new Date());
			product.setLastEditTime(new Date());
			// 默认为上架状态
			product.setEnableStatus(1);
			//销量默认为
			product.setSales(0);
			// 若商品缩略图不为空则添加
			if (image != null) {
				addImage(product, image);
			}
			try {
				// 创建商品信息
				int effectedNum = productDao.insertProduct(product);
				if (effectedNum <= 0) {
					throw new RuntimeException("创建商品失败");
				}
			} catch (Exception e) {
				throw new RuntimeException("创建商品失败：" + e.getMessage());
			}
			// 若商品详情图不为空则添加
			if (imageList != null && imageList.size() > 0) {
				addProductImgList(product, imageList);
			}
			return new ProductExecution(ProductStateEnum.SUCCESS, product);
		} else {
			return new ProductExecution(ProductStateEnum.EMPTY);
		}

	}
	
	/**
	 * 添加缩略图
	 * 
	 * @param product
	 * @param image
	 */
	private void addImage(Product product, ImageHolder image) {
		String dest = PathUtil.getProductImagePath();
		String thunmbnailAddr = ImageUtil.generateThumbnail(image, dest);
		product.setProductImg(thunmbnailAddr);
	}
	
	private void addProductImgList(Product product, List<ImageHolder> imageList) {
		// 获取图片存储路径，这里直接存放在相应店铺文件夹下
		String dest = PathUtil.getProductImagePath();
		List<ProductImg> productImgList = new ArrayList<ProductImg>();
		// 遍历图片一次去处理，并添加进productImg实体类
		for (ImageHolder image : imageList) {
			String imgAddr = ImageUtil.generateNormalImg(image, dest);
			ProductImg productImg = new ProductImg();
			productImg.setImgAddr(imgAddr);
			productImg.setProductId(product.getProductId());
			productImg.setCreateTime(new Date());
			productImgList.add(productImg);
		}
		// 如果确实时有图片需要添加，就执行批量添加操作
		if (productImgList.size() > 0) {
			try {
				int effectedNum = productImgDao.batchInsertProductImg(productImgList);
				if (effectedNum <= 0) {
					throw new RuntimeException("创建商品详情图片失败");
				}
			} catch (Exception e) {
				throw new RuntimeException("创建商品详情图片失败：" + e.getMessage());
			}
		}
	}

}
