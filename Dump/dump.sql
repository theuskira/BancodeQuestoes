-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: provadb
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `alternativas`
--

DROP TABLE IF EXISTS `alternativas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alternativas` (
  `ID_alternativas` int(11) NOT NULL AUTO_INCREMENT,
  `alt1` varchar(200) DEFAULT NULL,
  `esta_correta1` bit(1) DEFAULT NULL,
  `alt2` varchar(200) DEFAULT NULL,
  `esta_correta2` bit(1) DEFAULT NULL,
  `alt3` varchar(200) DEFAULT NULL,
  `esta_correta3` bit(1) DEFAULT NULL,
  `alt4` varchar(200) DEFAULT NULL,
  `esta_correta4` bit(1) DEFAULT NULL,
  `alt5` varchar(200) DEFAULT NULL,
  `esta_correta5` bit(1) DEFAULT NULL,
  `FK_questao` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_alternativas`),
  KEY `FK_questao` (`FK_questao`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `disciplina` (
  `ID_disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`ID_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `questoes`
--

DROP TABLE IF EXISTS `questoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questoes` (
  `ID_questao` int(11) NOT NULL AUTO_INCREMENT,
  `enunciado` text NOT NULL,
  `imagem` longtext,
  `tipo` enum('Verdadeiro e Falso','Discursiva','Alternativa') NOT NULL,
  `tema` varchar(100) DEFAULT NULL,
  `nota` varchar(4) DEFAULT NULL,
  `justificativa` longtext,
  `FK_disciplina` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_questao`),
  KEY `FK_disciplina` (`FK_disciplina`),
  CONSTRAINT `questoes_ibfk_1` FOREIGN KEY (`FK_disciplina`) REFERENCES `disciplina` (`ID_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping routines for database 'provadb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-12 14:50:47
