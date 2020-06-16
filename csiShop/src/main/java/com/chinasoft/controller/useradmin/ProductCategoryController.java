package com.chinasoft.controller.useradmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.service.ProductCategoryService;

/**
 * ��Ʒ������������
 * @author THQ
 *
 */
@RequestMapping("/admin/product_category")
@Controller
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService productCategoryService;
	
	/**
	 * ��Ʒ�����б�ҳ
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model) {
		model.setViewName("product_category/list");
		return model;
	}
}