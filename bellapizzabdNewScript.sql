-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bellapizzabd
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bebida`
--

DROP TABLE IF EXISTS `bebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bebida` (
  `Codigo_Bebida` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(35) NOT NULL,
  `Preco_Venda` decimal(5,2) DEFAULT NULL,
  `Preco_Compra` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`Codigo_Bebida`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebida`
--

LOCK TABLES `bebida` WRITE;
/*!40000 ALTER TABLE `bebida` DISABLE KEYS */;
INSERT INTO `bebida` VALUES (1,'coca cola 2L',NULL,5),(2,'guarana 2L',NULL,5),(3,'fanta laranja 2L',NULL,5),(4,'sprite 2L',NULL,5);
/*!40000 ALTER TABLE `bebida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `Codigo_Cliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(35) NOT NULL,
  `Telefone` int(13) NOT NULL,
  `Rua` varchar(20) DEFAULT NULL,
  `Numero` int(4) DEFAULT NULL,
  `Bairro` varchar(20) DEFAULT NULL,
  `Complemento` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Codigo_Cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingrediente`
--

DROP TABLE IF EXISTS `ingrediente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ingrediente` (
  `Codigo_Ingrediente` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(35) DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  `Preco_Unitario` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`Codigo_Ingrediente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingrediente`
--

LOCK TABLES `ingrediente` WRITE;
/*!40000 ALTER TABLE `ingrediente` DISABLE KEYS */;
INSERT INTO `ingrediente` VALUES (1,'alho',4000,11),(2,'aliche',4000,15),(3,'presunto',4000,45),(4,'mussarela',4000,85),(5,'catupiry',2000,25),(6,'tomate',1000,10),(7,'azeitona',2000,25),(8,'ovo',4000,22),(9,'bacon',2000,25),(10,'cebola',1000,26),(11,'atum',4000,9),(12,'parmesao',4000,50),(13,'calabresa',4000,50),(14,'molho pimenta',50,5),(15,'brocolis',1000,14),(16,'camarao',4000,80),(17,'carne seca',4000,65),(18,'cheddar',4000,46),(19,'escarola',1000,10),(20,'ervilha',4000,14),(21,'palmito',4000,46),(22,'peito de frango',1000,10),(23,'creme de leite',4000,10),(24,'milho verde',4000,10),(25,'lombo canadense',4000,50),(26,'manjericao',1000,13),(27,'provolone',4000,50),(28,'champignon',1000,20);
/*!40000 ALTER TABLE `ingrediente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motoboy`
--

DROP TABLE IF EXISTS `motoboy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `motoboy` (
  `Codigo_Motoboy` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(35) NOT NULL,
  PRIMARY KEY (`Codigo_Motoboy`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motoboy`
--

LOCK TABLES `motoboy` WRITE;
/*!40000 ALTER TABLE `motoboy` DISABLE KEYS */;
/*!40000 ALTER TABLE `motoboy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pedido` (
  `Codigo_Pedido` int(11) NOT NULL AUTO_INCREMENT,
  `Data` date NOT NULL,
  `Cliente_Codigo_Cliente` int(11) NOT NULL,
  `Motoboy_Codigo_Motoboy` int(11) NOT NULL,
  `Bebida_Codigo_Bebida` int(11) NOT NULL,
  `Pizza_Codigo_Pizza` int(11) NOT NULL,
  PRIMARY KEY (`Codigo_Pedido`,`Cliente_Codigo_Cliente`,`Motoboy_Codigo_Motoboy`,`Bebida_Codigo_Bebida`,`Pizza_Codigo_Pizza`),
  KEY `fk_Pedido_Cliente_idx` (`Cliente_Codigo_Cliente`),
  KEY `fk_Pedido_Motoboy1_idx` (`Motoboy_Codigo_Motoboy`),
  KEY `fk_Pedido_Bebida1_idx` (`Bebida_Codigo_Bebida`),
  KEY `fk_Pedido_Pizza1_idx` (`Pizza_Codigo_Pizza`),
  CONSTRAINT `fk_Pedido_Bebida1` FOREIGN KEY (`Bebida_Codigo_Bebida`) REFERENCES `bebida` (`Codigo_Bebida`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Cliente` FOREIGN KEY (`Cliente_Codigo_Cliente`) REFERENCES `cliente` (`Codigo_Cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Motoboy1` FOREIGN KEY (`Motoboy_Codigo_Motoboy`) REFERENCES `motoboy` (`Codigo_Motoboy`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pedido_Pizza1` FOREIGN KEY (`Pizza_Codigo_Pizza`) REFERENCES `pizza` (`Codigo_Pizza`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pizza`
--

DROP TABLE IF EXISTS `pizza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pizza` (
  `Codigo_Pizza` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(35) NOT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  `Preco_Venda` decimal(5,2) DEFAULT NULL,
  `Ingrediente_Codigo_Ingrediente` int(11) NOT NULL,
  PRIMARY KEY (`Codigo_Pizza`,`Ingrediente_Codigo_Ingrediente`),
  KEY `fk_Pizza_Ingrediente1_idx` (`Ingrediente_Codigo_Ingrediente`),
  CONSTRAINT `fk_Pizza_Ingrediente1` FOREIGN KEY (`Ingrediente_Codigo_Ingrediente`) REFERENCES `ingrediente` (`Codigo_Ingrediente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizza`
--

LOCK TABLES `pizza` WRITE;
/*!40000 ALTER TABLE `pizza` DISABLE KEYS */;
INSERT INTO `pizza` VALUES (1,'alho e oleo',NULL,25,1),(2,'aliche',NULL,27,2),(3,'a moda',NULL,29,3),(4,'atum com catupiry',NULL,27,4),(5,'bacon',NULL,25,5),(6,'baiana',NULL,25,6),(7,'bauru',NULL,25,7),(8,'brocolis',NULL,25,8),(9,'calabresa',NULL,25,9),(10,'camarao',NULL,33,10),(11,'carne seca',NULL,29,11),(12,'catupiresa',NULL,27,12),(13,'escarola',NULL,25,13),(14,'espanhola',NULL,29,14),(15,'fascinante',NULL,29,15),(16,'fiorentina',NULL,29,16),(17,'frango com catupiry',NULL,27,17),(18,'frango com mussarela',NULL,25,18),(19,'italia',NULL,29,19),(20,'lombo com catupiry',NULL,27,20),(21,'manjericao',NULL,25,21),(22,'marguerita',NULL,25,22),(23,'milho verde',NULL,25,23),(24,'mussarela',NULL,25,24),(25,'palmito',NULL,27,25),(26,'paulista',NULL,27,26),(27,'portuguesa',NULL,29,27),(28,'salame',NULL,29,28);
/*!40000 ALTER TABLE `pizza` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-08 20:56:18
