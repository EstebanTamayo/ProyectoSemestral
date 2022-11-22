-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2022 a las 00:37:59
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ventilador`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `capacidad`
--

CREATE TABLE `capacidad` (
  `id` int(11) NOT NULL,
  `capacidad` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `capacidad`
--

INSERT INTO `capacidad` (`id`, `capacidad`) VALUES
(1, 9000),
(2, 12000),
(3, 18000),
(4, 24000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoriaequipo`
--

CREATE TABLE `categoriaequipo` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoriaequipo`
--

INSERT INTO `categoriaequipo` (`id`, `descripcion`) VALUES
(1, 'Inverter'),
(2, 'Convencional');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `refrigerantes`
--

CREATE TABLE `refrigerantes` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `refrigerantes`
--

INSERT INTO `refrigerantes` (`id`, `name`) VALUES
(1, 'R-410A'),
(2, 'R-22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoequipo`
--

CREATE TABLE `tipoequipo` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipoequipo`
--

INSERT INTO `tipoequipo` (`id`, `name`) VALUES
(1, 'Split Muro'),
(2, 'Split Piso Cielo'),
(3, 'Split Cassette'),
(4, 'Split Ducto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuariocomparar`
--

CREATE TABLE `usuariocomparar` (
  `UsuarioId` int(11) NOT NULL,
  `VentiladorID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuariocomparar`
--

INSERT INTO `usuariocomparar` (`UsuarioId`, `VentiladorID`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuariofavorito`
--

CREATE TABLE `usuariofavorito` (
  `UsuarioId` int(11) NOT NULL,
  `VentiladorID` int(11) NOT NULL,
  `Favorito` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuariofavorito`
--

INSERT INTO `usuariofavorito` (`UsuarioId`, `VentiladorID`, `Favorito`) VALUES
(1, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `password`, `role`) VALUES
(1, 'admin', '123', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventiladores`
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
-- Volcado de datos para la tabla `ventiladores`
--

INSERT INTO `ventiladores` (`id`, `codigo`, `categoria`, `capacidad`, `TipoEquipo`, `EspacioMaximo`, `marca`, `modelo`, `ControlRemoto`, `Instalacion`, `precio`, `ancho`, `alto`, `descripcion`, `refrigerante`) VALUES
(16, 'K1', 'CONVENCIONAL', 9000, 'SPLIT MURO', 18, 'KHONE', 'CM-09HVAC', b'0', b'0', 386750, 2, 1, 'Equipo de Aire Acondicionado Frio y Calor convencional, sin instalacion incluida, con refrigerante ecologico', 'R-410A'),
(17, 'K2', 'CONVENCIONAL', 12000, 'SPLIT MURO', 28, 'KHONE', 'CM-12HVAC', b'0', b'0', 409063, 2, 1, 'Equipo de Aire Acondicionado Frio y Calor convencional, sin instalacion incluida, con refrigerante ecologico', 'R-410A'),
(18, 'K3', 'CONVENCIONAL', 18000, 'SPLIT MURO', 36, 'KHONE', 'CM-18HVAC', b'0', b'0', 610315, 2, 1, 'Equipo de Aire Acondicionado Frio y Calor convencional, sin instalacion incluida', 'R-22'),
(19, 'K4', 'INVERTER', 24000, 'SPLIT MURO', 45, 'KHONE', 'IM-24HVAC', b'1', b'1', 1082900, 2, 2, 'Equipo de aire acondicionado Frio y Calor inverter (ahorro energetico), equipo cuenta con refrigerante R-410A lo que lo hace ecologico, equipo cuenta con instalacion incluida y a su vez cuenta con un control remoto inteligente', 'R-410A'),
(20, 'K5', 'INVERTER', 9000, 'SPLIT PISO CIELO', 18, 'KHONE', 'IPS-09HVAC', b'1', b'1', 405650, 3, 1, 'Equipo de aire acondicionado tipo inverter, cuenta con control remoto inteligente y con instalacion, equipo Frio y Calor', 'R-410A'),
(21, 'K6', 'CONVENCIONAL', 18000, 'SPLIT PISO CIELO', 36, 'KHONE', 'CPS-12HVAC', b'0', b'1', 832500, 4, 1, 'Equipo de aire acondicionado Frio y Calor convencional, cuenta con instalacion', 'R-22'),
(22, 'K7', 'INVERTER', 18000, 'SPLIT CASSETTE', 36, 'KHONE', 'IC-18HVAC', b'1', b'1', 812650, 3, 2, 'Equipo de aire acondicionado Frio y Calor Inverter, cuenta con control remoto inteligente, tambien tiene refrigerante ecologico R-410A y cuenta con instalacion', 'R-410A'),
(23, 'K8', 'CONVENCIONAL', 24000, 'SPLIT CASSETTE', 45, 'KHONE', 'CC-24HVAC', b'0', b'0', 980000, 3, 2, 'Equipo de aire acondicionado Frio y Calor convencional', 'R-22'),
(24, 'K9', 'INVERTER', 12000, 'SPLIT DUCTO', 28, 'KHONE', 'ID-12HVAC', b'1', b'0', 590850, 4, 1, 'Equipo de aire acondicionado inverter y ecologico, cuenta con control remoto inteligente', 'R-410A'),
(25, 'K10', 'CONVENCIONAL', 18000, 'SPLIT DUCTO', 36, 'KHONE', 'CD-18HVAC', b'0', b'1', 765000, 3, 2, 'Equipo de aire acondicionado Frio y Calor convencional, viene con instalacion incluida', 'R-22');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `capacidad`
--
ALTER TABLE `capacidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `categoriaequipo`
--
ALTER TABLE `categoriaequipo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `refrigerantes`
--
ALTER TABLE `refrigerantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tipoequipo`
--
ALTER TABLE `tipoequipo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventiladores`
--
ALTER TABLE `ventiladores`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `capacidad`
--
ALTER TABLE `capacidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `categoriaequipo`
--
ALTER TABLE `categoriaequipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `refrigerantes`
--
ALTER TABLE `refrigerantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipoequipo`
--
ALTER TABLE `tipoequipo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `ventiladores`
--
ALTER TABLE `ventiladores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
