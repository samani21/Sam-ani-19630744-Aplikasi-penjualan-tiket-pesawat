-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2022 at 01:03 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_tiket`
--

CREATE TABLE `tb_tiket` (
  `id` int(11) NOT NULL,
  `kelas` varchar(200) NOT NULL,
  `maskapai` varchar(200) NOT NULL,
  `penerbangan` varchar(200) NOT NULL,
  `tujuan` varchar(200) NOT NULL,
  `tanggal` varchar(100) NOT NULL,
  `jam` varchar(100) NOT NULL,
  `biaya` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_tiket`
--

INSERT INTO `tb_tiket` (`id`, `kelas`, `maskapai`, `penerbangan`, `tujuan`, `tanggal`, `jam`, `biaya`) VALUES
(1, 'Kelas Satu', 'Garuda Indonesia', 'Garuda Indonesia(GA 325)', 'Jakarta', '2022-01-07', '16.45 PM', 'Rp.1080000'),
(4, 'Kelas Bisnis', 'Sriwijaya Air', 'Sriwijaya Air(SJ-589)', 'Bandung', '2022-01-07', '11.20 AM', 'Rp.940000'),
(5, 'Kelas Ekonomi', 'Lion Air', 'Lion Air(JT-225)', 'Jakarta', '2022-01-07', '20.35 PM', 'Rp.1060000'),
(6, 'Kelas Bisnis', 'Garuda Indonesia', 'Garuda Indonesia(GA 539)', 'Jakarta', '2022-01-08', '18.00 PM', 'Rp.1010000'),
(7, 'Kelas Ekonomi', 'Garuda Indonesia', 'Garuda Indonesia(GA 325)', 'Bali', '2022-01-07', '11.20 AM', 'Rp.750000'),
(8, 'Kelas Bisnis', 'Sriwijaya Air', 'Sriwijaya Air(SJ-778)', 'Sriwijaya', '2022-01-09', '19.20 PM', 'Rp.1140000'),
(9, 'Kelas Ekonomi', 'Lion Air', 'Lion Air(JT-225)', 'Bandung', '2022-01-09', '11.20 AM', 'Rp.850000'),
(10, 'Kelas Satu', 'Sriwijaya Air', 'Sriwijaya Air(SJ-778)', 'Bali', '2022-01-08', '19.20 PM', 'Rp.1140000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `no_tiket` int(11) NOT NULL,
  `id_pelanggan` varchar(200) NOT NULL,
  `nama_pelanggan` varchar(200) NOT NULL,
  `maskapai` varchar(200) NOT NULL,
  `penerbangan` varchar(200) NOT NULL,
  `tujuan1` varchar(100) NOT NULL,
  `tanggal` varchar(200) NOT NULL,
  `jam` varchar(100) NOT NULL,
  `kelas` varchar(200) NOT NULL,
  `biaya` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`no_tiket`, `id_pelanggan`, `nama_pelanggan`, `maskapai`, `penerbangan`, `tujuan1`, `tanggal`, `jam`, `kelas`, `biaya`) VALUES
(21022258, '291221', 'Amad', 'Garuda Indonesia', 'Garuda Indonesia(GA 325)', 'Jakarta', '2022-01-07', '16.45 PM', 'Kelas Satu', 'Rp.1080000'),
(21022260, '291221', 'Agus', 'Garuda Indonesia', 'Garuda Indonesia(GA 325)', 'Jakarta', '2022-01-07', '16.45 PM', 'Kelas Satu', 'Rp.1080000'),
(21022261, '291221', 'Sam', 'Lion Air', 'Lion Air(JT-225)', 'Bandung', '2022-01-09', '11.20 AM', 'Kelas Ekonomi', 'Rp.850000'),
(21022262, '291226', 'Agus', 'Sriwijaya Air', 'Sriwijaya Air(SJ-778)', 'Sriwijaya', '2022-01-09', '19.20 PM', 'Kelas Bisnis', 'Rp.1140000'),
(21022264, '291221', 'Agus', 'Garuda Indonesia', 'Garuda Indonesia(GA 539)', 'Jakarta', '2022-01-08', '18.00 PM', 'Kelas Bisnis', 'Rp.1010000'),
(21022267, '291221', 'Budiman', 'Lion Air', 'Lion Air(JT-225)', 'Jakarta', '2022-01-07', '20.35 PM', 'Kelas Ekonomi', 'Rp.1060000'),
(21022268, '291228', 'Sam\'ani', 'Sriwijaya Air', 'Sriwijaya Air(SJ-589)', 'Bandung', '2022-01-07', '11.20 AM', 'Kelas Bisnis', 'Rp.940000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `username` varchar(200) NOT NULL,
  `tanggal` varchar(200) NOT NULL,
  `tempat_lahir` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `agama` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id`, `nama`, `username`, `tanggal`, `tempat_lahir`, `alamat`, `agama`, `password`) VALUES
(291221, 'dsama', 'sam', '2021-12-10', 'banjarmasin', 'sak', 'Islam', 'sam'),
(291223, 'Ani', 'admin', '2021-12-31', '', 'asjs', 'Islam', 'ani'),
(291226, 'agus', 'agus', '2021-12-17', '', 'jl.kelayan', 'Islam', 'agus'),
(291227, 'admin', 'admin', '2021-12-25', 'Banjarmasin', 'Kelayan', 'Islam', 'admin'),
(291228, 'Sam\'ani', 'samani123', '1999-06-21', 'Banjarmasim', 'jl.Gerilya', 'Islam', 'samani');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_tiket`
--
ALTER TABLE `tb_tiket`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`no_tiket`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_tiket`
--
ALTER TABLE `tb_tiket`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `no_tiket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21022269;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
