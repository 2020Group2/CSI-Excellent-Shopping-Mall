/*
Navicat MySQL Data Transfer

Source Server         : shixun
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : csishop

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-06-10 20:20:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for headline
-- ----------------------------
DROP TABLE IF EXISTS `headline`;
CREATE TABLE `headline` (
  `headline_id` int NOT NULL AUTO_INCREMENT,
  `headline_name` varchar(100) DEFAULT NULL,
  `headline_img` varchar(1024) DEFAULT NULL,
  `priority` int DEFAULT '0',
  `enable_status` int DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`headline_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of headline
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `user_id` int NOT NULL,
  `product_number` int DEFAULT '1',
  `order_price` varchar(1000) DEFAULT NULL,
  `order_desc` varchar(1000) DEFAULT NULL,
  `comments` varchar(1000) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `enable_status` int DEFAULT '0',
  PRIMARY KEY (`order_id`),
  KEY `fk_order_product` (`product_id`),
  KEY `fk_order_user` (`user_id`),
  CONSTRAINT `fk_order_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fk_order_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(128) NOT NULL,
  `product_desc` varchar(1024) DEFAULT NULL,
  `product_img` varchar(1024) DEFAULT NULL,
  `normal_price` varchar(100) DEFAULT NULL,
  `promotion_price` varchar(100) DEFAULT NULL,
  `priority` int DEFAULT '0',
  `enable_status` int NOT NULL DEFAULT '0',
  `product_category_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `fk_product_productcategory` (`product_category_id`),
  CONSTRAINT `fk_product_productcategory` FOREIGN KEY (`product_category_id`) REFERENCES `product_category` (`product_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for product_category
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `product_category_id` int NOT NULL AUTO_INCREMENT,
  `product_category_name` varchar(128) NOT NULL,
  `priority` int DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `parent_id` int DEFAULT NULL,
  PRIMARY KEY (`product_category_id`),
  KEY `fk_product_category` (`parent_id`),
  CONSTRAINT `fk_product_category` FOREIGN KEY (`parent_id`) REFERENCES `product_category` (`product_category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_category
-- ----------------------------

-- ----------------------------
-- Table structure for product_collection
-- ----------------------------
DROP TABLE IF EXISTS `product_collection`;
CREATE TABLE `product_collection` (
  `collection_id` int NOT NULL AUTO_INCREMENT,
  `product_id` int NOT NULL,
  `user_id` int NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`collection_id`),
  KEY `fk_colletion_user` (`user_id`),
  CONSTRAINT `fk_collection_product` FOREIGN KEY (`collection_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fk_colletion_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_collection
-- ----------------------------

-- ----------------------------
-- Table structure for product_img
-- ----------------------------
DROP TABLE IF EXISTS `product_img`;
CREATE TABLE `product_img` (
  `product_img_id` int NOT NULL AUTO_INCREMENT,
  `img_addr` varchar(1024) NOT NULL,
  `priority` int DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`product_img_id`),
  KEY `fk_product_productImg` (`product_id`),
  CONSTRAINT `fk_product_productImg` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_img
-- ----------------------------

-- ----------------------------
-- Table structure for shop_car
-- ----------------------------
DROP TABLE IF EXISTS `shop_car`;
CREATE TABLE `shop_car` (
  `shop_car_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `product_id` int NOT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `number` int DEFAULT NULL,
  `shop_car_price` varchar(100) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`shop_car_id`),
  KEY `fk_shopcar_user` (`user_id`),
  KEY `fk_shopcar_product` (`product_id`),
  CONSTRAINT `fk_shopcar_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fk_shopcar_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_car
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `profile_img` varchar(1024) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `email` varchar(1024) DEFAULT NULL,
  `gender` varchar(2) DEFAULT NULL,
  `enable_status` int NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'UZI', 'test_img_01', '123456', '123456', '男', '1', '2020-06-10 16:20:55', '2020-06-10 16:21:02');

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `user_account_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `username` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_account_id`),
  KEY `fk_uaccount_user` (`user_id`),
  CONSTRAINT `fk_uaccount_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_account
-- ----------------------------
INSERT INTO `user_account` VALUES ('1', '1', 'GodUZI', '123456', '2020-06-10 16:21:36', '2020-06-10 16:21:40');

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
  `addr_id` int NOT NULL,
  `u_id` int NOT NULL,
  `content` varchar(1024) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `priority` int DEFAULT '0',
  PRIMARY KEY (`addr_id`),
  KEY `fk_addr_user` (`u_id`),
  CONSTRAINT `fk_addr_user` FOREIGN KEY (`u_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `user_address` VALUES ('1', '1', '重庆', '2020-06-10 16:21:55', '2020-06-10 16:21:58', '1');
INSERT INTO `user_address` VALUES ('2', '1', '成都', '2020-06-10 16:23:18', '2020-06-10 16:23:21', '2');
