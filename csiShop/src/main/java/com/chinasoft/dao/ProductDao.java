package com.chinasoft.dao;
import org.springframework.stereotype.Repository;

import com.chinasoft.entity.Product;

/**
 * ��ƷDao����Ϣ
 * @author THQ
 *
 */
@Repository
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
	
}