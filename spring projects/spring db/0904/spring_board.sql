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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'첫 게시글','<p>ㅎㅇㅎㅇ</p>',0,'2023-09-01 02:18:21',NULL,1,'qweqwe',0,0,0,1),(2,'두번째 게시글','<p>ㅎㅇㅎㅇㅎㅇ</p>',0,'2023-09-01 02:18:59',NULL,2,'qweqwe',0,0,0,1),(3,'23123','<p>123</p>',0,'2023-09-01 02:25:11',NULL,3,'qweqwe',0,0,0,1),(4,'ㅂㅈㄷㅂㅈㄷ','<p>123</p>',0,'2023-09-01 02:25:31',NULL,4,'qweqwe',0,0,0,1),(5,'ㅂㅈㄷ','<p>213</p>',0,'2023-09-01 02:25:35',NULL,5,'qweqwe',0,0,0,1),(6,'ㅂㅈㄷ','<p>213</p>',2,'2023-09-01 02:25:38',NULL,6,'qweqwe',0,0,0,1),(7,'ㅂㅈㄷ23','<p>23</p>',14,'2023-09-01 02:25:43',NULL,7,'qweqwe',0,0,0,1),(8,'123','<p>qwe</p>',4,'2023-09-03 21:47:37',NULL,8,'qweqwe',0,0,0,1),(9,'111111','<p>1111111</p>',0,'2023-09-03 22:09:32',NULL,9,'qweqwe',0,0,0,1);
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-03 22:48:31
