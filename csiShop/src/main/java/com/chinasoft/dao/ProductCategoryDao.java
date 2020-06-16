package com.chinasoft.dao;
import org.springframework.stereotype.Repository;

import com.chinasoft.entity.ProductCategory;

/**
 * 商品分类Dao层
 * @author THQ
 *
 */
@Repository
public interface ProductCategoryDao {
	/**
	 * 1添加商品分类
	 * @param productCategory
	 * @return
	 */
	public int addProductCategoryById(ProductCategory productCategory);
	
	/**
	 * 2编辑商品分类
	 * @param productCategory
	 * @return
	 */
	public int editProductCategoryById(ProductCategory productCategory);
	
	/**
	 * 3删除商品分类
	 * @param id
	 * @return
	 */
	public int deleteProductCategoryById(Long id);
	
	/**
	 * 4多条件搜索词查询商品分类
	 * @param queMap
	 * @return
	 */
	/* public List<ProductCategory> findList(Map<String, Object> queMap); */
	
	/**
	 * 5获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	/* public Integer getTotal(Map<String, Object> queryMap); */
	
	/**
	 * 6根据id查询商品分类
	 * @param id
	 * @return
	 */
	public ProductCategory getProductCategoryById(Long id);
}
