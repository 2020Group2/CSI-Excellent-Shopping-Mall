package com.chinasoft.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.chinasoft.entity.Product;

/**
 * ��ƷDao����Ϣ
 * @author THQ
 *
 */

public interface ProductDao {
	/**
	 * 1�����Ʒ
	 * @param productCategory
	 * @return
	 */
	public int addProductCategoryById(Product product);
	
	/**
	 * 2�༭��Ʒ
	 * @param productCategory
	 * @return
	 */
	public int editProductById(Product product);
	
	/**
	 * 3ɾ����Ʒ
	 * @param id
	 * @return
	 */
	public int deleteProductById(Long id);
	
	/**
	 * 4�����������ʲ�ѯ��Ʒ
	 * @param queMap
	 * @return
	 */
	/* public List<Product> findList(Map<String, Object> queryMap); */
	
	/**
	 * 6����id��ѯ��Ʒ
	 * @param id
	 * @return
	 */
	public Product getProductById(Long id);
	
	/**
	 * 根据传入productCondition条件来筛选商品
	 * @param productCategoryId
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> queryProductList(@Param("productCondition")Product productCondition);
	
	/**
	 * 获取热销商品
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> hotSaleProductList(int size);
	
	/**
	 * 获取最新商品
	 * @return
	 * Author：Zenghuqiang
	 */
	List<Product> newestProductList(int size);
	
	//插入商品
	int insertProduct(Product product);
	
}