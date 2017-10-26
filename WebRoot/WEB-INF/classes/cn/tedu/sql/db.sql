create table user(
	id int(4) primary key auto_increment,
	name varchar(50),
	password varchar(50),
	telephone varchar(15),
	username varchar(50),
	isadmin varchar(5)
);
create table type(
	id int(4) primary key,
	name varchar(50)
);
create table district(
	id int(4) primary key,
	name varchar(50)
);
create table street(
	id int(4) primary key,
	name varchar(50),
	district_id int(4)
);
create table house(
	id int(6) auto_increment primary key,
	user_id int(4),
	type_id int(4),
	title varchar(50),
	description varchar(2000),
	price int(6),
	publdate date,
	floorage int(4),
	contact varchar(100),
	street_id int(4)
);
#增加外键
alter table street add constraint fk_str_di foreign key (district_id) references district(id);
alter table house add constraint fk_hou_ty foreign key (type_id) references type(id);
alter table house add constraint fk_hou_us foreign key (user_id) references user(id);
alter table house add constraint fk_hou_st foreign key (street_id) references street(id);

#测试数据
#1、插入区域district
insert into DISTRICT (ID, NAME)
values (1001, '东城');
insert into DISTRICT (ID, NAME)
values (1002, '西城');
insert into DISTRICT (ID, NAME)
values (1003, '石景山');
insert into DISTRICT (ID, NAME)
values (1006, '朝阳');
insert into DISTRICT (ID, NAME)
values (1000, '丰台');
insert into DISTRICT (ID, NAME)
values (1004, '海淀');

#2、插入街道street
insert into STREET (ID, NAME, DISTRICT_ID)
values (1000, '知春路', 1004);
insert into STREET (ID, NAME, DISTRICT_ID)
values (1001, '中关村大街', 1004);
insert into STREET (ID, NAME, DISTRICT_ID)
values (1002, '学院路', 1004);
insert into STREET (ID, NAME, DISTRICT_ID)
values (1003, '朝阳路', 1006);

#3、插入房屋类型type
insert into TYPE (ID, NAME)
values (1000, '一室一厅');
insert into TYPE (ID, NAME)
values (1001, '一室两厅');
insert into TYPE (ID, NAME)
values (1002, '两室一厅');
insert into TYPE (ID, NAME)
values (1003, '两室两厅');
insert into TYPE (ID, NAME)
values (1004, '三室一厅');
insert into TYPE (ID, NAME)
values (1005, '三室两厅');
insert into TYPE (ID, NAME)
values (1006, '四室一厅');
insert into TYPE (ID, NAME)
values (1007, '四室两厅');
insert into TYPE (ID, NAME)
values (1008, '四十三厅');

#4、插入用户user
insert into USER (ID, NAME,PASSWORD)
values (null, 'test1','123');

insert into USER (ID, NAME,PASSWORD)
values (null, 'test2','123');

#4、插入房屋house
insert into house(id,title,price) values(null,'中关村两居',5000);
insert into house(id,title,price,street_id) values(null,'知春路一居',4000,1000);
