package com.chinasoft.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PathUtil {
	private static final Logger logger = LoggerFactory.getLogger(PathUtil.class);
	
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		logger.debug("os.name: {}", os);
		String basePath = "";
		if(os.toLowerCase().startsWith("win")) {
			basePath = "F:/csiShop/images/";
		}else {
			basePath = "/home/csiShop/images/";
		}
		logger.debug("basePath: {}", basePath);
		return basePath;
	}
	public static String getProductImagePath(){
		String productImgPath = "/upload/item/productImage/";
		logger.debug("productImgPath: {}", productImgPath);
		return productImgPath;
	}
	
}
