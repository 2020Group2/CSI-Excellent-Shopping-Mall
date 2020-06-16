package com.chinasoft.dao;
import org.springframework.stereotype.Repository;

import com.chinasoft.entity.Product;

/**
 * 商品Dao层信息
 * @author THQ
 *
 */
@Repository
public interface ProductDao {
	/**
	 * 1添加商品
	 * @param productCategory
	 * @return
	 */
	public int addProductCategoryById(Product product);
	
	/**
	 * 2编辑商品
	 * @param productCategory
	 * @return
	 */
	public int editProductById(Product product);
	
	/**
	 * 3删除商品
	 * @param id
	 * @return
	 */
	public int deleteProductById(Long id);
	
	/**
	 * 4多条件搜索词查询商品
	 * @param queMap
	 * @return
	 */
	/* public List<Product> findList(Map<String, Object> queryMap); */
	
	/**
	 * 6根据id查询商品
	 * @param id
	 * @return
	 */
	public Product getProductById(Long id);
	
}