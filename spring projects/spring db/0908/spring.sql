CREATE DATABASE  IF NOT EXISTS `spring` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spring`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: spring
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board` (
  `bo_num` int NOT NULL AUTO_INCREMENT,
  `bo_title` varchar(50) NOT NULL,
  `bo_contents` longtext NOT NULL,
  `bo_views` int NOT NULL DEFAULT '0',
  `bo_reg_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `bo_up_date` datetime DEFAULT NULL,
  `bo_ori_num` int NOT NULL,
  `bo_me_id` varchar(15) NOT NULL,
  `bo_up` int NOT NULL DEFAULT '0',
  `bo_down` int NOT NULL DEFAULT '0',
  `bo_coment` int NOT NULL DEFAULT '0',
  `bo_bt_num` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`bo_num`),
  KEY `FK_member_TO_board_1` (`bo_me_id`),
  KEY `FK_bo_bt_num_idx` (`bo_bt_num`),
  CONSTRAINT `FK_bo_bt_num` FOREIGN KEY (`bo_bt_num`) REFERENCES `board_type` (`bt_num`),
  CONSTRAINT `FK_member_TO_board_1` FOREIGN KEY (`bo_me_id`) REFERENCES `member` (`me_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'첫 게시글','<p>첫게시글</p>',1,'2023-08-31 12:13:49',NULL,1,'qwe123',0,0,0,1),(2,'123','<p><font color=\"#000000\" style=\"background-color: rgb(255, 255, 0);\">qw</font>e</p>',0,'2023-09-01 09:16:48',NULL,2,'qwe123',0,0,0,1),(3,'qwe123','<p>qwe123</p>',0,'2023-09-01 09:16:54',NULL,3,'qwe123',0,0,0,1),(4,'aaaaaa','<p>abbbbbbbbbb</p>',0,'2023-09-01 09:17:00',NULL,4,'qwe123',0,0,0,1),(5,'aaaaaaccccccccc','<p>bbbbbbbbcccccccc</p>',0,'2023-09-01 09:17:08',NULL,5,'qwe123',0,0,0,1),(6,'asadasd','<p>asdasd</p>',2,'2023-09-01 09:17:15',NULL,6,'qwe123',0,0,0,1),(7,'22','<p>22</p>',1,'2023-09-01 09:19:50',NULL,7,'qwe123',0,0,0,1),(8,'첨부파일 테스트','<p>테스트<br></p>',2,'2023-09-01 09:37:02',NULL,8,'qwe123',0,0,0,1),(9,'첨부파일 테스트2','<p>첨부파일 테스트2<br></p>',25,'2023-09-01 10:48:39',NULL,9,'qwe123',0,0,0,1),(10,'123','123',0,'2023-09-04 15:21:12',NULL,10,'qwe123',0,0,0,1),(11,'asd','123',0,'2023-09-04 15:21:18',NULL,11,'qwe123',0,0,0,1),(12,'123','123',2,'2023-09-04 15:22:21',NULL,12,'qwe123',0,0,0,1),(13,'11','1',15,'2023-09-04 15:24:02',NULL,13,'qwe123',0,0,0,1),(14,'첨부파일','첨부파일',3,'2023-09-05 12:15:11',NULL,14,'qwe123',0,0,0,1),(15,'첨부파일 테스트2','',2,'2023-09-05 12:20:55',NULL,15,'qwe123',0,0,0,1),(16,'첨부파일 테스트23','',1,'2023-09-05 12:31:47',NULL,16,'qwe123',0,0,0,1),(17,'123','123',1,'2023-09-05 12:37:03',NULL,17,'qwe123',0,0,0,1),(18,'11','',1,'2023-09-05 12:39:06',NULL,18,'qwe123',0,0,0,1),(19,'11','12',1,'2023-09-05 12:50:03',NULL,19,'qwe123',0,0,0,1),(20,'213','213',4,'2023-09-05 12:54:28',NULL,20,'qwe123',0,1,0,1),(21,'111','111',71,'2023-09-05 14:10:07','2023-09-05 15:17:31',21,'qwe123',0,1,0,1),(22,'답글','<p>답글요</p>',3,'2023-09-06 15:34:07',NULL,21,'qwe123',0,0,0,1);
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `board_authority`
--

