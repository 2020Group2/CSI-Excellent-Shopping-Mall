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
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.chinasoft.dto.ImageHolder;
import com.chinasoft.dto.ProductExecution;
import com.chinasoft.entity.Product;
import com.chinasoft.enums.ProductStateEnum;
import com.chinasoft.service.ProductService;
import com.chinasoft.util.HttpServletRequestUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/shopadmin")
public class ProductManagementController {
	@Autowired
	private ProductService productService;
	
	//支持上传商品详情图的最大数量
	private static final int IMAGEMAXCOUNT = 6;
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	@ResponseBody
	private Map<String,Object> addProduct(HttpServletRequest request){
		Map<String,Object> modelMap = new HashMap<String,Object>();
		//接受前端参数的变量初始化，包括商品，缩略图，详情图列表实体类
		ObjectMapper mapper = new ObjectMapper();
		Product product = null;
		String productStr = HttpServletRequestUtil.getString(request, "productStr");
		MultipartHttpServletRequest multipartRequest = null;
		ImageHolder thumbnail = null;
		List<ImageHolder> productImgList = new ArrayList<ImageHolder>();
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		try {
			//若请求中存在文件流，则取出相关文件
			if(multipartResolver.isMultipart(request)) {
				multipartRequest = (MultipartHttpServletRequest) request;
				//取出缩略图并构建ImageHolder对象
				CommonsMultipartFile thumbnailFile = (CommonsMultipartFile)multipartRequest.getFile("thumbnail");
				thumbnail = new ImageHolder(thumbnailFile.getInputStream(),thumbnailFile.getOriginalFilename());
				//取出详情图列表并构建List<ImageHolder>列表对象，最多支持6张图片上传
				for(int i = 0;i<IMAGEMAXCOUNT;i++) {
					CommonsMultipartFile productImgFile = (CommonsMultipartFile)multipartRequest.getFile("productImg"+i);
					if(productImgFile!=null) {
						//若取出的第i个详情图片文件流不为空，则将其加入详情图列表
						ImageHolder productImg = new ImageHolder(productImgFile.getInputStream(),productImgFile.getOriginalFilename());
						productImgList.add(productImg);
					}else {
						break;
					}
				}
			}else {
				modelMap.put("success", false);
				modelMap.put("errMsg","上传图片不能为空！");
				return modelMap;
			}
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg",e.toString());
			return modelMap;
		}
		try {
			//尝试获取前端传过来的表单string流并将其转换为Product实体类
			product = mapper.readValue(productStr, Product.class);
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg",e.toString());
			return modelMap;
		}
		//若Product信息，缩略图以及详情图列表为非空，则开始进行商品添加操作
		if(product!=null&&thumbnail!=null&&productImgList.size()>0) {
			try {
				//执行添加操作
				ProductExecution pe = productService.addProduct(product, thumbnail, productImgList);
				if(pe.getState()==ProductStateEnum.SUCCESS.getState()) {
					modelMap.put("success",true);
				}else {
					modelMap.put("success", false);
					modelMap.put("errMsg",pe.getStateInfo());
				}
			} catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg",e.toString());
				return modelMap;
			}
		}else {
			modelMap.put("success", false);
			modelMap.put("errMsg","请输入商品信息");
		}
		return modelMap;
	}
}
