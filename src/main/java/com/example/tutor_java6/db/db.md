CREATE DATABASE TUTOR_SOF306;
GO
USE TUTOR_SOF306;
GO

CREATE TABLE bai_hat(
id int IDENTITY(1,1) PRIMARY KEY,
ten_bai_hat nvarchar(100),
ten_tac_gia nvarchar(50),
thoi_luong int,
ngay_san_xuat date,
gia float,
ngay_ra_mat date
);
GO

INSERT INTO bai_hat
VALUES
('Huong', 'Nguyen Ha Minh', 4, '2016-04-02', 70, '2016-04-02'),
('Tuy Am', 'Xesi', 5, '2013-04-02', 33, '2013-04-02'),
('Huong1', 'Nguyen Ha Minh1', 4, '2017-04-02', 50, '2017-04-02'),
('Huong2', 'Nguyen Ha Minh2', 4, '2017-04-02', 20, '2017-04-02');
GO