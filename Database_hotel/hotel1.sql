-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2018 at 10:07 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel1`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer_details`
--

CREATE TABLE `customer_details` (
  `id` int(10) NOT NULL,
  `room_no` int(10) NOT NULL,
  `name` varchar(70) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `email` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer_details`
--

INSERT INTO `customer_details` (`id`, `room_no`, `name`, `contact_no`, `email`) VALUES
(1, 101, 'Saket Uchil', '7498771643', 'saketuchil7@gmail.com'),
(2, 102, 'Aakash Parmar', '9969772388', 'aakashparmar@gmail.com'),
(3, 103, 'Chitrang Kadam', '7738104329', 'chitrangkadam@gmail.com'),
(4, 104, 'Jay Thdeshwar', '8877885529', 'jaythadeshwar@gmail.com'),
(5, 105, 'Devansh Shah', '9855356794', 'shahdevansh@gmail.com'),
(6, 106, 'Karan Nandaniya', '8855449220', 'karannandaiya@gmail.com'),
(7, 107, 'Cristano Ronaldo', '8598744136', 'cronaldo7@gmail.com'),
(8, 108, 'Lionel Messi', '9877145368', 'lmessi@gmail.com'),
(9, 109, 'Arjen Robben', '8844552217', 'arjenrobben@gmail.com'),
(10, 110, 'Sunil Chettri', '8855449977', 'chettri@gmail.com'),
(11, 111, 'Purvesh Ghedia', '8545468468', 'pghedia@gmail.com'),
(12, 112, 'Jishan Joshi', '9874512544', 'jishanj@gmail.com'),
(13, 113, 'Naitik Joshi', '8844525211', 'naitikjoshi@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `room_details`
--

CREATE TABLE `room_details` (
  `room_no` int(10) NOT NULL,
  `room_category` varchar(20) NOT NULL,
  `Bill` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room_details`
--

INSERT INTO `room_details` (`room_no`, `room_category`, `Bill`) VALUES
(101, 'Single', 1500),
(102, 'Master Suite', 7000),
(103, 'Double', 3000),
(104, 'Triple', 5000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer_details`
--
ALTER TABLE `customer_details`
  ADD PRIMARY KEY (`room_no`);

--
-- Indexes for table `room_details`
--
ALTER TABLE `room_details`
  ADD PRIMARY KEY (`room_no`,`room_category`,`Bill`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
