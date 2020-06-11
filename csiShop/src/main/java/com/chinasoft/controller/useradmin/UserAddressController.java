package com.chinasoft.controller.useradmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.entity.UserAddress;
import com.chinasoft.service.UserAddressService;


//此方法和类只用于框架测试，测试通过后可以删除
@Controller
@RequestMapping("/superadmin")
public class UserAddressController {
	
	@Autowired
	private UserAddressService userAddressService;
	
	@RequestMapping(value="/listuserAddress",method=RequestMethod.GET)
	@ResponseBody
	private Map<String,Object> listUserAddress(){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		List<UserAddress> list = new ArrayList<UserAddress>();
		try {
			list = userAddressService.getUserAddressList();
			modelMap.put("data", list);
			modelMap.put("total",list.size());
			modelMap.put("success", true);
		}catch(Exception e) {
			e.printStackTrace();
			modelMap.put("success", false);
			modelMap.put("errMsg", e.toString());
		}
		return modelMap;
	}
}
