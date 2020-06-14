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

import com.chinasoft.entity.Order;
import com.chinasoft.service.OrderService;

@Controller
@RequestMapping("/saorder")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/listOrder",method = RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> listOrder(){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Order> list = new ArrayList<Order>();
		list = orderService.getOrderList();
		modelMap.put("data", list);
		return modelMap;
	}
}	
	
	
