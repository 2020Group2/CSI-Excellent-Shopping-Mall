package com.chinasoft.controller.useradmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.service.ProductCategoryService;
import com.chinasoft.service.ProductService;

/**
 * 商品管理控制器
 * @author THQ
 *
 */
@RequestMapping("/admin/product")
@Controller
public class ProductController {
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	@Autowired
	private ProductService productService;
	
	
	/**
	 * 商品列表页
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView model){
		model.setViewName("product/list");
		//model.addObject("productCategoryList", JSONArray.fromObject(productCategoryService.findList(new HashMap<String, Object>())));
		return model;
	}
}