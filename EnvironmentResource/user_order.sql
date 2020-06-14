/*
Navicat MySQL Data Transfer

Source Server         : csiShop
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : csishop

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-06-14 15:22:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_order
-- ----------------------------
DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `product_Number` int DEFAULT '1',
  `order_price` varchar(1000) DEFAULT NULL,
  `order_desc` varchar(1000) DEFAULT NULL,
  `comments` varchar(1000) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  `product_id` int NOT NULL,
  `user_id` int NOT NULL,
  `address_id` int DEFAULT NULL,
  `order_type` int DEFAULT NULL,
  `enable_status` int NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fk_order_product` (`product_id`) USING BTREE,
  KEY `fk_order_user` (`user_id`) USING BTREE,
  KEY `fk_order_address` (`address_id`),
  CONSTRAINT `fk_order_address` FOREIGN KEY (`address_id`) REFERENCES `user_address` (`addr_id`),
  CONSTRAINT `fk_order_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  CONSTRAINT `fk_order_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
