-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 10 Jul 2020 pada 20.12
-- Versi Server: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbcd`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbcd`
--

CREATE TABLE `tbcd` (
  `kode_film` varchar(10) NOT NULL,
  `judul_film` char(50) NOT NULL,
  `tgl_rilis` date NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbcd`
--

INSERT INTO `tbcd` (`kode_film`, `judul_film`, `tgl_rilis`, `harga`) VALUES
('19931013TH', 'The Nightmare Before Christmas', '1993-10-13', 20000),
('19980926TH', 'The Parent Trap', '1998-09-26', 20000),
('20050912CO', 'Corpse Bride', '2005-09-12', 15000),
('20110311MA', 'Mars Needs Moms', '2011-03-11', 10000),
('20131009BL', 'Blue is the Warmest Colour', '2013-10-09', 10000),
('20150122TH', 'The Summer of Sangaile', '2005-01-22', 10000),
('20150915CO', 'Collective Invention', '2015-09-15', 10000),
('20160217ZO', 'Zootopia', '2016-02-17', 10000),
('20180322LO', 'Love, Simon', '2018-03-22', 10000),
('20180719UN', 'Unfriended: Dark Web', '2018-07-19', 10000),
('20190501IN', 'Inseparable Bros', '2019-05-01', 10000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbkembali`
--

CREATE TABLE `tbkembali` (
  `id_transaksi` varchar(10) NOT NULL,
  `id_member` varchar(10) NOT NULL,
  `nama_member` char(50) NOT NULL,
  `kode_film` varchar(10) NOT NULL,
  `judul_film` char(50) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_pengem` date NOT NULL,
  `harga` int(11) NOT NULL,
  `tgl_dikem` date NOT NULL,
  `denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbkembali`
--

INSERT INTO `tbkembali` (`id_transaksi`, `id_member`, `nama_member`, `kode_film`, `judul_film`, `tgl_pinjam`, `tgl_pengem`, `harga`, `tgl_dikem`, `denda`) VALUES
('T0004', 'MB0007', 'Debby Ryan', '20180719UN', 'Unfriended: Dark Web', '2020-07-03', '2020-07-05', 10000, '2020-07-07', 2000),
('T0002', 'MB0008', 'Song Jihyo', '20190501IN', 'Inseparable Bros', '2020-07-02', '2020-07-04', 10000, '2020-07-04', 0),
('T0006', 'MB0011', 'Amara Pitaloka', '20110311MA', 'Mars Needs Moms', '2020-07-07', '2020-07-09', 10000, '2020-07-11', 2000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbmember`
--

CREATE TABLE `tbmember` (
  `id_member` varchar(10) NOT NULL,
  `nama_member` char(50) NOT NULL,
  `alamat_member` varchar(100) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbmember`
--

INSERT INTO `tbmember` (`id_member`, `nama_member`, `alamat_member`, `no_telp`) VALUES
('MB0001', 'Garrett Nash', 'Semanggi', '089675835182'),
('MB0002', 'Robin Skinner', 'Klaten', '086728154927'),
('MB0003', 'Joshua Dun', 'Serengan', '089647152936'),
('MB0004', 'Tyler Joseph', 'Serengan', '085162835278'),
('MB0005', 'Dominic Harrison', 'Sukoharjo', '087456832567'),
('MB0006', 'Jenna Joseph', 'Serengan', '086182749382'),
('MB0007', 'Debby Ryan', 'Serengan', '088162937583'),
('MB0008', 'Song Jihyo', 'Klaten', '082738192718'),
('MB0009', 'Lee Kwangsoo', 'Jebres', '085391627191'),
('MB0010', 'Ha Donghoon', 'Sukoharjo', '081273917284'),
('MB0011', 'Amara Pitaloka', 'Semanggi', '087192638266');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbpetugas`
--

CREATE TABLE `tbpetugas` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbpetugas`
--

INSERT INTO `tbpetugas` (`username`, `password`) VALUES
('Amara', 'Amara');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbpinjam`
--

CREATE TABLE `tbpinjam` (
  `id_transaksi` varchar(10) NOT NULL,
  `id_member` varchar(10) NOT NULL,
  `nama_member` char(50) NOT NULL,
  `kode_film` varchar(10) NOT NULL,
  `judul_film` char(50) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `tgl_pengem` date NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbpinjam`
--

INSERT INTO `tbpinjam` (`id_transaksi`, `id_member`, `nama_member`, `kode_film`, `judul_film`, `tgl_pinjam`, `tgl_pengem`, `harga`) VALUES
('T0001', 'MB0002', 'Robin Skinner', '20180322LO', 'Love, Simon', '2020-07-02', '2020-07-04', 10000),
('T0003', 'MB0006', 'Jenna Joseph', '20160217ZO', 'Zootopia', '2020-07-03', '2020-07-05', 10000),
('T0005', 'MB0005', 'Dominic Harrison', '20131009BL', 'Blue is the Warmest Colour', '2020-07-04', '2020-07-06', 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbcd`
--
ALTER TABLE `tbcd`
  ADD PRIMARY KEY (`kode_film`);

--
-- Indexes for table `tbmember`
--
ALTER TABLE `tbmember`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `tbpetugas`
--
ALTER TABLE `tbpetugas`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbpinjam`
--
ALTER TABLE `tbpinjam`
  ADD KEY `id_member` (`id_member`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
