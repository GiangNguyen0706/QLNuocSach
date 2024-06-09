-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 09, 2023 lúc 01:54 PM
-- Phiên bản máy phục vụ: 10.4.28-MariaDB
-- Phiên bản PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlnuocsach`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donghonuoc`
--

CREATE TABLE `donghonuoc` (
  `madh` varchar(50) NOT NULL,
  `hangsx` varchar(50) NOT NULL,
  `chisodau` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `donghonuoc`
--

INSERT INTO `donghonuoc` (`madh`, `hangsx`, `chisodau`, `status`) VALUES
('dongho1', 'Vn', 105, 1),
('dongho2', 'Vn', 50, 1),
('dongho3', 'Vn', 30, 1),
('dongho4', 'Vn', 45, 1),
('dongho5', 'Vn', 0, 0),
('dongho6', 'Vn', 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `mahd` int(11) NOT NULL,
  `makh` int(50) NOT NULL,
  `hoten` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `diachi` varchar(50) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL,
  `sdt` varchar(50) NOT NULL,
  `cmnd` varchar(50) NOT NULL,
  `madh` varchar(50) NOT NULL,
  `chisodau` int(11) NOT NULL,
  `chisocuoi` int(11) NOT NULL,
  `dongia` double DEFAULT NULL,
  `thanhtien` double DEFAULT NULL,
  `tienbangchu` varchar(255) CHARACTER SET utf8 COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`mahd`, `makh`, `hoten`, `diachi`, `sdt`, `cmnd`, `madh`, `chisodau`, `chisocuoi`, `dongia`, `thanhtien`, `tienbangchu`) VALUES
(12, 1, 'Phan Tiến Dũng', 'Thanh Hóa', '0982364726', '098723624234', 'dongho1', 0, 45, 3000, 141750, 'Một Trăm Bốn Mươi Một Nghìn Bảy Trăm Năm Mươi'),
(13, 4, 'Khắc Lâm', 'Hà Nội', '08273467247', '0349548534534', 'dongho3', 0, 30, 3000, 94500, 'Chín Mươi Bốn Nghìn Năm Trăm'),
(14, 5, 'Nguyễn Hiệp', 'Hà Giang', '0823847324', '082347234234', 'dongho4', 0, 45, 4500, 212625, 'Hai Trăm Mười Hai Nghìn Sáu Trăm Hai Mươi Năm'),
(15, 6, 'Phan Tùng', 'Nam Định', '0123456789', '09823724223', 'dongho1', 45, 60, 3000, 47250, 'Bốn Mươi Bảy Nghìn Hai Trăm Năm Mươi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hopdong`
--

CREATE TABLE `hopdong` (
  `sohopdong` int(11) NOT NULL,
  `ngaylamhd` datetime NOT NULL,
  `noilamhd` varchar(50) NOT NULL,
  `madh` varchar(50) NOT NULL,
  `makh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hopdong`
--

INSERT INTO `hopdong` (`sohopdong`, `ngaylamhd`, `noilamhd`, `madh`, `makh`) VALUES
(26, '2023-12-06 00:00:00', 'Hà Nội', 'dongho1', 1),
(27, '2023-12-06 00:00:00', 'Hà Nội', 'dongho2', 2),
(28, '2023-12-06 00:00:00', 'Hà Nội ', 'dongho3', 3),
(29, '2023-12-07 02:35:48', 'hà nội', 'dongho3', 4),
(30, '2023-12-07 00:00:00', 'Hà Nội', 'dongho4', 5),
(31, '2023-12-07 00:00:00', 'Hà Nội', 'dongho1', 6);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `makh` int(11) NOT NULL,
  `hoten` varchar(50) NOT NULL,
  `cmnd` varchar(50) NOT NULL,
  `ngaysinh` date NOT NULL,
  `diachi` varchar(50) NOT NULL,
  `sdt` varchar(50) NOT NULL,
  `mucdich` varchar(50) NOT NULL,
  `thanhtoan` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`makh`, `hoten`, `cmnd`, `ngaysinh`, `diachi`, `sdt`, `mucdich`, `thanhtoan`) VALUES
(1, 'Phan Tiến Dũng', '098723624234', '2002-12-19', 'Thanh Hóa', '0982364726', 'sinh hoạt', 1),
(2, 'Lưu Hồng Lĩnh', '0234328472828', '2002-12-12', 'Vĩnh Phúc', '02387426437', 'sinh hoạt', 1),
(3, 'Nguyễn Thị Giang', '09239482644', '2002-12-18', 'Bắc Ninh', '023947322384', 'sinh hoạt', 0),
(4, 'Khắc Lâm', '0349548534534', '2002-12-16', 'Hà Nội', '08273467247', 'sinh hoat', 0),
(5, 'Nguyễn Hiệp', '082347234234', '2002-12-17', 'Hà Giang', '0823847324', 'sinh hoạt', 0),
(6, 'Phan Tùng', '09823724223', '2002-12-19', 'Nam Định', '0123456789', 'sinh hoạt', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `taikhoan` varchar(50) NOT NULL,
  `matkhau` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `sdt` varchar(50) NOT NULL,
  `quyen` int(11) NOT NULL,
  `makh` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `taikhoan`, `matkhau`, `email`, `sdt`, `quyen`, `makh`) VALUES
(4, 'dung', '123', 'phan56059@gmail.com', '0329864723', 1, 2),
(5, 'dung', '123', 'phan56059@gmail.com', '0983264672', 1, 1),
(6, 'giang', '123', 'giang@gmail.com', '0239846234', 1, 3),
(7, 'lam', '123', 'lam@gmail.com', '4398575435', 0, 4),
(8, 'hiep', '123', 'hiep@gmail.com', '023864562', 0, 5),
(9, 'tung', '123', 'tung@gmail.com', '0123456789', 0, 6);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `donghonuoc`
--
ALTER TABLE `donghonuoc`
  ADD PRIMARY KEY (`madh`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`mahd`),
  ADD KEY `makh` (`makh`),
  ADD KEY `madh` (`madh`);

--
-- Chỉ mục cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`sohopdong`),
  ADD KEY `fk_hopdong_foreign_key` (`madh`),
  ADD KEY `makh` (`makh`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`makh`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `makh` (`makh`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `mahd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  MODIFY `sohopdong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `makh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89;

--
-- AUTO_INCREMENT cho bảng `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `hopdong`
--
ALTER TABLE `hopdong`
  ADD CONSTRAINT `fk_hopdong_foreign_key` FOREIGN KEY (`madh`) REFERENCES `donghonuoc` (`madh`),
  ADD CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`makh`) REFERENCES `khachhang` (`makh`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
