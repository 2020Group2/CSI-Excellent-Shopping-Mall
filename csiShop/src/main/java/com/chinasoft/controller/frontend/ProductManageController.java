package com.chinasoft.controller.frontend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.entity.Product;
import com.chinasoft.entity.ProductCategory;
import com.chinasoft.entity.ProductImg;
import com.chinasoft.service.ProductImgService;
import com.chinasoft.service.ProductService;
import com.chinasoft.util.HttpServletRequestUtil;
@Controller
@RequestMapping(value="/productmanagement")
public class ProductManageController {

	@Autowired
	private ProductService productService;
	@Autowired
	private ProductImgService productImgService;
	/**
	 * 通过前端传入的productCategoryId返回与之相关的productList
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/productListByCategory", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> productListByCategory(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<>();
		long productCategoryId = HttpServletRequestUtil.getLong(request, "productCategoryId");
		try {
			ProductCategory productCategory = new ProductCategory();
			productCategory.setProductCategoryId(productCategoryId);
			Product productCondition = new Product();
			productCondition.setProductCategory(productCategory);
			List<Product> productList = productService.getProductList(productCondition);
			if (productList.size() > 0) {
				modelMap.put("productList", productList);
				modelMap.put("success", true);
			} else {
				modelMap.put("success", false);
				modelMap.put("errMsg", "没有找到相关的商品！");
			}

		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.toString());
		}
		return modelMap;
	}
	
	/**
	 * 根据前端传入的productId获取商品相关的详细信息
	 * @param request
	 * @return
	 * Author:Zenghuqiang
	 */
	@RequestMapping(value = "/getproductById", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getproductById(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<>();
		long productId = HttpServletRequestUtil.getLong(request, "productId");
		try {
			Product productCondition = new Product();
			productCondition.setProductId(productId);
			List<ProductImg> productImgList = productImgService.getProductImgById(productId);
			List<Product> productList = productService.getProductList(productCondition);
			if (productList.size() > 0) {
				modelMap.put("product", productList.get(0));
				modelMap.put("productImgList", productImgList);
				modelMap.put("success", true);
			} else {
				modelMap.put("success", false);
				modelMap.put("errMsg", "没有找到相关的商品！");
			}

		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.toString());
		}
		return modelMap;
	}

	
}
