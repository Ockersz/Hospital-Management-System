-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 18, 2022 at 02:44 PM
-- Server version: 5.5.0-m2-community
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `project`
--
CREATE DATABASE IF NOT EXISTS `project` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `project`;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `e_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `tp` int(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`e_id`, `name`, `age`, `address`, `tp`, `gender`, `username`, `password`) VALUES
(1, 'ockersz', 22, 'ragama', 765410491, 'Male', 'shahi', '123'),
(2, 'theekshana', 20, 'colombo', 705619177, 'Male', 'donga', '12345'),
(3, 'tharindi', 21, 'kiribathgoda', 711234567, 'Female', 'hospital', '0707');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `patient_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `contact_no` int(10) NOT NULL,
  `age` int(3) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `blood_group` varchar(5) NOT NULL,
  `address` varchar(100) NOT NULL,
  `deases` varchar(253) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`patient_id`, `name`, `contact_no`, `age`, `gender`, `blood_group`, `address`, `deases`) VALUES
(1, 'theekshana', 705619177, 23, 'Male', 'A+', 'koggalla', 'no'),
(2, 'pasa', 765528120, 12, 'Male', 'A+', 'moratuwa', 'yes'),
(3, 'vihan', 764741423, 21, 'Male', 'O+', 'bandaragama', 'no'),
(4, 'tharush', 705748488, 22, 'Male', 'AB-', 'Anuradapura', 'yes'),
(5, 'tharush', 705748488, 22, 'Male', 'AB-', 'Anuradapura', 'yes'),
(6, 'suresh', 766531506, 23, 'Male', 'A+', 'Horana', 'no'),
(7, 'Nawod', 771234567, 56, 'Female', 'O+', 'polonnaruwa', 'yes'),
(8, 'GAYAN', 776624475, 23, 'Male', 'AB+', 'COLOMBO', 'NO'),
(9, 'tharrindi', 711234567, 21, 'Male', 'B+', 'kiribathgoda', 'no'),
(10, 'sameera', 761234567, 36, 'Male', 'A+', 'panadura', 'no'),
(11, 'nimsara', 783419874, 21, 'Female', 'O+', 'tammita', 'yes'),
(12, 'thiwanka', 705619177, 21, 'Female', 'A+', 'makola', 'no'),
(13, 'senanayake', 751234567, 23, 'Male', 'A+', 'panadura', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

DROP TABLE IF EXISTS `report`;
CREATE TABLE IF NOT EXISTS `report` (
  `report_id` int(5) NOT NULL AUTO_INCREMENT,
  `patient_id` int(5) NOT NULL,
  `ward_type` varchar(10) NOT NULL,
  `medicine` varchar(253) NOT NULL,
  `Symptoms` varchar(253) NOT NULL,
  `Diagnosis` varchar(253) NOT NULL,
  PRIMARY KEY (`report_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`report_id`, `patient_id`, `ward_type`, `medicine`, `Symptoms`, `Diagnosis`) VALUES
(1, 1, 'Single', 'piriton', 'cought', 'feewer'),
(2, 7, 'Duo', 'aralupethi', 'puka kahanwa', 'kiripanugaya'),
(3, 11, 'Single', 'priton', 'edas', 'kasanawa'),
(4, 12, 'Genaral', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
