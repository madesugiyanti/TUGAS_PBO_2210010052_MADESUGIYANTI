-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 08 Jul 2024 pada 08.40
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmutasi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datasiswa`
--

CREATE TABLE `datasiswa` (
  `nisn` int(11) NOT NULL,
  `nama_siswa` varchar(20) NOT NULL,
  `tempat_tanggal_lahir` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_permohonan_mutasi`
--

CREATE TABLE `data_permohonan_mutasi` (
  `no_srps_upt` int(11) NOT NULL,
  `nisn` int(11) NOT NULL,
  `kelas` varchar(20) NOT NULL,
  `nama_orangtua` varchar(20) NOT NULL,
  `npsn` int(11) NOT NULL,
  `nama_sekolahasal` varchar(20) NOT NULL,
  `kota` varchar(20) NOT NULL,
  `provinsi` varchar(20) NOT NULL,
  `sekolah_tujuan` varchar(20) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `no_telpon` int(11) NOT NULL,
  `skps_sekolahasal` varchar(20) NOT NULL,
  `srps_upt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_sd`
--

CREATE TABLE `data_sd` (
  `npsn` int(11) NOT NULL,
  `nama_sekolah` varchar(20) NOT NULL,
  `alamat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas_mutasi`
--

CREATE TABLE `petugas_mutasi` (
  `nip_petugas_mutasi` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `tempat_tanggal_lahir` varchar(20) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `telpon` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `datasiswa`
--
ALTER TABLE `datasiswa`
  ADD PRIMARY KEY (`nisn`);

--
-- Indeks untuk tabel `data_permohonan_mutasi`
--
ALTER TABLE `data_permohonan_mutasi`
  ADD PRIMARY KEY (`no_srps_upt`);

--
-- Indeks untuk tabel `data_sd`
--
ALTER TABLE `data_sd`
  ADD PRIMARY KEY (`npsn`);

--
-- Indeks untuk tabel `petugas_mutasi`
--
ALTER TABLE `petugas_mutasi`
  ADD PRIMARY KEY (`nip_petugas_mutasi`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `datasiswa`
--
ALTER TABLE `datasiswa`
  MODIFY `nisn` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `data_permohonan_mutasi`
--
ALTER TABLE `data_permohonan_mutasi`
  MODIFY `no_srps_upt` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `data_sd`
--
ALTER TABLE `data_sd`
  MODIFY `npsn` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT untuk tabel `petugas_mutasi`
--
ALTER TABLE `petugas_mutasi`
  MODIFY `nip_petugas_mutasi` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
