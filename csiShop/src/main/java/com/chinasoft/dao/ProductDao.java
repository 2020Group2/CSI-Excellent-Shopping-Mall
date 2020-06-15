package com.chinasoft.dao;
import java.util.List;
import java.util.Map;

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
	public int add(Product product);
	
	/**
	 * 2编辑商品
	 * @param productCategory
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * 3删除商品
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 4多条件搜索词查询商品
	 * @param queMap
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/**
	 * 5获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 6根据id查询商品
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * 7更新统计信息
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
}