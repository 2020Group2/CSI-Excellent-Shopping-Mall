package com.chinasoft.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.chinasoft.dto.ImageHolder;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	//获取文件基地址的成员变量
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	//设置时间字符串格式
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	//获取随机数的成员变量
	private static final Random r = new Random();
	private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
	public static File transferCommonsMultipartFiletoFile(CommonsMultipartFile cFile) {
		File file = null;
		try {
			// 获取前端传递过来的文件名
			file = new File(cFile.getOriginalFilename());
			// 将cFile转换为file
			cFile.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("commonsMultipartFileToFile failed:{}", e.getMessage());
		}
		return file;
	}
	/**
	 * 处理缩略图，并返回新生成图片的相对值路径
	 * @param thumbnail
	 * @param targetAddr
	 * @return
	 */
	public static String generateThumbnail(ImageHolder image,String targetAddr) {
		String realFileName = getRandomFileName();
		String extension = getFileExtension(image.getImageName());
		makeDirPath(targetAddr);
		String relativeAddr = targetAddr + realFileName +extension;
		logger.debug("current complete addr is:"+PathUtil.getImgBasePath()+relativeAddr);
		String destAddr = PathUtil.getImgBasePath() + relativeAddr;
		File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
		try {
			logger.debug("watermarkFile:{}",PathUtil.getImgBasePath() + "watermark/watermark.jpg");
			logger.debug("destFile:{}",destAddr);
			Thumbnails.of(image.getImage()).size(200, 200)
			.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("F:/csiShop/images/watermark.jpg")), 0.25f)
			.outputQuality(0.8f).toFile(dest);
		}catch(IOException e) {
			logger.error("图片处理失败："+e.toString());
			e.printStackTrace();
		}
		return relativeAddr;
	}
	public static String generateNormalImg(ImageHolder thumbnail,String targetAddr) {
		//获取不重复随机名
		String realFileName= getRandomFileName();
		//获取文件的拓展名
		String extension = getFileExtension(thumbnail.getImageName());
		//如果文件路径不存在，则自动创建
		makeDirPath(targetAddr);
		//获取文件存储的相对路径（带文件名）
		String relativeAddr = targetAddr + realFileName +extension;
		logger.debug("current complete addr is:"+PathUtil.getImgBasePath()+relativeAddr);
		String destAddr = PathUtil.getImgBasePath() + relativeAddr;
		File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
		try {
			//logger.debug("watermarkFile:{}",PathUtil.getImgBasePath() + "watermark/watermark.jpg");
			logger.debug("destFile:{}",destAddr);
			Thumbnails.of(thumbnail.getImage()).size(337, 640)
			.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("F:/csiShop/images/watermark/watermark.jpg")), 0.25f)
			.outputQuality(0.9f).toFile(dest);
		}catch(IOException e) {
			logger.error("图片处理失败："+e.toString());
			e.printStackTrace();
		}
		return relativeAddr;
	}
	/**
	 * 创建目标路径所涉及到的目录
	 * @param targetAddr
	 */
	private static void makeDirPath(String targetAddr) {
		String realFileParentPath = PathUtil.getImgBasePath()+targetAddr;
		logger.debug("mkdir:{}",realFileParentPath);
		File dirPath = new File(realFileParentPath);
		if(!dirPath.exists()) {
			dirPath.mkdirs();
		}
		
	}
	/**
	 * 获取输入文件流的拓展名
	 * @param thumbnail
	 * @return
	 */
	private static String getFileExtension(String fileName) {
		String extension = fileName.substring(fileName.lastIndexOf("."));
		logger.debug("extension: {}", extension);
		return extension;

	}
	
	/**
	 * 生成随机文件名：当前时间年月日小时分钟秒+5位随机数
	 * @return
	 */
	public static String getRandomFileName() {
		//获取随机的五位数 newInt(xx) :随机数在0-xx之间取值
		int randomNum = r.nextInt(89999)+10000;
		String nowTimeStr = sDateFormat.format(new Date());
		logger.debug("fileName: {}", nowTimeStr +randomNum);
		return nowTimeStr +randomNum;
	}
	
	/**
	 * storePath是文件路径还是目录路径
	 * 如果storePath是文件路径则删除该文件
	 * 如果storePath是目录路径则删除该目录下的所有文件
	 * @param storePath
	 */
	public static void deleteFileOrPath(String storePath) {
		File fileOrPath = new File(PathUtil.getImgBasePath()+storePath);
		if(fileOrPath.exists()) {
			if(fileOrPath.isDirectory()) {
				File files[] = fileOrPath.listFiles();
				for(int i=0;i<files.length;i++) {
					files[i].delete();
				}
			}
			fileOrPath.delete();
		}
	}
//test
	/*
	public static void main(String[] args) {
		try {
			// 需要加水印的图片
			File souceFile = new File("F:/csiShop/images/test01.jpg");
			// 加完水印后输出的目标图片
			File destFile = new File("F:/csiShop/test/newtest01.jpg");
			// 水印图片
			String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
			logger.info("warterMarkFileName");
			// 加水印
			Thumbnails.of(souceFile).size(200, 200).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(/watermark.jpg")), 0.25f).outputQuality(0.8).toFile(destFile);
			logger.info("水印添加成功,带有水印的图片{}", destFile.getAbsolutePath());

			getRandomFileName();
			getFileExtension(souceFile);

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("创建缩略图失败：" + e.toString());
		}

	}
}


	
	/*
	public static void main(String[] args) throws IOException {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		Thumbnails.of(new File("C:/Users/ZengHuqiang/Desktop/Test/xiaohuangren.jpg")).size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
				.outputQuality(0.8f).toFile("C:/Users/ZengHuqiang/Desktop/result/newxiaohuangren.jpg");

	}*/
}

