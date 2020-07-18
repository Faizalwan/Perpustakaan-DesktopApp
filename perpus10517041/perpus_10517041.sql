-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2020 pada 01.00
-- Versi server: 10.1.39-MariaDB
-- Versi PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus_10517041`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `NoAnggota` varchar(10) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Alamat` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`NoAnggota`, `Nama`, `Alamat`) VALUES
('A001', 'Faizal Alwan', 'Jl.Tubagus Ismail Dalam'),
('A002', 'Abdul Halim', 'Jl. Jakarta'),
('A003', 'Abdul Halim Majalengka', 'Jl. Dago/JI.Ir. Haji Juanda'),
('A004', 'Abdul Haris Nasution', 'Jl. Dahlia'),
('A005', 'Abdul Kadir', 'Jl. Dalem Kaum'),
('A006', 'Abdul Malik Karim Amrullah', 'Jl. Pabrik Daging'),
('A007', 'Abdul Muis', 'Jl. Sukajadi'),
('A008', 'Abdul Rahman Saleh', 'Jl. Cimandiri'),
('A009', 'Abdul Wahab Hasbullah', 'Gg. Dasarata'),
('A010', 'Andi Abdullah Bau Massepe', 'Jl. Dederuk'),
('A011', 'Achmad Subarjo', 'Jl. Karangsari'),
('A012', 'Adam Malik', 'Jl. Hegarmanah'),
('A013', 'Adnan Kapau Gani', 'Jl. Van Deventer'),
('A014', 'Nyi Ageng Serang', 'Gg. Raden Dewi'),
('A015', 'Agus Salim', 'Jl. Kembang Sepatu'),
('A016', 'Agustinus Adisucipto', 'Jl. Jambal'),
('A017', 'Ahmad Dahlan', 'Jl. Japati'),
('A018', 'Ahmad Rifa?i', 'Gg. Jeruk'),
('A019', 'Ahmad Yani', 'Gg. Johar'),
('A020', 'Alimin', 'Jl. Dukuh'),
('A021', 'Amir Hamzah', 'Jl. Dursasana'),
('A022', 'Antasari', 'Gg. Dorna'),
('A023', 'Arie Frederik Lasut', 'Jl. Ehrlich'),
('A024', 'As?ad Syamsul Arifin', 'Jl. Wastukancana'),
('A025', 'Bagindo Azizchan', 'Jl. Cikutra'),
('A026', 'Basuki Rahmat', 'Jl. Prof. Eyckman'),
('A027', 'Bernard Wilhelm Lapian', 'Gg. Industri'),
('A028', 'Teungku Chik di Tiro', 'Jl. Haji Wasyid'),
('A029', 'Cilik Riwut', 'Jl. Pajajaran'),
('A030', 'Cipto Mangunkusumo', 'Jl. Sirnasari'),
('A031', 'Cokroaminoto', 'Jl. Flores'),
('A032', 'Ernest Douwes Dekker', 'Jl. Garuda'),
('A033', 'Dewi Sartika', 'Jl. Sultan Tirtayasa'),
('A034', 'Cut Nyak Dhien', 'Jl. Gabus'),
('A035', 'Diponegoro', 'Jl. Lamping'),
('A036', 'Donald Izacus Panjaitan', 'Jl. Galunggung'),
('A037', 'Eddy Martadinata', 'Jl. Sirnamanah'),
('A038', 'Fakhruddin', 'Jl. Gardujati'),
('A039', 'Fatmawati', 'Jl. Bahureksa'),
('A040', 'Ferdinand Lumbantobing', 'Jl. Taman Sari'),
('A041', 'Frans Kaisiepo', 'Jl. Gunung Agung'),
('A042', 'Gatot Mangkupraja', 'Jl. Gunung Kareumbi'),
('A043', 'Gatot Subroto', 'Jl. Gunung Putri'),
('A044', 'Halim Perdanakusuma', 'Jl. Guntur'),
('A045', 'Hamengkubuwono I', 'Jl. Lebak'),
('A046', 'Hamengkubuwono IX', 'Jl. Karanglayung'),
('A047', 'Harun Bin Said', 'Jl.Gajahiumantung'),
('A048', 'Hasan Basri', 'Jl. Siliwangi'),
('A049', 'Hasanuddin', 'Jl. Dokter Sukimin'),
('A050', 'Hasyim Asy?ari', 'Jl. Linggawastu'),
('A051', 'Fauzan Maulana', 'Jl. Titiran V'),
('A052', 'Ahmad Paudji', 'Jl. Cikarang Barat'),
('A053', 'Nayla Quinita', 'Jl. Jakarta V'),
('A054', 'Rizca Shafira', 'Jl. Ir Hj.Juanda'),
('A055', 'Ismawati Martina', 'Jl. Sepinggan Asri'),
('A056', 'Heni Rachmawati', 'Jl. Jakarta Barat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `kode_buku` varchar(10) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `penulis` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kode_buku`, `judul`, `penulis`, `penerbit`, `tahun_terbit`, `status`) VALUES
('B001', 'Bikin mading lebih keren', 'Pramana Sukmajati', 'Info komputer', '1990', 'Dipinjam'),
('B002', 'Ice breaker', 'Adi Soenarno', 'Penerbit Andi', '1991', 'Dipinjam'),
('B003', 'Be new you', 'Izzatul jannah', 'Eureka', '1992', 'Dipinjam'),
('B004', '100 Hal yang harus ditanyakan sebelum menikah', 'Susan Piver', 'Gramedia', '1993', 'Teredia'),
('B005', 'Bikin belajar selezat coklat', 'Fatan fantastic', 'Pro-U', '1994', 'Dipinjam'),
('B006', 'Membaca kepribadian orang', 'Gregory Young', 'Think', '1995', 'Dipinjam'),
('B007', 'Seni berbicara', 'Larry king', 'Gramedia', '1996', 'Dipinjam'),
('B008', 'Daftar situs beasiswa', 'Samuel', 'Penerbit Andi', '1997', 'Tersedia'),
('B009', 'Strategi Pengembangan diri', 'Jen A.Hans', 'Personal Development Training', '1998', 'Tersedia'),
('B010', 'Teknik Persuasi yang Efektif', 'Robert', 'Interaksara', '1999', 'Dipinjam'),
('B011', 'Kepemimpinan dan seni berbicara', 'Kim H.Krisco', 'Profesional books', '2000', 'Tersedia'),
('B012', 'Being happy', 'Andrew matthews', 'Gramedia', '2001', 'Tersedia'),
('B013', '7 Habits of Highly effective teens', 'Sean Covey', 'Binarupa aksara', '2002', 'Tersedia'),
('B014', 'Don?t sweat the small stuff for teens', 'Richard Carlson', 'Gramedia', '2003', 'Dipinjam'),
('B015', 'Kumpulan Senam dan artikel kesehatan', 'Muslimah', 'Muslimah', '2004', 'Dipinjam'),
('B016', 'Trobbing tonight 7', 'Koi keno', 'Elexmedia', '2005', 'Dipinjam'),
('B017', 'Crayon sinchan 46', 'Yoshito usui', 'Gramedia', '2006', 'Tersedia'),
('B018', 'Crayon sinchan 25', 'Yoshito usui', 'Gramedia', '2007', 'Dipinjam'),
('B019', 'Membaca emosi orang', 'Paul Ekman', 'Think Jogja', '2008', 'Tersedia'),
('B020', 'usaha aneka katering', 'wulan ayodya', 'Kompas', '2008', 'Dipinjam'),
('B021', 'Tips menulis dalam bahasa inggris', 'Rudolf flesch', 'Dolpin book', '2008', 'Dipinjam'),
('B022', 'agar siapa saja mau berubah', 'david j.lieberman', 'serambi', '2009', 'Dipinjam'),
('B023', 'jurus jitu membuka usaha restoran', 'eka dharma pranoto', 'penerbit andi', '2010', 'Teredia'),
('B024', 'spss 13.0 terapan riset parametrik', 'triton', 'penerbit andi', '2011', 'Dipinjam'),
('B025', 'Quantum learning', 'bobbi de porter', 'Kaifa for teens', '2012', 'Dipinjam'),
('B026', 'variasi kue semprit', 'saji', 'pt. media boga utama', '2013', 'Dipinjam'),
('B027', 'romantic intelegence', 'enigma', 'enigma', '2014', 'Tersedia'),
('B028', 'roti favorit', 'budi sutomo', 'puspa terampil', '2014', 'Dipinjam'),
('B029', 'edisi khusus spss', 'poltak mario', 'ardana media', '2014', 'Tersedia'),
('B030', 'Pengantar psikologi klinis', 'Suprapti Slamet', 'UIP', '2015', 'Dipinjam'),
('B031', 'Kiat jitu mencari kerja', 'Nurheti yuliarti', 'Media pressindo', '2015', 'Dipinjam'),
('B032', 'jurus untuk jadi cewek kredibel', 'femi olivia', 'prime publisher', '2015', 'Dipinjam'),
('B033', 'Masakan Indonesia', 'Yasa Boga', 'Gramedia', '2015', 'Teredia'),
('B034', '1001 Resep masakan lengkap', 'Lusiana wijaya', 'Appolo-surabaya', '2015', 'Dipinjam'),
('B035', 'Dasar dan arah public relation', 'John tondowijodjo', 'Grasindo', '2015', 'Tersedia'),
('B036', 'kamus bahasa jawa', 'mangunsuwito', 'yrama widya', '2016', 'Dipinjam'),
('B037', 'Kreasi bolu gulung', 'Sedap', 'Nova', '2016', 'Tersedia'),
('B038', 'menggunakan SPSS untuk statistik parametrik', 'Singgih santoso', 'Elexmedia', '2016', 'Dipinjam'),
('B039', 'Tips menulis dalam bahasa inggris', 'Rudolf flesch', 'Dolpin book', '2016', 'Tersedia'),
('B040', '36 jam belajar komputer SPSS 15', 'Mikael sugianto', 'Elexmedia', '2016', 'Dipinjam'),
('B041', '100 permainan kreatif', 'vincentius endy', 'andi offset', '2016', 'Tersedia'),
('B042', 'the art of dealing with people', 'les giblin', 'gramedia', '2017', 'Dipinjam'),
('B043', 'skill with people', 'les giblin', 'Gramedia', '2017', 'Dipinjam'),
('B044', 'negeri 5 menara', 'a.fuadi', 'Gramedia', '2018', 'Dipinjam'),
('B045', 'Statistika', 'Agus irianto', 'kecana', '2018', 'Tersedia'),
('B046', 'kumpulan resep', 'Sedap', 'Gramedia', '2018', 'Dipinjam'),
('B047', 'Super mentoring senior', 'novi dan ilna', 'Syaamil', '2018', 'Tersedia'),
('B048', 'rich dad poor dad, success stories', 'robert kiyosaki', 'Gramedia', '2018', 'Dipinjam'),
('B049', 'tata bahasa inggris', 'erhans', 'indah-surabaya', '2019', 'Tersedia'),
('B050', 'young top', 'billy boen', 'gagas media', '2019', 'Dipinjam'),
('B051', 'menyelami nama Allah yang indah', 'mahmud samiy', 'Pustaka hidayah', '2019', 'Tersedia'),
('B052', 'Naruto', 'Masashi Kishimoto', 'Japan Nagasaki', '2011', 'Tersedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailkembali`
--

CREATE TABLE `detailkembali` (
  `NoKembali` varchar(6) NOT NULL,
  `kode_buku` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL,
  `lama_pinjam` int(10) NOT NULL,
  `denda` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detailkembali`
--

INSERT INTO `detailkembali` (`NoKembali`, `kode_buku`, `status`, `lama_pinjam`, `denda`) VALUES
('KB001', 'B033', '1', 6, 5000),
('KB002', 'B004', '1', 6, 5000),
('KB003', 'B023', '1', 11, 30000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailpinjam`
--

CREATE TABLE `detailpinjam` (
  `NoPinjam` varchar(5) NOT NULL,
  `kode_buku` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detailpinjam`
--

INSERT INTO `detailpinjam` (`NoPinjam`, `kode_buku`, `status`) VALUES
('PJ001', 'B004', '0'),
('PJ002', 'B043', '0'),
('PJ003', 'B033', '0'),
('PJ004', 'B015', '0'),
('PJ005', 'B023', '0'),
('PJ006', 'B025', '0');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kembali`
--

CREATE TABLE `kembali` (
  `NoKembali` varchar(6) NOT NULL,
  `TglKembali` date NOT NULL,
  `NoAnggota` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kembali`
--

INSERT INTO `kembali` (`NoKembali`, `TglKembali`, `NoAnggota`) VALUES
('KB001', '2019-12-31', 'A012'),
('KB002', '2019-12-31', 'A001'),
('KB003', '2020-01-20', 'A005');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam`
--

CREATE TABLE `pinjam` (
  `NoPinjam` varchar(6) NOT NULL,
  `TglPinjam` date NOT NULL,
  `NoAnggota` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pinjam`
--

INSERT INTO `pinjam` (`NoPinjam`, `TglPinjam`, `NoAnggota`) VALUES
('PJ001', '2019-12-25', 'A001'),
('PJ002', '2019-12-25', 'A015'),
('PJ003', '2019-12-25', 'A012'),
('PJ004', '2019-12-26', 'A014'),
('PJ005', '2020-01-09', 'A005'),
('PJ006', '2020-01-30', 'A007');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Bagian` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`Username`, `Password`, `Nama`, `Bagian`) VALUES
('001', '001', 'Risya', 'Admin'),
('002', '002', 'Khansa', 'Sirkulasi'),
('003', '003', 'Faisal', 'Admin'),
('004', '004', 'Fauzan', 'Sirkulasi');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`NoAnggota`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indeks untuk tabel `detailkembali`
--
ALTER TABLE `detailkembali`
  ADD KEY `fk_NoKembali` (`NoKembali`),
  ADD KEY `fk_kodeBook` (`kode_buku`);

--
-- Indeks untuk tabel `detailpinjam`
--
ALTER TABLE `detailpinjam`
  ADD KEY `fk_NoPinjam` (`NoPinjam`),
  ADD KEY `fk_kodebuku` (`kode_buku`);

--
-- Indeks untuk tabel `kembali`
--
ALTER TABLE `kembali`
  ADD PRIMARY KEY (`NoKembali`),
  ADD KEY `fk_NmrAnggota` (`NoAnggota`);

--
-- Indeks untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD PRIMARY KEY (`NoPinjam`),
  ADD KEY `fk_NoAnggota` (`NoAnggota`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Username`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detailkembali`
--
ALTER TABLE `detailkembali`
  ADD CONSTRAINT `fk_NoKembali` FOREIGN KEY (`NoKembali`) REFERENCES `kembali` (`NoKembali`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_kodeBook` FOREIGN KEY (`kode_buku`) REFERENCES `buku` (`kode_buku`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `detailpinjam`
--
ALTER TABLE `detailpinjam`
  ADD CONSTRAINT `fk_NoPinjam` FOREIGN KEY (`NoPinjam`) REFERENCES `pinjam` (`NoPinjam`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_kodebuku` FOREIGN KEY (`kode_buku`) REFERENCES `buku` (`kode_buku`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `kembali`
--
ALTER TABLE `kembali`
  ADD CONSTRAINT `fk_NmrAnggota` FOREIGN KEY (`NoAnggota`) REFERENCES `pinjam` (`NoAnggota`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `pinjam`
--
ALTER TABLE `pinjam`
  ADD CONSTRAINT `fk_NoAnggota` FOREIGN KEY (`NoAnggota`) REFERENCES `anggota` (`NoAnggota`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
