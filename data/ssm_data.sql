/*
Navicat MySQL Data Transfer

Source Server         : student
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : ssm_data

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2018-10-16 11:28:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` char(15) DEFAULT NULL,
  `password` char(20) DEFAULT NULL,
  `name` char(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'aa', '123', '张三丰');
INSERT INTO `admin` VALUES ('2', 'aa', '123456', '张无忌');
INSERT INTO `admin` VALUES ('3', 'aa', '333', '赵敏');
INSERT INTO `admin` VALUES ('4', 'aa', '555', '郭靖');
INSERT INTO `admin` VALUES ('5', 'aa', '1213123', '杨过');
INSERT INTO `admin` VALUES ('6', 'aa', '2131', '金轮法王');

-- ----------------------------
-- Table structure for `details`
-- ----------------------------
DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `Original price` varchar(1000) DEFAULT NULL,
  `promotion` varchar(1000) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `sales` varchar(255) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of details
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `Unit Price` varchar(10) DEFAULT NULL,
  `number` varchar(100) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(10) DEFAULT NULL,
  `price` float(10,2) DEFAULT NULL,
  `productTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '红烧肉', '28.00', '1');
INSERT INTO `product` VALUES ('3', '红烧排骨', null, null);
INSERT INTO `product` VALUES ('4', '红烧排骨', null, '2');

-- ----------------------------
-- Table structure for `producttype`
-- ----------------------------
DROP TABLE IF EXISTS `producttype`;
CREATE TABLE `producttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dessert` varchar(255) DEFAULT NULL,
  `chinese` varchar(10) DEFAULT NULL,
  `west` varchar(1000) DEFAULT NULL,
  `drinks` varchar(1000) DEFAULT NULL,
  `wine` varchar(255) DEFAULT NULL,
  `cold` varchar(255) DEFAULT NULL,
  `fish` varchar(255) DEFAULT NULL,
  `lce` varchar(255) DEFAULT NULL,
  `tea` varchar(255) DEFAULT NULL,
  `noodle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of producttype
-- ----------------------------
INSERT INTO `producttype` VALUES ('1', 'qqq', 'dd', 'dd', '许先生', '200', null, null, null, null, null);
INSERT INTO `producttype` VALUES ('2', '栏目1', 'cc', 'cc', '本栏目是……', '30', null, null, null, null, null);
