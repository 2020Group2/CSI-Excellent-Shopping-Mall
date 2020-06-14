package com.chinasoft.controller.frontend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.entity.ProductCategory;
import com.chinasoft.service.ProductCategoryService;
import com.chinasoft.util.HttpServletRequestUtil;

@Controller
@RequestMapping(value = "/frontend")
public class IndexManagementController {
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * 首页中一级商品类别信息的获取
	 * @return 返回一级商品类别信息
	 * Author:ZengHuqiang
	 */
	@RequestMapping(value = "/getparentproductcategory", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getParentProductCategory(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//传入null，返回一级类别信息
		List<ProductCategory> productCategoryList = new ArrayList<ProductCategory>();
		try {
			productCategoryList = productCategoryService.getProductCategoryList(null);
			if(productCategoryList.size()>0) {
				modelMap.put("parentProductCategoryList", productCategoryList);
				modelMap.put("success", true);
			}
			//如果没有获取到一级类别信息
			else {
				modelMap.put("success", false);
				modelMap.put("errMsg", "error:don't exist parentProductCategoryList!");
			}
		}catch(Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		
		return modelMap;
	}
	
	/**
	 * 获取低级类别，如果无法获取更低级的类别时，isLowestLevel置为true
	 * @param request
	 * @return
	 * Author:zenghuqiang
	 */
	@RequestMapping(value = "/getproductcategorybyid", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getProductCategoryById(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		long parentId = HttpServletRequestUtil.getLong(request, "parentId");
		if(parentId>-1) {
			try {
				ProductCategory parentCategory = new ProductCategory();
				parentCategory.setProductCategoryId(parentId);
				ProductCategory productCategoryCondition = new ProductCategory();
				productCategoryCondition.setParent(parentCategory);
				List<ProductCategory> productCategoryList = productCategoryService.getProductCategoryList(productCategoryCondition);
				if(productCategoryList.size()>0) {
					modelMap.put("productCategoryList", productCategoryList);
					modelMap.put("isLowestLevel", false);
					modelMap.put("success", true);
				}else {
					modelMap.put("Msg", "获取的类别为最低类别，跳转到商品列表页面");
					modelMap.put("success", true);
					modelMap.put("isLowestLevel", true);
				}
			}catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.toString());
			}
		}
		return modelMap;
	}
	
	
	
	
}
