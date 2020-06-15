package com.chinasoft.controller.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="frontend",method= {RequestMethod.GET})
public class FrontendAdminController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "mobile/index";
	}
	
	@RequestMapping(value = "/location")
	public String location() {
		return "mobile/location";
	}
}
