-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 16, 2022 at 02:47 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ventilador`
--

-- --------------------------------------------------------

--
-- Table structure for table `capacidad`
--

CREATE TABLE `capacidad` (
  `id` int(11) NOT NULL,
  `capacidad` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `capacidad`
--

INSERT INTO `capacidad` (`id`, `capacidad`) VALUES
(1, 5000),
(2, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `categoriaequipo`
--

CREATE TABLE `categoriaequipo` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categoriaequipo`
--

INSERT INTO `categoriaequipo` (`id`, `descripcion`) VALUES
(1, 'c1'),
(2, 'c2');

-- --------------------------------------------------------

--
-- Table structure for table `refrigerantes`
--

CREATE TABLE `refrigerantes` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `refrigerantes`
--

INSERT INTO `refrigerantes` (`id`, `name`) VALUES
(1, 't1'),
(2, 't2');

-- --------------------------------------------------------

--
-- Table structure for table `tipoequipo`
--

CREATE TABLE `tipoequipo` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tipoequipo`
--

INSERT INTO `tipoequipo` (`id`, `name`) VALUES
(1, 'tt1'),
(2, 'tt2');

-- --------------------------------------------------------

--
-- Table structure for table `usuariocomparar`
--

CREATE TABLE `usuariocomparar` (
  `UsuarioId` int(11) NOT NULL,
  `VentiladorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuariocomparar`
--

INSERT INTO `usuariocomparar` (`UsuarioId`, `VentiladorID`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `usuariofavorito`
--

CREATE TABLE `usuariofavorito` (
  `UsuarioId` int(11) NOT NULL,
  `VentiladorID` int(11) NOT NULL,
  `Favorito` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuariofavorito`
--

INSERT INTO `usuariofavorito` (`UsuarioId`, `VentiladorID`, `Favorito`) VALUES
(1, 0, 1);

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`, `role`) VALUES
(1, 'admin', '123', 'A');

-- --------------------------------------------------------

--
-- Table structure for table `ventiladores`
--

CREATE TABLE `ventiladores` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `capacidad` int(15) NOT NULL,
  `TipoEquipo` varchar(255) NOT NULL,
  `EspacioMaximo` int(10) NOT NULL,
  `marca` varchar(255) NOT NULL,
  `modelo` varchar(255) NOT NULL,
  `ControlRemoto` bit(1) NOT NULL,
  `Instalacion` bit(1) NOT NULL,
  `precio` int(20) NOT NULL,
  `ancho` int(10) NOT NULL,
  `alto` int(10) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `refrigerante` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ventiladores`
--

INSERT INTO `ventiladores` (`id`, `codigo`, `categoria`, `capacidad`, `TipoEquipo`, `EspacioMaximo`, `marca`, `modelo`, `ControlRemoto`, `Instalacion`, `precio`, `ancho`, `alto`, `descripcion`, `refrigerante`) VALUES
(0, 'fdhd', 'c1', 5000, 'c1', 5, 'fdhd', 'hdh', b'1', b'0', 5, 5, 5, 'thert', 't1'),
(15, 'qwfwq', 'c1', 10000, 'tt2', 33, 'qwfdqw', 'qwfqw', b'1', b'0', 3, 3, 3, 'fwf', 't1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `capacidad`
--
ALTER TABLE `capacidad`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `categoriaequipo`
--
ALTER TABLE `categoriaequipo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `refrigerantes`
--
ALTER TABLE `refrigerantes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tipoequipo`
--
ALTER TABLE `tipoequipo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ventiladores`
--
ALTER TABLE `ventiladores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `capacidad`
--
ALTER TABLE `capacidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `categoriaequipo`
--
ALTER TABLE `categoriaequipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `refrigerantes`
--
ALTER TABLE `refrigerantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tipoequipo`
--
ALTER TABLE `tipoequipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `ventiladores`
--
ALTER TABLE `ventiladores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
