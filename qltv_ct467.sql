use qltv_ct467;

-- table sách
-- drop table muonsach;
-- drop table docgia;
-- drop table sach;
-- drop table tacgia;
-- drop table nhaxuatban
-- select * from docgia


-- table độc giả

create table docgia (
	maDG varchar(15) NOT NULL primary key,
    tenDG varchar(50) NOT NULL,
    ngaysinh date NOT NULL,
    noisinh varchar(50) not null,
    diachi varchar (50) NOT NULL,
    sdt int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


insert into docgia values ('MDG5', 'Pham Minh Anh', '2001-12-12', 'Ha Noi', 'Can Tho', 0128488484);
insert into docgia values ('MDG3', 'Tran Van A', '2002-06-06', 'Da Nang', 'Can Tho', 0987654321);
insert into docgia values ('MDG1', 'Tran Van B', '2003-11-11', 'Ha Noi', 'Can Tho', 0398274223);
insert into docgia values ('MDG2', 'Nguyen Van Son', '2004-10-12', 'Can Tho', 'Can Tho', 0255252536);
insert into docgia values ('MDG4', 'Tran Van Nhut', '2005-11-11', 'Tien Giang', 'Can Tho', 0123456789);


-- table tác giả

create table tacgia (
	maTG varchar(15) NOT NULL PRIMARY KEY,
    tenTG varchar(50) NOT NULL,
    diachi varchar(50) NOT NULL,
    email varchar(50),
    ghichu text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

insert into tacgia values ('MTG4', 'To Hoai', 'Ha Noi', 'tohoai@gmail.com', 'null');
insert into tacgia values ('MTG2', 'Xuan Dieu', 'Tra Vinh', 'xuandieu@gmail.com', 'null');
insert into tacgia values ('MTG3', 'Han Mac Tu', 'Hue', 'hanmactu@gmail.com', 'null');
insert into tacgia values ('MTG1', 'Kim Lan', 'Bac Giang', 'kimlan@gmail.com', 'null');


-- NHÀ XUẤT BẢN
-- drop table nhaxuatban

create table nhaxuatban (
	maNXB char(10) not null primary key,
    tenNXB varchar(50) not null,
    diachi char(50) not null,
    email varchar(50) not null,
    dienthoai int(12) not null    
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
   
insert into nhaxuatban values ('MNXB1', 'Van Hoc', 'Binh Dinh', 'vanhoc@gmail.com', '0987646788');
insert into nhaxuatban values ('MNXB2', 'Kim Dong', 'TP HCM', 'kimdong@gmail.com', '0999999999');
insert into nhaxuatban values ('MNXB3', 'Tuoi Tre', 'Kien Giang', 'tuoitre@gmail.com', '0964567891');
insert into nhaxuatban values ('MNXB4', 'Bach Khoa', 'Vinh Long', 'bachkhoa@gmail.com', '0925647212');

create table sach(
  masach varchar(15)  NOT NULL PRIMARY KEY,
  tensach varchar(50) not null,
  vitri varchar(15) NOT NULL,
  tinhtrang varchar(20) NOT NULL,
  maTG varchar(15) NOT NULL,
  maNXB varchar(15) NOT NULL,
  sotrang int(255) NOT NULL,
  namXB int(10) NOT NULL,
  solantaiban int(20) not null,
  FOREIGN KEY(maTG) REFERENCES tacgia(maTG) ON DELETE CASCADE,
  foreign key (maNXB) references nhaxuatban(maNXB) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

insert into sach values ('MS2', 'Lap Trinh Web', 'MVT2', 'Con', 'MTG4', 'MNXB1', '44', 2015, '5');
insert into sach values ('MS1', 'Lap Trinh Can ban C', 'MVT1', 'Con', 'MTG2', 'MNXB1', 90, '20000', '2');
insert into sach values ('MS3', 'Co So Du Lieu', 'MLS3', 'Con', 'MTG3', 'MNXB3', '96', '2008', '3');
insert into sach values ('MS4', 'Giao Dien Nguoi May', 'MVT4', 'Het', 'MTG2', 'MNXB4', '50', '2001', '2');
insert into sach values ('MS5', 'Voi Vang', 'MVT5', 'Het', 'MTG2', 'MNXB4', '50', '2001', '5');



-- table mượn sách

create table muonsach (
	maPM varchar(15) NOT NULL PRIMARY KEY,
	maDG varchar(15) NOT NULL,
    masach varchar(15) NOT NULL,
    ngaymuon date NOT NULL,
    ngaytra date NOT NULL,
    FOREIGN KEY(maDG) REFERENCES docgia(maDG) ON DELETE CASCADE,
    FOREIGN KEY(masach) REFERENCES sach(masach) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


insert into muonsach values ('MP2', 'MDG1', 'MS1',  '2022-4-01', '2022-6-01'); 
insert into muonsach values ('MP3', 'MDG2', 'MS2', '2022-3-12', '2022-6-12');
insert into muonsach values ('MP5', 'MDG3', 'MS3', '2022-4-7', '2022-5-7');
insert into muonsach values ('MP1', 'MDG5', 'MS4', '2022-1-12', '2022-3-12');
insert into muonsach values ('MP4', 'MDG4', 'MS1', '2019-12-12', '2020-12-12');

    
    
    
    
    
