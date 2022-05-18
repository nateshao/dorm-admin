/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : dormadmin

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-05-18 09:27:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `building`
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '名字',
  `building_type` tinyint(3) unsigned NOT NULL COMMENT '宿舍楼类型：1男生宿舍楼 ，0女生宿舍楼',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of building
-- ----------------------------
INSERT INTO `building` VALUES ('260', '清枫阁', '1', 'M');
INSERT INTO `building` VALUES ('261', '红棉楼', '1', 'R');
INSERT INTO `building` VALUES ('262', '黄槐楼', '1', 'Y');
INSERT INTO `building` VALUES ('263', '绿杨楼', '1', 'G\\P');
INSERT INTO `building` VALUES ('264', '书新楼', '1', 'Q');
INSERT INTO `building` VALUES ('265', '碧波楼', '1', 'B');
INSERT INTO `building` VALUES ('266', '紫薇楼', '0', 'J');
INSERT INTO `building` VALUES ('267', '金桂园', '0', 'K');
INSERT INTO `building` VALUES ('268', '橙萱居', '0', 'T');
INSERT INTO `building` VALUES ('269', '蓝楹楼', '0', 'F');
INSERT INTO `building` VALUES ('270', '书院楼', '0', 'V');

-- ----------------------------
-- Table structure for `dorm`
-- ----------------------------
DROP TABLE IF EXISTS `dorm`;
CREATE TABLE `dorm` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) NOT NULL COMMENT '宿舍名',
  `building_id` int(11) DEFAULT NULL COMMENT '宿舍楼id',
  `max_num` int(11) DEFAULT '4' COMMENT '最大人数',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `dorm_ibfk_1` (`building_id`) USING BTREE,
  CONSTRAINT `dorm_ibfk_1` FOREIGN KEY (`building_id`) REFERENCES `building` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of dorm
-- ----------------------------
INSERT INTO `dorm` VALUES ('260', '5-706', '260', '6', null);
INSERT INTO `dorm` VALUES ('261', '7-111', '263', '6', null);
INSERT INTO `dorm` VALUES ('263', '10A-123', '267', '6', null);

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(64) DEFAULT NULL,
  `path` varchar(64) DEFAULT NULL,
  `component` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `iconCls` varchar(64) DEFAULT NULL,
  `keepAlive` tinyint(1) DEFAULT NULL,
  `requireAuth` tinyint(1) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `parentId` (`parentId`) USING BTREE,
  CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`parentId`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '/', null, null, '所有', null, null, null, null, '1');
INSERT INTO `menu` VALUES ('2', '/', '/home', 'Home', '学生管理', 'fa fa-graduation-cap', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('3', '/', '/home', 'Home', '楼层管理', 'fa fa-building', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('4', '/', '/home', 'Home', '宿舍管理', 'fa fa-hotel', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('5', '/', '/home', 'Home', '用户管理', 'fa fa-users', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('6', '/', '/home', 'Home', '系统管理', 'fa fa-wrench', null, '1', '1', '1');
INSERT INTO `menu` VALUES ('7', '/api/student/**', '/student/profile', 'StudentProfile', '学生资料', null, null, '1', '2', '1');
INSERT INTO `menu` VALUES ('8', '/api/building/**', '/building/info', 'BuildingInfo', '楼层信息', null, null, '1', '3', '1');
INSERT INTO `menu` VALUES ('9', '/api/dorm/**', '/dorm/details', 'DormDetails', '宿舍详情', null, null, '1', '4', '1');
INSERT INTO `menu` VALUES ('10', '/api/user/**', '/user/info', 'UserInfo', '用户信息', null, null, '1', '5', '1');
INSERT INTO `menu` VALUES ('11', '/api/system/**', '/system/profile', 'SystemProfile', '系统资料', null, null, '1', '6', '1');

-- ----------------------------
-- Table structure for `menu_role`
-- ----------------------------
DROP TABLE IF EXISTS `menu_role`;
CREATE TABLE `menu_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `mid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `mid` (`mid`) USING BTREE,
  KEY `rid` (`rid`) USING BTREE,
  CONSTRAINT `menu_role_ibfk_1` FOREIGN KEY (`mid`) REFERENCES `menu` (`id`),
  CONSTRAINT `menu_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=291 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of menu_role
-- ----------------------------
INSERT INTO `menu_role` VALUES ('283', '7', '1');
INSERT INTO `menu_role` VALUES ('284', '8', '1');
INSERT INTO `menu_role` VALUES ('285', '9', '1');
INSERT INTO `menu_role` VALUES ('286', '10', '1');
INSERT INTO `menu_role` VALUES ('287', '11', '1');
INSERT INTO `menu_role` VALUES ('288', '7', '2');
INSERT INTO `menu_role` VALUES ('289', '8', '2');
INSERT INTO `menu_role` VALUES ('290', '9', '2');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL,
  `nameZh` varchar(64) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_admin', '超级管理员');
INSERT INTO `role` VALUES ('2', 'ROLE_manager', '管理员');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_no` varchar(10) NOT NULL,
  `student_name` varchar(10) NOT NULL,
  `sex` tinyint(1) NOT NULL DEFAULT '1',
  `dorm_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1840706342', '钟开瑜', '1', '260');
INSERT INTO `student` VALUES ('2', '2040706098', '张三丰', '1', '260');
INSERT INTO `student` VALUES ('3', '2040706099', '卢西奥', '1', '260');
INSERT INTO `student` VALUES ('4', '2040706100', '李华', '1', '260');
INSERT INTO `student` VALUES ('5', '2040706101', '林悦', '0', '263');
INSERT INTO `student` VALUES ('6', '2040706102', '黄晓华', '0', '263');
INSERT INTO `student` VALUES ('7', '2040706103', '王晓红', '0', '263');
INSERT INTO `student` VALUES ('8', '2040706104', '韩梅梅', '0', '263');
INSERT INTO `student` VALUES ('9', '2040706105', '黄飞宇', '1', '261');
INSERT INTO `student` VALUES ('10', '2040706106', '王五', '1', '261');
INSERT INTO `student` VALUES ('11', '2040706107', '赵喜宇', '1', '261');
INSERT INTO `student` VALUES ('12', '2040706108', '黄叶华', '1', '261');
INSERT INTO `student` VALUES ('13', '1102150203', '邵桐杰', '1', '260');
INSERT INTO `student` VALUES ('14', '0000000011', '千羽', '1', '261');
INSERT INTO `student` VALUES ('15', '2020202022', '广东白云学院', '0', '263');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `phone` char(11) DEFAULT NULL COMMENT '手机号码',
  `enabled` tinyint(4) DEFAULT '1',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('13', '超级管理员', '13528232206', '1', 'admin', '$2a$10$lQkDrNOYHqcelxfjxkD0MukyLeC54IPnomtvwN1EnJL1ts/xlA/8O', '超级管理员');
INSERT INTO `user` VALUES ('14', '管理员', '13522221111', '1', 'mxxxl', '$2a$10$H8U41CIf4IV.YqzcGXLPFO/jj9FEUlHiAHcoy3EGy.EHkjZZpPbu2', '管理员');

-- ----------------------------
-- Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `rid` (`rid`) USING BTREE,
  KEY `user_role_ibfk_1` (`uid`) USING BTREE,
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`rid`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('75', '13', '1');
INSERT INTO `user_role` VALUES ('76', '14', '2');
