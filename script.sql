-- MySQL dump 10.13  Distrib 8.0.19, for Linux (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `initial_stock` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `remaining_stock` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,4,'Ramette papier A5',2),(2,2000,'Ramette papier A3',20),(3,10,'Paquets de papier amélioré jaune A4 ( sans en tête)',10),(4,9500,'Papier amélioré jaune A4( en tête du président) - papiers',9500),(5,41500,'Papier amélioré jaune A4 ( en tête)-papiers',41500),(6,10,'Paquets de papier blanc A4 ( en tête) - paquets',10),(7,300,'Papier laserA4 couleur jaune - feuilles',300),(8,400,'Papier laserA4 couleur vert - feuilles',400),(9,500,'Papier laserA4 couleur rose - feuilles',500),(10,500,'Papier laserA4 couleur bleu - feuilles ',500),(11,23,'Cube papier',23),(12,50,'Paquets de chemise bulle',50),(13,375,'Chemises des dossiers du CC',375),(14,1215,'Chemises cartonnées de couleur différente',1215),(15,90,'Chemises cartonnées blanches',90),(16,330,'Chemises a rabat',330),(17,52,'Cahier 100 pages PT',52),(18,30,'Cahier 200 pages PT',30),(19,34,'Cahier 200 pages (spirales GF )',34),(20,106,'Bloc Note ( 21/29,7) 100 pages',106),(21,38,'Bloc Note ( 21/29,7) 200 pages',38),(22,150,'Bloc note du CC',150),(23,12,'Registre 5m',12),(24,13,'Registre 3m',13),(25,14,'Registre 2m',14),(26,6,'Registre à courrier (Arrivée)',6),(27,7,'Registre à courrier (Départ)',7),(28,20,'Boites d’archives  en carton',20),(29,69,'Boites d’archives  en plastique',69),(30,34,'Boites d’archives  en plastique SICLA',34),(31,8,'Parapheur',8),(32,210,'Enveloppes blanche 24/16',210),(33,310,'Enveloppes pochette jaune 24/16',310),(34,500,'Enveloppes pochette ( Kraft) 35/25',500),(35,100,'Enveloppes pochette jaune 23.5/23',100),(36,100,'Enveloppes jaune 35/27',100),(37,500,'Enveloppes jaune 40/27',500),(38,390,'Enveloppes pochette 36/26',390),(39,160,'Enveloppes pochette blanche36.5/26.5',160),(40,90,'Enveloppes pochette jaune 23/33',90);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-05 23:11:40
