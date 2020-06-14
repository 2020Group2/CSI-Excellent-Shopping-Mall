package com.chinasoft.controller.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.entity.ProductCollection;
import com.chinasoft.service.ProductCollectionService;

@Controller
@RequestMapping("/superadmin")
public class ProductCollectionController {
	@Autowired
	private ProductCollectionService productCollectionService;
	
	@RequestMapping(value = "/listProductCollection",method = RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> listProductCollection(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<ProductCollection> list = new ArrayList<ProductCollection>();
		list = productCollectionService.getProductCollectionList();
		modelMap.put("data", list);
		return modelMap;
	}
}	
	
	
