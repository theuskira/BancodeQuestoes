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
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alternativas`
--

LOCK TABLES `alternativas` WRITE;
/*!40000 ALTER TABLE `alternativas` DISABLE KEYS */;
INSERT INTO `alternativas` VALUES (26,'ecferc','','erver','\0',NULL,NULL,NULL,NULL,NULL,NULL,60),(27,'snciosd','','sdcn','\0','sdcj','\0',NULL,NULL,NULL,NULL,61),(28,'fewff3','\0','f34f','','f34fe','\0','wef','\0',NULL,NULL,62),(29,'vsfd','\0','23r3','','f34fe343','\0','tg4g','\0','wef42','\0',63),(30,'a','','b','\0','c','\0','d','\0','e','\0',64),(31,'f','\0','g','\0','h','','i','\0','j','\0',65),(32,'a','\0','b','\0','c','','d','\0','e','\0',66),(33,'número de entradas mapeadas por entidade atribuída.','\0','número de entidades ordenadas no mapeamento de um conjunto de relacionamentos primários.','\0','número de mapeamentos ao qual se associa uma relação de cardinalidade.','\0','número de entidades ao qual outra entidade pode ser associada por um conjunto de relacionamento.','','mapeamento de entidades ao qual outra entidade pode ser mapeada por um conjunto de atributos numéricos.','\0',67),(34,'start, from, to.','\0','select, from, where.','','select, up, what.','\0','start, from, who.','\0','select, initial, final.','\0',68),(35,'relacionamentos - entidades','\0','atributos - relacionamentos','','entidades - relacionamentos','\0','entidades - atributos','\0','atributos – entidades','\0',69),(36,'Todas são verdadeiras.','\0','Todas são falsas.','\0','Somente um item é verdadeiro','\0','Somente dois itens são verdadeiros','','Nenhuma das alternativas','\0',70),(37,'V - F - F','\0','V - V - F','','F - V - V','\0','F - F - V','\0','nenhuma das alternativas','\0',71),(38,'Alicate de bico técnico','\0','Alicate de trançar','\0','Alicate de crimpar','','Alicate de conexão de pares','\0','Alicate de corte','\0',74),(39,'wfwefwe','\0','ewvwvw','\0','ewwevwe','','wvwrvwr','\0','wvrdwvw','\0',74),(40,'Alicate de bico técnico','\0','Alicate de trançar','\0','Alicate de crimpar','','Alicate de conexão de pares','\0','Alicate de corte','\0',75),(41,'Cross-Over','\0','Straight Through','','Switched-Over','\0','Linear-Link','\0','Cross-Link','\0',76),(42,'Laranja e branco do laranja','\0','Verde e branco do verde','','Azul e branco do azul','\0','Marron e branco do marron','\0','N/A','\0',78),(43,'netstat','\0','route','\0','nslookup','','tracert','\0','ipconfig','\0',80),(44,'Certo','','Errado','\0',NULL,NULL,NULL,NULL,NULL,NULL,81),(45,'Certo','','Errado','\0',NULL,NULL,NULL,NULL,NULL,NULL,82),(46,'PIPA','\0','APIPA','','PAPI','\0','ATAPI','\0',NULL,NULL,84);
/*!40000 ALTER TABLE `alternativas` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (40,'aleatoria'),(41,'Banco de Dados'),(42,'aleatoria'),(43,'Redes de Computadores I'),(44,'Banco de Dados'),(45,'Redes de Computadores I'),(46,'Banco de Dados'),(47,'Redes de Computadores I');
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questoes`
--

