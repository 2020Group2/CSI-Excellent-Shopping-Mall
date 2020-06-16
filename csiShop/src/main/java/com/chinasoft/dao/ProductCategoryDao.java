package com.chinasoft.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.entity.ProductCategory;

/**
 * ��Ʒ����Dao��
 * @author THQ
 *
 */

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
	
	/**
	 * Author:Zenghuqiang
	 * 根据传入的productCategoryCondition进行商品类别的条件查询
	 * @return 商品类别的list
	 */
	List<ProductCategory> queryProductCategory(@Param("productCategoryCondition") ProductCategory productCategoryCondition);
	
	
}
