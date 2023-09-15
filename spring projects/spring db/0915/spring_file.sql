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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `file`
--

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;
INSERT INTO `file` VALUES (3,'/2023/09/05/87706e34-eb08-4c89-9b8d-4ab53a79239c_01. 웹 통신개요 (3).pdf','01. 웹 통신개요 (3).pdf',20),(5,'/2023/09/05/40023f4d-e743-460f-8fc2-49d47117eca1_3-1. 출석입력요청대장.pdf','3-1. 출석입력요청대장.pdf',21),(6,'/2023/09/05/9c1c89fd-7901-45a1-ab1c-353dd8cd229a_강아지1.jpg','강아지1.jpg',21),(7,'/2023/09/10/166d2103-a2d3-4eec-8393-6157aff56f38_4-2. 평가일정표 (1) (1).pdf','4-2. 평가일정표 (1) (1).pdf',23);
/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-15 15:48:46