LOCK TABLES `questoes` WRITE;
/*!40000 ALTER TABLE `questoes` DISABLE KEYS */;
INSERT INTO `questoes` VALUES (67,'O que significa o termo cardinalidade de mapeamento entidade relacionamento?',NULL,'Alternativa','Cardinalidade','0.5',NULL,41),(68,'As três cláusulas de que são utilizadas em uma consulta SQL são:',NULL,'Alternativa','Consulta SQL','0.5',NULL,41),(69,'No modelo de Entidade - Relacionamento utiliza-se um losango para representar __ e um retângulo para representar ___. As lacunas são preenchidas, correta e respectivamente, por:',NULL,'Alternativa','Entidade e Relacionamento','0.5',NULL,41),(70,'Analise as proposições abaixo.\nI)	O comando Delete é utilizado para remoção de uma tupla de uma determinada tabela;\nII)	O comando Insert é utilizado para adicionar uma nova coluna a uma determinada tabela;\nIII)	O comando Drop pode ser utilizado para remover uma coluna de uma determinada tabela.\nIV)	O comando Alter pode ser utilizado para alterar o nome de uma coluna de uma determinada tabela.\nMarque a opção correta referente as proposições acima.',NULL,'Alternativa','DDL','0.5',NULL,41),(71,'Quanto aos diversos comandos da linguagem SQL (Structured Query Language), analise as afirmativas abaixo, dê valores Verdadeiro ou Falso e assinale a alternativa que apresenta a sequência correta de cima para baixo.\n(  ) A palavra-chave da DQL (Data Control Language) são: SELECT.\n(   ) Um dos comandos do DML (Data Manipulation Language) é o UPDATE.\n(   ) O comando básico da DDL (Data Definition Language) são: Alter.',NULL,'Alternativa','Comandos SQL','0.5',NULL,41),(72,'[será avaliada a capacidade de construção textual do aluno, considerando os aspectos didáticos de um texto, coerência, coesão e clareza].\nEscreve os comandos SQL que criam as seguintes tabelas]\n\nEmpregado (RG, sexo, dt_nasc, pnome, unome, rua, cidade, estado, salario, dnum, supRG)\n	 supRG references Empregado(RG)\n	dnum references departamento(dnum)\n\nDepartamento (dnum, dnome, gerRG, dt_inicio) \n	gerRG references Empregado(rg)\n',NULL,'Discursiva','DDL','2','CREATE TABLE empregado(\n	RG number primary key,\n	sexo char not null,\n	dt_nasc date not null,\n	pnome varchar not null,\n	unome varchar not null,\n	rua varchar not null,\n	cidade varchar not null,\n	estado varchar not null,\n	salario number not null,\n	dnum number,\n	supRG number,\n	FOREIGN KEY (supRG),\n	REFERENCES empregado (RG),\n	FOREIGN KEY (dnum),\n	REFERENCES departamento(dnum)\n);\n\nCREATE TABLE departamento(\n	dnum number primary key,\n	dnome varchar not null,\n	gerRG number,\n	dt_inicio date not null,\n	FOREIGN KEY (gerRG),\n	REFERENCES empregado (RG)\n);',41),(73,'[será avaliada a capacidade de construção textual do aluno, considerando os aspectos didáticos de um texto, coerência, coesão e clareza].\nCrie um script SQL que retorne as informações a seguir:\n\na)	Retorne o nome completo, endereço e a cidade dos empregados de todos empregados  (0,5 ponto)\nb)	Retorne o RG e o salario dos empregados com salário maior que 3000,00 e a cidade igual a “São Luís” (0,75 ponto)\nc)	Retorne o nome dos empregados supervisionados pelo empregado com RG 987654321 (1 ponto)\n',NULL,'Discursiva','Consulta SQL','2.5','a)\n	SELECT pnome, unome, dt_nasc, cidade\n	FROM empregado\n	WHERE dnum = 3;\n\nb)\n	SELECT RG, salario\n	FROM empregado\n	WHERE salario < 3000 and cidade = \'Fortaleza\';\n\nc)\n	SELECT pnome, unome\n	FROM empregado\n	WHERE supRG = 123456789;',41),(75,'Atualmente o cabo mais utilizado em redes de computadores é o cabo de par trançado. Para montarmos fisicamente um cabo desse tipo haverá  necessidade da ferramenta intitulada tecnicamente de:',NULL,'Alternativa','Cabos de rede','1,00',NULL,43),(76,'Paulo deseja ligar dois computadores com uso de um concentrador. Resolveu utilizar um tipo de cabo par trançado para interligar a saida de dados dos dois micros as portas de dados do switch. O tipo de cabo utilizado por Paulo é conhecido como:',NULL,'Alternativa','Cabos de rede','1,00',NULL,43),(78,'Considere o conector IEC 606037 (RJ45) representado na figura.\n<pImage>\nNo padrão de pinagem TIA/EIA568A, os pares utilizados para TX são, respectivamente, as cores:','C:/Users/jacks/OneDrive/Documentos/BancodeQuestões/Imagens/Questao_q.jpg','Alternativa','Cabos de rede','1,00',NULL,45),(80,'Assinale a alternativa de ferramenta que é utilizada para se obter informações sobre registros DNS de um determinado domínio, host ou IP','','Alternativa','DNS','1,00',NULL,47),(82,'A ferramenta ipconfig pode ser utilizada para verificar informações de configurações referente as placas de redes existentes em um host. O uso do flag/all permite visualizar detalhes e informações que não aparecem inicialmente como endereço MAC e DNS.','','Verdadeiro e Falso','Comandos','1,00',NULL,47),(83,'Analise a imagem abaixo e responda.\n<mImage>\nQuantas conexões de loopback foram estabelecidas?\n______________','C:/Users/jacks/OneDrive/Documentos/BancodeQuestões/Imagens/Questao_9.jpg','Discursiva','Comandos','1,00','4',47),(84,'Ao perceber que você não acessa aos recursos da rede, executa o comando ipconfig e percebe que o ip que esta na maquina é diferente do range da rede e o mesmo está em: 169.254.x.y com a mascara 255.255.0.0. Um computador com base no Windowns configurado para usar DHCP pode atribuir-se automaticamente um endereço IP se um servidor DHCP não estiver disponivel, essa funcionalidade se chama...','','Alternativa','IPv4','1,00',NULL,47),(85,'Quais os dois tipos de pinagens para confecção de cabos par trançados?','','Discursiva','Cabos de rede','1,00','568.A, 568.B',47),(86,'Em um roteador Cisco qual o comando configura-se uma senha para acesso o modo privilegiado?','','Discursiva','Comandos','1,00','Enable Secret',47),(87,'Você realizou um comando ping para um endereço sem nenhuma flag, conforme a figura abaixo:\n<gImage>\nPerguntas: Qual flag deixa o ping executando de forma initerrupta?','C:/Users/jacks/OneDrive/Documentos/BancodeQuestões/Imagens/Questao_10.jpg','Discursiva','Comandos','1,00','-t',47);
/*!40000 ALTER TABLE `questoes` ENABLE KEYS */;
UNLOCK TABLES;

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

-- Dump completed on 2018-06-12  8:05:09