DROP TABLE IF EXISTS `board_authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board_authority` (
  `ba_num` int NOT NULL AUTO_INCREMENT,
  `ba_bt_num` int NOT NULL,
  `ba_authority` varchar(10) NOT NULL,
  PRIMARY KEY (`ba_num`),
  KEY `ba_bt_num_idx` (`ba_bt_num`),
  CONSTRAINT `ba_bt_num` FOREIGN KEY (`ba_bt_num`) REFERENCES `board_type` (`bt_num`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board_authority`
--

LOCK TABLES `board_authority` WRITE;
/*!40000 ALTER TABLE `board_authority` DISABLE KEYS */;
INSERT INTO `board_authority` VALUES (1,1,'USER'),(2,1,'ADMIN'),(8,9,'ADMIN');
/*!40000 ALTER TABLE `board_authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `board_type`
--

DROP TABLE IF EXISTS `board_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board_type` (
  `bt_num` int NOT NULL AUTO_INCREMENT,
  `bt_title` varchar(20) NOT NULL,
  PRIMARY KEY (`bt_num`),
  UNIQUE KEY `bt_title_UNIQUE` (`bt_title`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board_type`
--

LOCK TABLES `board_type` WRITE;
/*!40000 ALTER TABLE `board_type` DISABLE KEYS */;
INSERT INTO `board_type` VALUES (9,'공지사항1'),(1,'일반');
/*!40000 ALTER TABLE `board_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `co_num` int NOT NULL AUTO_INCREMENT,
  `co_contents` longtext,
  `co_me_id` varchar(15) NOT NULL,
  `co_bo_num` int NOT NULL,
  PRIMARY KEY (`co_num`),
  KEY `FK_member_TO_comment_1` (`co_me_id`),
  KEY `FK_co_bo_num_idx` (`co_bo_num`),
  CONSTRAINT `FK_co_bo_num` FOREIGN KEY (`co_bo_num`) REFERENCES `board` (`bo_num`),
  CONSTRAINT `FK_member_TO_comment_1` FOREIGN KEY (`co_me_id`) REFERENCES `member` (`me_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (4,'ㅜㅜ','qwe123',21),(5,'ㅎㅎ','qwe123',21);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `file`
--

DROP TABLE IF EXISTS `file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `file` (
  `fi_num` int NOT NULL AUTO_INCREMENT,
  `fi_name` varchar(100) DEFAULT NULL,
  `fi_ori_name` varchar(50) DEFAULT NULL,
  `fi_bo_num` int NOT NULL,
  PRIMARY KEY (`fi_num`),
  KEY `FK_fi_bo_num_idx` (`fi_bo_num`),
  CONSTRAINT `FK_fi_bo_num` FOREIGN KEY (`fi_bo_num`) REFERENCES `board` (`bo_num`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file`
--

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;
INSERT INTO `file` VALUES (3,'/2023/09/05/87706e34-eb08-4c89-9b8d-4ab53a79239c_01. 웹 통신개요 (3).pdf','01. 웹 통신개요 (3).pdf',20),(5,'/2023/09/05/40023f4d-e743-460f-8fc2-49d47117eca1_3-1. 출석입력요청대장.pdf','3-1. 출석입력요청대장.pdf',21),(6,'/2023/09/05/9c1c89fd-7901-45a1-ab1c-353dd8cd229a_강아지1.jpg','강아지1.jpg',21);
/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `like`
--

DROP TABLE IF EXISTS `like`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `like` (
  `li_num` int NOT NULL AUTO_INCREMENT,
  `li_state` int DEFAULT NULL,
  `li_me_id` varchar(15) NOT NULL,
  `li_bo_num` int NOT NULL,
  PRIMARY KEY (`li_num`),
  KEY `FK_member_TO_like_1` (`li_me_id`),
  KEY `FK_li_bo_num_idx` (`li_bo_num`),
  CONSTRAINT `FK_li_bo_num` FOREIGN KEY (`li_bo_num`) REFERENCES `board` (`bo_num`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_member_TO_like_1` FOREIGN KEY (`li_me_id`) REFERENCES `member` (`me_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `like`
--

LOCK TABLES `like` WRITE;
/*!40000 ALTER TABLE `like` DISABLE KEYS */;
INSERT INTO `like` VALUES (1,-1,'qwe123',21),(2,-1,'qwe123',20);
/*!40000 ALTER TABLE `like` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `me_id` varchar(15) NOT NULL,
  `me_pw` varchar(255) NOT NULL,
  `me_email` varchar(50) NOT NULL,
  `me_role` varchar(10) NOT NULL DEFAULT 'USER',
  `me_session_id` varchar(255) DEFAULT NULL,
  `me_session_limit` datetime DEFAULT NULL,
  PRIMARY KEY (`me_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('admin123','$2a$10$kz.KAdMzuEjowpO9gDYF7OVPSEPUa6vAaih2AK3XOHxml4GyqmCd2','asd@naver.com','ADMIN','A912C501BD2054824A5ECB1D0D5C2AFC','2023-09-15 09:33:20'),('asd123','$2a$10$TwKghicQufwudl0coYPwgOqSytQX6qmZfQAnHQA49KrXLmIju6Yhe','123@naver.com','USER',NULL,NULL),('qwe','$2a$10$Fow8rqt545S4CVb2Xw6ieep7hgbpYV4hmevrmPU/WC70xSXrcyAZq','qwe123@naver.com','USER',NULL,NULL),('qwe123','$2a$10$RsWK71hMlErXIlCPknCicON64oRftR2w9S89BuDVDVhbJpPLJWHFi','qwe123@naver.com','USER','F4351D82F2051D566F38EFF8210D2B1D',NULL);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-08 12:29:36
