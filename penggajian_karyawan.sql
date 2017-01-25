/*
SQLyog Enterprise - MySQL GUI v7.14 
MySQL - 5.5.5-10.1.10-MariaDB : Database - penggajian_karyawan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`penggajian_karyawan` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `penggajian_karyawan`;

/*Table structure for table `tbl_jabatan` */

DROP TABLE IF EXISTS `tbl_jabatan`;

CREATE TABLE `tbl_jabatan` (
  `kode_jabatan` varchar(5) NOT NULL DEFAULT '',
  `jabatan` varchar(30) DEFAULT NULL,
  `gaji` int(20) DEFAULT NULL,
  PRIMARY KEY (`kode_jabatan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `tbl_jabatan` */

insert  into `tbl_jabatan`(`kode_jabatan`,`jabatan`,`gaji`) values ('Mku','Manajer Keuangan',7000000),('MOp','Manajer Operasional',7000000),('MPm','Manajer Pemasaran',7000000),('SAk','Staff Akuntansi',2500000),('SPi','Staff Periklanan',2500000),('SPj','Staff Perpajakan',2600000),('SPjl','Staff Penjualan',2500000),('SPsd','Staff Persediaan',2800000),('SPw','Staff Pengawasan',2800000),('SSk','Sekertaris',2700000),('SSPr','Staff Sistem Produksi',2700000);

/*Table structure for table `tbl_karyawan` */

DROP TABLE IF EXISTS `tbl_karyawan`;

CREATE TABLE `tbl_karyawan` (
  `nik` int(5) NOT NULL AUTO_INCREMENT,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(10) DEFAULT NULL,
  `agama` varchar(10) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `telpon` varchar(15) DEFAULT NULL,
  `alamat` varchar(70) DEFAULT NULL,
  `kode_jabatan` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB AUTO_INCREMENT=346 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `tbl_karyawan` */

insert  into `tbl_karyawan`(`nik`,`nama`,`jenis_kelamin`,`agama`,`tanggal_lahir`,`telpon`,`alamat`,`kode_jabatan`) values (144,'Mayang Ratri','Perempuan','Islam','1997-11-29','087812345678','JL Z. A Pagar Alam No. 12','Mku'),(245,'Rizki Oktavian','Laki-laki','Islam','1996-12-06','082234569812','JL Yos Sudarso No 20','MOp'),(344,'Astrini Adeswar','Perempuan','Islam','1996-12-01','082288456533','JL Mawar No 45','MPm'),(345,'Vina Putri Agustiyani','Perempuan','Islam','1997-08-19','082198543412','JL Melati No 12','SAk');

/*Table structure for table `tbl_penggajian` */

DROP TABLE IF EXISTS `tbl_penggajian`;

CREATE TABLE `tbl_penggajian` (
  `no_penggajian` varchar(5) NOT NULL,
  `tgl_penggajian` date DEFAULT NULL,
  `nik` int(5) DEFAULT NULL,
  `kode_jabatan` varchar(5) DEFAULT NULL,
  `katerangan` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`no_penggajian`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `tbl_penggajian` */

insert  into `tbl_penggajian`(`no_penggajian`,`tgl_penggajian`,`nik`,`kode_jabatan`,`katerangan`) values ('02','2016-09-09',245,'MOp','-'),('08','2016-09-09',344,'MPm','-'),('09','2016-10-10',144,'MKu','-'),('11','2016-01-02',345,'SAk','-');

/*Table structure for table `tbl_pengguna` */

DROP TABLE IF EXISTS `tbl_pengguna`;

CREATE TABLE `tbl_pengguna` (
  `id` varchar(5) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `level` varchar(30) DEFAULT NULL,
  `password` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `tbl_pengguna` */

insert  into `tbl_pengguna`(`id`,`nama`,`level`,`password`) values ('123','rizki','admin','123');

/*Table structure for table `view_penggajian` */

DROP TABLE IF EXISTS `view_penggajian`;

/*!50001 DROP VIEW IF EXISTS `view_penggajian` */;
/*!50001 DROP TABLE IF EXISTS `view_penggajian` */;

/*!50001 CREATE TABLE `view_penggajian` (
  `no_penggajian` varchar(5) CHARACTER SET utf8 NOT NULL,
  `tgl_penggajian` date DEFAULT NULL,
  `nik` int(5) DEFAULT NULL,
  `nama` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `kode_jabatan` varchar(5) CHARACTER SET utf8 DEFAULT NULL,
  `jabatan` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `gaji` int(20) DEFAULT NULL,
  `katerangan` varchar(100) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 */;

/*View structure for view view_penggajian */

/*!50001 DROP TABLE IF EXISTS `view_penggajian` */;
/*!50001 DROP VIEW IF EXISTS `view_penggajian` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_penggajian` AS (select `tbl_penggajian`.`no_penggajian` AS `no_penggajian`,`tbl_penggajian`.`tgl_penggajian` AS `tgl_penggajian`,`tbl_penggajian`.`nik` AS `nik`,`tbl_karyawan`.`nama` AS `nama`,`tbl_penggajian`.`kode_jabatan` AS `kode_jabatan`,`tbl_jabatan`.`jabatan` AS `jabatan`,`tbl_jabatan`.`gaji` AS `gaji`,`tbl_penggajian`.`katerangan` AS `katerangan` from ((`tbl_jabatan` join `tbl_penggajian` on((`tbl_jabatan`.`kode_jabatan` = `tbl_penggajian`.`kode_jabatan`))) join `tbl_karyawan` on((`tbl_karyawan`.`nik` = `tbl_penggajian`.`nik`)))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
