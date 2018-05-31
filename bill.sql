/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : bill

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-05-31 11:57:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) unsigned NOT NULL,
  `big_type` int(2) unsigned NOT NULL DEFAULT '0' COMMENT '大分类：收支；支出：0   收入：1',
  `mid_type` int(4) NOT NULL DEFAULT '0' COMMENT '中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它',
  `small_type` int(11) DEFAULT NULL COMMENT 'mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费',
  `money` float(11,2) NOT NULL DEFAULT '0.00' COMMENT '单次消费金额',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '消费标题',
  `bill_desc` varchar(255) DEFAULT '' COMMENT '消费说明、注释',
  `transaction_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '交易时间，即记录账目发生日期',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '添加本条记录时间',
  `edit_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改本次交易记录时间',
  `is_delete` int(2) NOT NULL DEFAULT '0' COMMENT '是否删除(软删除)，0：未删除   1：删除',
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `type_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', '1', '0', '0', '1', '30.00', '午餐', null, '2018-05-30 15:58:17', '2018-05-30 15:58:23', '2018-05-30 16:00:58', '0');
INSERT INTO `type` VALUES ('2', '6', '0', '0', '2', '120.00', 'T恤', null, '2018-05-30 16:02:16', '2018-05-30 16:02:16', '2018-05-30 16:02:16', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户表',
  `open_id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名（自己取的）',
  `nick_name` varchar(255) NOT NULL DEFAULT '' COMMENT '微信昵称',
  `gender` int(2) NOT NULL DEFAULT '1' COMMENT '性别  1：男',
  `avatar_url` varchar(255) DEFAULT NULL,
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  `country` varchar(255) DEFAULT NULL COMMENT '国籍',
  `province` varchar(255) DEFAULT NULL COMMENT '省份',
  `city` varchar(255) DEFAULT NULL COMMENT '城市（微信信息）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '张三', '张三1', '1', 'https://www.baidu.com/img/bd_logo1.png', '2018-05-30 14:04:54', '中国', '上海', '上海');
INSERT INTO `user` VALUES ('6', '234', '李四', '李四1', '1', 'https://www.baidu.com/img/bd_logo1.png', '2018-05-30 14:04:54', '中国', '上海', '上海');
