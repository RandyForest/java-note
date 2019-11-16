CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `test`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT '0',
  `user_id` int(11) DEFAULT NULL COMMENT '此账号属于哪个用户',
  PRIMARY KEY (`id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='账户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,80.99,2),(2,130.99,4),(4,100.99,2);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(45) DEFAULT NULL COMMENT '书名',
  `b_price` varchar(45) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='书籍表\n此表使用了前缀 b_';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'bbb','ppp'),(2,'qqq','ddd');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `user_id` varchar(45) DEFAULT NULL COMMENT '该订单的用户ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_code_uindex` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'adsfasfqqqqqxxx','1'),(2,'asdfasdf','2'),(3,'qqqw','3'),(4,'asdwwwww','4'),(5,'q','5'),(6,'eqw','6'),(7,'d','7'),(8,'gs','8'),(9,'cvx','9'),(10,'b','1'),(11,'rt','2'),(12,'uh','3'),(13,'ty','4'),(16,'youhe','5');
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL COMMENT '产品名',
  `price` double DEFAULT NULL COMMENT '价格',
  `order_id` int(11) DEFAULT NULL COMMENT '订单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='产品表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'aaa',123.2,2),(2,'bbb',321.3,2),(3,'aabb',11.22,1),(4,'bbaa',22.111,3),(5,'cabbca',322.211,2),(6,'zxccxz',443.34,1),(7,'qpqpqp',5677.5,4),(8,'asdf',123.12,10),(9,'pxpxpx',2003.33,10);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL COMMENT '用户名',
  `password` varchar(45) DEFAULT NULL COMMENT '密码',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` varchar(45) DEFAULT NULL COMMENT '性别',
  `address` varchar(45) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'user1',NULL,'2019-05-11','男','北京'),(2,'user2',NULL,'2018-11-07','女','上海'),(4,'aaaa',NULL,NULL,NULL,NULL),(5,'aaa',NULL,NULL,NULL,NULL),(6,'aaabb',NULL,NULL,NULL,NULL),(7,'naa',NULL,NULL,NULL,NULL),(11,'naa','naa',NULL,NULL,NULL),(12,NULL,'paaaaa',NULL,NULL,NULL),(13,'naa',NULL,'0100-02-02',NULL,NULL),(14,'naa',NULL,'0100-02-02','男','香港'),(15,'naa','naa','0100-02-02','男','香港'),(16,'naa','naa','0100-02-02','男','香港'),(17,'Naamaaa','nnnaaa','2019-11-16','两','火星'),(20,'Naame?','nnn','2019-10-22','中','火星'),(21,'Naame?','nnn','2019-10-22','中','火星'),(23,'Naam','nnn','2019-10-22','中','火星'),(24,'Wawoa','nnnooo','2019-10-23','中','木星'),(25,'Ojojin','nnnooo','2019-10-23','两','木星'),(26,'Wawoa','nnnooo','2019-10-23','中','木星'),(27,'Wawoa','nnnooo','2019-10-23','中','木星'),(28,'Naam','nnn','2019-10-25','中','火星'),(29,'Wawoa','nnnooo','2019-10-25','中','木星'),(30,'Naam','nnn','2019-10-25','中','火星'),(31,'Wawoa','nnnooo','2019-10-25','中','木星'),(32,'Wawoa','nnnooo','2019-10-25','中','木星'),(33,'Naam','nnn','2019-10-25','中','火星'),(34,'Naam','nnn','2019-11-16','中','火星'),(35,'Wawoa','nnnooo','2019-11-16','中','木星'),(36,'Naam','nnn','2019-11-16','中','火星'),(37,'Naam','nnn','2019-11-16','中','火星'),(38,'Naam','nnn','2019-11-16','中','火星'),(39,'Wawoa','nnnooo','2019-11-16','中','木星'),(40,'Naam','nnn','2019-11-16','中','火星'),(41,'Wawoa','nnnooo','2019-11-16','中','木星'),(42,'naa','naa','0100-02-02','男','香港');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'test'
--

--
-- Dumping routines for database 'test'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-16 20:56:46
