package com.chinasoft.dao;
import java.util.List;
import java.util.Map;

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
	public int add(Product product);
	
	/**
	 * 2�༭��Ʒ
	 * @param productCategory
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * 3ɾ����Ʒ
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 4�����������ʲ�ѯ��Ʒ
	 * @param queMap
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/**
	 * 5��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 6����id��ѯ��Ʒ
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * 7����ͳ����Ϣ
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
}