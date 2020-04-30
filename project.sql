-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2020 at 09:40 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `new`
--

CREATE TABLE `new` (
  `name` varchar(30) NOT NULL,
  `fname` varchar(30) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `email` varchar(45) NOT NULL,
  `mob` varchar(30) NOT NULL,
  `address` varchar(70) NOT NULL,
  `state` varchar(15) NOT NULL,
  `pincode` varchar(15) NOT NULL,
  `salary` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `new`
--

INSERT INTO `new` (`name`, `fname`, `dob`, `email`, `mob`, `address`, `state`, `pincode`, `salary`) VALUES
('', '', '', '', '', '', '', '', ''),
('', '', '', '', '', '', '', '', ''),
('john', '', '', '890@', '890', '', '', '', '2000'),
('aajay', 'Sanjay', '7/8/2002', 'aj@gmail.com', '89569856985', 'Indore', 'Madhya Pradesh', '452018', '8000');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `name` varchar(200) NOT NULL,
  `mob` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `mob`, `address`) VALUES
('a', '12', 'd'),
('1', '3', '2'),
('a', '1', 'a'),
('1', '3', '2'),
('as', '21', '32g'),
('aadarsh', '9589082610', '56,patel'),
('aadarsh', '9589082610', '45,khargone'),
('aada', '9589082610', '56,patel khargone'),
('aadarsh', '9589082610', '56,khargone'),
('aadarsh', '9589082610', '78,patel khargone'),
('aadaesh', 'fdhfdhfdhdfh', 'fhdgdfhfh'),
('aada', 'fhdgdfhdh', 'fhdfdhgdh'),
('ss', 'fdfgg', 'fdhfdhd'),
('aasas', 'asasasas', 'asasasasa'),
('aaasssassa', 'sasasasasasa', 'sasasasasasa'),
('aadarsh', '9926028654', '31sanvid nagar indore'),
('mohini', '9589082610', '1234kujvhvhusadhvihusdig'),
('aadads', 'asasasas', 'asasasasa'),
('aagam', '9926011356', 'guna madhya pradesh'),
('aasassasasas', 'asasasaasasa', 'sasasasasasas'),
('hgghghghghg', 'hghghghghg', 'hghghghghgh'),
('dsddsd', 'dsdsd', 'scsc'),
('', '', ''),
('', '', ''),
('', '', ''),
('', '', ''),
('', '', ''),
('', '', ''),
('aadarsh', '9926028610', 'asadsDSDEFEQFDEFE'),
('AYUSHI', '8989565689', 'SAQ2WE2E2E31R3'),
('aaaaaaaa', '95890826104', '434wsdwdewdw'),
('', '', ''),
('aaa', 'adsd', 'dsd'),
('', '', ''),
('', '', ''),
('', '', ''),
('aasdarsh', '34433344', '434fdsfdfgsdg'),
('aada', '54354435', 'fdsfg45'),
('', '', ''),
('as', 'as', 'as'),
('aadarsh', '9589082610', '46,patel nagr'),
('aadarsh', '9589082610', '45,patel nager'),
('Aadarsh', '9589698596', 'Indore');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
