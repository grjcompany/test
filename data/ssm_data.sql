/*
Navicat MySQL Data Transfer

Source Server         : student
Source Server Version : 60011
Source Host           : localhost:3306
Source Database       : ssm_data

Target Server Type    : MYSQL
Target Server Version : 60011
File Encoding         : 65001

Date: 2018-10-24 20:28:12
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
INSERT INTO `admin` VALUES ('2', 'aa1', '123456', '张无忌');
INSERT INTO `admin` VALUES ('3', 'aa2', '333', '赵敏');
INSERT INTO `admin` VALUES ('4', 'aa3', '555', '郭靖');
INSERT INTO `admin` VALUES ('5', 'aa4', '1213123', '杨过');
INSERT INTO `admin` VALUES ('6', 'aa5', '2131', '金轮法王');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `Unit Price` varchar(10) DEFAULT NULL,
  `number` varchar(100) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `picture` varchar(255) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `price` varchar(1000) DEFAULT NULL,
  `promotion` varchar(1000) DEFAULT NULL,
  `num` varchar(255) DEFAULT NULL,
  `sales` varchar(255) DEFAULT NULL,
  `total` varchar(255) DEFAULT NULL,
  `productTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', null, '红烧肉', '28', '25', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('2', null, '淮山炒杏鲍菇', '56', '50', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('3', null, '爆豆丁', '56', '50', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('4', null, '炒三丝', '43', '40', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('5', null, '蝶恋花', '34', '30', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('6', null, '红烧排骨', '45', '40', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('7', null, '红椒爆炒肠', '45', '40', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('8', null, '烤鸭', '89', '80', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('9', null, '凉拌木耳', '20', '18', '1000', '220', null, '1');
INSERT INTO `product` VALUES ('10', null, '卤味小拼盘', '155', '150', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('11', null, '十三香小龙虾', '189', '180', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('12', null, '酸辣鱿鱼', '54', '50', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('13', null, '蒜蓉小龙虾', '200', '180', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('14', null, '蒜薹炒腊肉', '88', '80', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('15', null, '土豆丝', '15', '12', '1000', '200', null, '1');
INSERT INTO `product` VALUES ('16', null, '草花炒红薯菜', '20', '18', '1000', '200', null, '2');
INSERT INTO `product` VALUES ('17', null, '清炒青菜', '15', '12', '1000', '200', null, '2');
INSERT INTO `product` VALUES ('18', null, '手撕包菜', '15', '12', '1000', '200', null, '2');
INSERT INTO `product` VALUES ('19', null, '蒜蓉青菜', '15', '12', '1000', '200', null, null);
INSERT INTO `product` VALUES ('20', null, '鲷鱼豆腐汤', '50', '45', '1000', '200', null, null);
INSERT INTO `product` VALUES ('21', null, '金汤海参', '88', '80', '1000', '200', null, null);
INSERT INTO `product` VALUES ('22', null, '田园排骨汤', '66', '60', '1000', '200', null, null);
INSERT INTO `product` VALUES ('23', null, '土豆萝卜汤', '45', '42', '1000', '200', null, null);
INSERT INTO `product` VALUES ('24', null, '玉米小排汤', '66', '62', '1000', '200', null, null);
INSERT INTO `product` VALUES ('25', null, '松鼠鱼', '88', '80', '1000', '200', null, null);
INSERT INTO `product` VALUES ('26', null, '糖酥鲤鱼', '55', '50', '1000', '200', null, null);
INSERT INTO `product` VALUES ('27', null, '糖醋鱼', '70', '65', '1000', '200', null, null);
INSERT INTO `product` VALUES ('28', null, '剁椒蒸鱼', '88', '80', '1000', '200', null, null);
INSERT INTO `product` VALUES ('29', null, '干煎鱼', '60', '50', '1000', '200', null, null);
INSERT INTO `product` VALUES ('30', null, '麻辣水煮鱼', '88', '80', '1000', '200', null, null);
INSERT INTO `product` VALUES ('31', null, '浓汤炖大鱼头', '88', '80', '1000', '200', null, null);
INSERT INTO `product` VALUES ('32', null, '蝴蝶乌鱼片', '70', '60', '1000', '200', null, null);
INSERT INTO `product` VALUES ('33', null, '薄荷柠檬', '20', '16', '1000', '200', null, null);
INSERT INTO `product` VALUES ('34', null, '薄荷水', '10', '7', '1000', '200', null, null);
INSERT INTO `product` VALUES ('35', null, '冰可乐', '10', '7', '1000', '200', null, null);
INSERT INTO `product` VALUES ('36', null, '可乐柠檬汁', '15', '12', '1000', '200', null, null);
INSERT INTO `product` VALUES ('37', null, '蓝莓冰沙', '18', '15', '1000', '200', null, null);
INSERT INTO `product` VALUES ('38', null, '奶茶', '8', '7', '1000', '200', null, null);
INSERT INTO `product` VALUES ('39', null, '水果茶', '10', '8', '1000', '200', null, null);
INSERT INTO `product` VALUES ('40', null, '鲜柠汁', '10', '8', '1000', '200', null, null);
INSERT INTO `product` VALUES ('41', null, '鲜榨西瓜汁', '20', '18', '1000', '200', null, null);
INSERT INTO `product` VALUES ('42', null, '鲜榨紫薯汁', '20', '18', '1000', '200', null, null);
INSERT INTO `product` VALUES ('43', null, '番茄蓝莓沙拉', '50', '45', '1000', '200', null, null);
INSERT INTO `product` VALUES ('44', null, '菲力牛排', '70', '65', '1000', '200', null, null);
INSERT INTO `product` VALUES ('45', null, '黑胡椒意大利面', '30', '25', '1000', '200', null, null);

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
