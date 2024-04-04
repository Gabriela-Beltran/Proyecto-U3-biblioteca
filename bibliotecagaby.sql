CREATE DATABASE  IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `autores`
--

DROP TABLE IF EXISTS `autores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autores` (
  `ID_AUTOR` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_AUTOR`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autores`
--

LOCK TABLES `autores` WRITE;
/*!40000 ALTER TABLE `autores` DISABLE KEYS */;
INSERT INTO `autores` VALUES (1,'osman'),(2,'Juanpa'),(3,'Elelias'),(4,'raquel123'),(7,'maluma2'),(8,'Harry Styles2'),(9,'Elias3'),(10,'Prueba3'),(11,'PRUEBAAAAAAAA2'),(12,'Elias 123'),(13,'prueba1'),(14,'autor prueba');
/*!40000 ALTER TABLE `autores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `ID_CLIENTE` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `estado_cliente` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID_CLIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (10,'osman2','mi calle2 mi direccion2 mi codigo postal2','2023-04-11','tntosman@hotmail.com','6681645680',NULL),(11,'Juan Perez','Calle 123, Ciudad X','2022-01-01','juan.perez@email.com','555-1234',NULL),(12,'Juan Perez','Calle 123, Ciudad X','2022-01-01','juan.perez@email.com','555-1234',NULL),(13,'Juan Perez','Calle 123, Ciudad X','2022-01-01','juan.perez@email.com','555-1234',NULL),(14,'Juan Perez','Calle 123, Ciudad X','2022-01-01','juan.perez@email.com','555-1234',NULL),(15,'osman','mi calle mi direccion mi codigo postal','2023-03-29','osman@hotmail.com','6681645680',NULL),(16,'osman','mi calle mi direccion mi codigo postal','2023-03-29','osman@hotmail.com','6681645680',NULL),(17,'juan','juan direccion 74','2023-03-29','juan@hotmail.com','6681645680',NULL),(18,'vvxzv','casc','2023-03-30','osman@hotmail.com','6681645680',NULL),(19,'123412','awqwe','2023-05-09','asfa@hotmail.com','6681645680',NULL),(20,'Elias Melendez','Sta Alicia 178','2023-05-09','melendez.portillo.elias@gmail.com','6682320301','1'),(21,'Pruebaaa2','Sta Alicia 178 sur','2023-05-11','emelendez@ms.uas.edu.mx','6682320301','1'),(22,'osman','mi calle mi direccion mi codigo postal','2023-05-26','osman@hotmail.com','6681645680','1'),(23,'Elias Melendez 2','Sta Alicia 178','2023-05-28','melendez.portillo.elias@gmail.com','6681575778','1'),(24,'proveedor23','mi calle2 mi direccion2 mi codigo postal2','2023-05-28','proveedor2@outlook.com','2023-04-11','1');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_compras`
--

DROP TABLE IF EXISTS `detalle_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_compras` (
  `ID_DETALLE` int NOT NULL AUTO_INCREMENT,
  `ID_COMPRA` int DEFAULT NULL,
  `ID_LIBRO` int DEFAULT NULL,
  `cantidad_comprada` int DEFAULT NULL,
  `precio_unitario` decimal(10,2) DEFAULT NULL,
  `subtotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID_DETALLE`),
  KEY `ID_COMPRA` (`ID_COMPRA`),
  KEY `ID_LIBRO` (`ID_LIBRO`),
  CONSTRAINT `detalle_compras_ibfk_1` FOREIGN KEY (`ID_COMPRA`) REFERENCES `maestro_compras` (`ID_COMPRA`),
  CONSTRAINT `detalle_compras_ibfk_2` FOREIGN KEY (`ID_LIBRO`) REFERENCES `libros` (`ID_LIBRO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_compras`
--

LOCK TABLES `detalle_compras` WRITE;
/*!40000 ALTER TABLE `detalle_compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `ID_EMPLEADO` int NOT NULL AUTO_INCREMENT,
  `nombre_completo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `ID_ESTADO_EMPLEADO` int DEFAULT NULL,
  `ID_PUESTO` int DEFAULT NULL,
  `usuario` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLEADO`),
  KEY `ID_ESTADO_EMPLEADO` (`ID_ESTADO_EMPLEADO`),
  KEY `ID_PUESTO` (`ID_PUESTO`),
  CONSTRAINT `empleados_ibfk_1` FOREIGN KEY (`ID_ESTADO_EMPLEADO`) REFERENCES `estado_empleados` (`ID_ESTADO_EMPLEADO`),
  CONSTRAINT `empleados_ibfk_2` FOREIGN KEY (`ID_PUESTO`) REFERENCES `puestos` (`ID_PUESTO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES (2,'Ana García','Calle 123, Ciudad X','2022-01-15','ana.garcia@email.com','555-1234',1,1,'admin','admin');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_empleados`
--

DROP TABLE IF EXISTS `estado_empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estado_empleados` (
  `ID_ESTADO_EMPLEADO` int NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID_ESTADO_EMPLEADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_empleados`
--

LOCK TABLES `estado_empleados` WRITE;
/*!40000 ALTER TABLE `estado_empleados` DISABLE KEYS */;
INSERT INTO `estado_empleados` VALUES (1,NULL,'1');
/*!40000 ALTER TABLE `estado_empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados_reservaciones`
--

DROP TABLE IF EXISTS `estados_reservaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados_reservaciones` (
  `ID_ESTADO_RESERVACION` int NOT NULL AUTO_INCREMENT,
  `ID_ESTATUS_LIBRO` int DEFAULT NULL,
  `ID_LIBRO` int DEFAULT NULL,
  `ID_CLIENTE` int DEFAULT NULL,
  `FECHA_prestamo` date DEFAULT NULL,
  `FECHA_devolucion` date DEFAULT NULL,
  PRIMARY KEY (`ID_ESTADO_RESERVACION`),
  KEY `ID_ESTATUS_LIBRO` (`ID_ESTATUS_LIBRO`),
  KEY `ID_LIBRO` (`ID_LIBRO`),
  KEY `ID_CLIENTE` (`ID_CLIENTE`),
  CONSTRAINT `estados_reservaciones_ibfk_1` FOREIGN KEY (`ID_ESTATUS_LIBRO`) REFERENCES `libro_estatus` (`ID_ESTATUS_LIBRO`),
  CONSTRAINT `estados_reservaciones_ibfk_2` FOREIGN KEY (`ID_LIBRO`) REFERENCES `libros` (`ID_LIBRO`),
  CONSTRAINT `estados_reservaciones_ibfk_3` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `clientes` (`ID_CLIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados_reservaciones`
--

LOCK TABLES `estados_reservaciones` WRITE;
/*!40000 ALTER TABLE `estados_reservaciones` DISABLE KEYS */;
INSERT INTO `estados_reservaciones` VALUES (1,1,1,10,'2022-10-05','2022-10-10'),(2,1,1,20,'2022-10-25','2022-11-10'),(3,1,3,10,'2022-10-05','2022-10-20'),(4,1,3,10,'2022-10-05','2022-10-20'),(5,1,3,10,'2022-10-05','2022-10-20'),(6,1,3,20,'2022-10-05','2022-10-25'),(7,1,3,20,'2022-10-05','2022-10-26'),(8,1,4,10,'2022-10-05','2022-10-20'),(9,1,5,20,'2022-10-05','2022-10-25'),(11,1,7,20,'2022-10-05','2022-10-26'),(12,1,1,10,'2023-05-30','2023-06-06'),(13,1,1,10,'2023-05-30','2023-06-06'),(14,1,5,13,'2023-05-30','2023-06-29'),(15,1,5,10,'2023-05-30','2023-06-06'),(16,1,2,10,'2023-05-30','2023-06-06'),(17,1,5,23,'2023-05-31','2023-05-31'),(18,1,5,23,'2023-05-31','2023-05-31');
/*!40000 ALTER TABLE `estados_reservaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estante`
--

DROP TABLE IF EXISTS `estante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estante` (
  `ID_ESTANTE` int NOT NULL,
  PRIMARY KEY (`ID_ESTANTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estante`
--

LOCK TABLES `estante` WRITE;
/*!40000 ALTER TABLE `estante` DISABLE KEYS */;
INSERT INTO `estante` VALUES (1),(2),(3),(4),(5);
/*!40000 ALTER TABLE `estante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generos`
--

DROP TABLE IF EXISTS `generos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generos` (
  `ID_GENERO` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_GENERO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generos`
--

LOCK TABLES `generos` WRITE;
/*!40000 ALTER TABLE `generos` DISABLE KEYS */;
INSERT INTO `generos` VALUES (1,'Terror'),(2,'Fantasia'),(3,'Ficcion'),(4,'Romance');
/*!40000 ALTER TABLE `generos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro_estatus`
--

DROP TABLE IF EXISTS `libro_estatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro_estatus` (
  `ID_ESTATUS_LIBRO` int NOT NULL,
  `estatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_ESTATUS_LIBRO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro_estatus`
--

LOCK TABLES `libro_estatus` WRITE;
/*!40000 ALTER TABLE `libro_estatus` DISABLE KEYS */;
INSERT INTO `libro_estatus` VALUES (1,'RENTADO'),(2,'ENTREGADO');
/*!40000 ALTER TABLE `libro_estatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libros`
--

DROP TABLE IF EXISTS `libros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libros` (
  `ID_LIBRO` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `isbn` varchar(20) DEFAULT NULL,
  `editorial` varchar(255) DEFAULT NULL,
  `idioma` varchar(50) DEFAULT NULL,
  `descripcion` text,
  `num_paginas` int DEFAULT NULL,
  `num_ejemplares` int DEFAULT NULL,
  `ID_ESTANTE` int DEFAULT NULL,
  `ID_AUTOR` int DEFAULT NULL,
  `ID_GENERO` int DEFAULT NULL,
  `precioxdia` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID_LIBRO`),
  KEY `ID_GENERO` (`ID_GENERO`),
  KEY `ID_AUTOR` (`ID_AUTOR`),
  KEY `ID_ESTANTE` (`ID_ESTANTE`),
  CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`ID_GENERO`) REFERENCES `generos` (`ID_GENERO`),
  CONSTRAINT `libros_ibfk_2` FOREIGN KEY (`ID_AUTOR`) REFERENCES `autores` (`ID_AUTOR`),
  CONSTRAINT `libros_ibfk_3` FOREIGN KEY (`ID_ESTANTE`) REFERENCES `estante` (`ID_ESTANTE`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libros`
--

LOCK TABLES `libros` WRITE;
/*!40000 ALTER TABLE `libros` DISABLE KEYS */;
INSERT INTO `libros` VALUES (1,'Cien años de soledad','1967-05-30','9780307474728','Editorial Sudamericana','Español','Obra maestra de la literatura latinoamericana',448,1,2,2,3,15.00),(2,'asd2','2023-05-28','asd','asd','asd','sadasd',1,1,2,2,2,12.00),(3,'1984','1949-06-08','9780451524935','Secker & Warburg','Inglés','Novela distópica que presenta una sociedad totalitaria y vigilada',328,10,1,1,1,9.99),(4,'Cien años de soledad','1967-06-05','9780307474728','Editorial Sudamericana','Español','Una saga familiar en un pueblo ficticio llamado Macondo',432,15,2,1,2,12.99),(5,'Don Quijote de la Mancha','1605-01-16','9788424117196','Editorial EDAF','Español','Las aventuras de un caballero enloquecido que busca justicia',1056,8,3,1,3,14.99),(6,'Harry Potter and the Philosopher\'s Stone','1997-06-26','9780747532699','Bloomsbury Publishing','Inglés','El primer libro de la saga de Harry Potter escrito por J.K. Rowling',256,20,4,1,4,11.99),(7,'To Kill a Mockingbird','1960-07-11','9780446310789','J. B. Lippincott & Co.','Inglés','La historia de Scout Finch y su padre, un abogado que defiende a un hombre negro acusado de violación',336,12,5,1,4,10.99),(8,'Libro prueba2','2023-05-31','11111111111111','Prueba','Uas','Este es un libro de prueba',1,1,2,4,3,15.50);
/*!40000 ALTER TABLE `libros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librosxproveedor`
--

DROP TABLE IF EXISTS `librosxproveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `librosxproveedor` (
  `ID_LIBRO` int NOT NULL,
  `ID_PROVEEDOR` int NOT NULL,
  PRIMARY KEY (`ID_LIBRO`,`ID_PROVEEDOR`),
  KEY `ID_PROVEEDOR` (`ID_PROVEEDOR`),
  CONSTRAINT `librosxproveedor_ibfk_1` FOREIGN KEY (`ID_LIBRO`) REFERENCES `libros` (`ID_LIBRO`),
  CONSTRAINT `librosxproveedor_ibfk_2` FOREIGN KEY (`ID_PROVEEDOR`) REFERENCES `proveedores` (`ID_PROVEEDOR`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librosxproveedor`
--

LOCK TABLES `librosxproveedor` WRITE;
/*!40000 ALTER TABLE `librosxproveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `librosxproveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maestro_compras`
--

DROP TABLE IF EXISTS `maestro_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maestro_compras` (
  `ID_COMPRA` int NOT NULL AUTO_INCREMENT,
  `Fecha_Compra` date DEFAULT NULL,
  `ID_PROVEEDOR` int DEFAULT NULL,
  `Total_Compra` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID_COMPRA`),
  KEY `ID_PROVEEDOR` (`ID_PROVEEDOR`),
  CONSTRAINT `maestro_compras_ibfk_1` FOREIGN KEY (`ID_PROVEEDOR`) REFERENCES `proveedores` (`ID_PROVEEDOR`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maestro_compras`
--

LOCK TABLES `maestro_compras` WRITE;
/*!40000 ALTER TABLE `maestro_compras` DISABLE KEYS */;
INSERT INTO `maestro_compras` VALUES (1,'2023-02-20',2,2500.00),(2,'2023-05-30',1,3225.00);
/*!40000 ALTER TABLE `maestro_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedores` (
  `ID_PROVEEDOR` int NOT NULL AUTO_INCREMENT,
  `razon_social` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `estado_proveedor` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`ID_PROVEEDOR`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'proveedor23','mi calle2 mi direccion2 mi codigo postal2','2023-04-11','proveedor2@outlook.com','2023-04-11',NULL),(2,'Elias Melendez Portillo23','Sta Alicia 178','2023-05-28','prueba@gmail.com','2023-05-28','1'),(3,'Siu','asdasdasd','2023-05-29','email2@email.com','2023-05-29','1'),(4,'Profe Figueroa','uas','2023-05-30','profe@gmail.com','6681545454','1'),(5,'Osman Suastegui SIU','pruebadir','2023-05-31','osman@prueba.com','2023-05-31','1');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puestos`
--

DROP TABLE IF EXISTS `puestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `puestos` (
  `ID_PUESTO` int NOT NULL,
  `nombre_puesto` varchar(255) DEFAULT NULL,
  `sueldo` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID_PUESTO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puestos`
--

LOCK TABLES `puestos` WRITE;
/*!40000 ALTER TABLE `puestos` DISABLE KEYS */;
INSERT INTO `puestos` VALUES (1,'Gerente',10000.00);
/*!40000 ALTER TABLE `puestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjeta_cliente`
--

DROP TABLE IF EXISTS `tarjeta_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarjeta_cliente` (
  `ID_TARJETA` int NOT NULL AUTO_INCREMENT,
  `ID_CLIENTE` int DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `codigo_barras` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TARJETA`),
  KEY `ID_CLIENTE` (`ID_CLIENTE`),
  CONSTRAINT `tarjeta_cliente_ibfk_1` FOREIGN KEY (`ID_CLIENTE`) REFERENCES `clientes` (`ID_CLIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjeta_cliente`
--

LOCK TABLES `tarjeta_cliente` WRITE;
/*!40000 ALTER TABLE `tarjeta_cliente` DISABLE KEYS */;
INSERT INTO `tarjeta_cliente` VALUES (1,10,'2020-12-12','2022-12-12','123456789');
/*!40000 ALTER TABLE `tarjeta_cliente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-17 17:59:55
