package com.chinasoft.dao;
import org.springframework.stereotype.Repository;

import com.chinasoft.entity.ProductCategory;

/**
 * ��Ʒ����Dao��
 * @author THQ
 *
 */
@Repository
public interface ProductCategoryDao {
	/**
	 * 1�����Ʒ����
	 * @param productCategory
	 * @return
	 */
	public int addProductCategoryById(ProductCategory productCategory);
	
	/**
	 * 2�༭��Ʒ����
	 * @param productCategory
	 * @return
	 */
	public int editProductCategoryById(ProductCategory productCategory);
	
	/**
	 * 3ɾ����Ʒ����
	 * @param id
	 * @return
	 */
	public int deleteProductCategoryById(Long id);
	
	/**
	 * 4�����������ʲ�ѯ��Ʒ����
	 * @param queMap
	 * @return
	 */
	/* public List<ProductCategory> findList(Map<String, Object> queMap); */
	
	/**
	 * 5��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	/* public Integer getTotal(Map<String, Object> queryMap); */
	
	/**
	 * 6����id��ѯ��Ʒ����
	 * @param id
	 * @return
	 */
	public ProductCategory getProductCategoryById(Long id);
}
