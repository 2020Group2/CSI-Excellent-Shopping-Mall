package com.chinasoft.controller.superadmin;

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

import com.chinasoft.entity.UserOrder;
import com.chinasoft.service.UserOrderService;
import com.chinasoft.util.HttpServletRequestUtil;

@Controller
@RequestMapping("/superuserorder")
public class UserOrderController {
	@Autowired
	private UserOrderService userOrderService;
	
	@RequestMapping(value = "/listUserOrder",method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> listUserOrder(){
		Map<String, Object> modelMap = new HashMap<>();
		List<UserOrder> list = new ArrayList<>();
		try {			
			list = userOrderService.getUserOrderList();
			modelMap.put("data", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelMap;
	}
	
	@RequestMapping(value = "/updateUserOrderStatus",method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> updateUserOrderStatus(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		int productSt = HttpServletRequestUtil.getInt(request, "productSt");
		return modelMap;		
		
	}
	
}
