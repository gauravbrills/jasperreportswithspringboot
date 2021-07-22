CREATE TABLE m_product_master
(
	product_id int  NOT NULL PRIMARY KEY,
	product_name varchar(255),
);


CREATE TABLE m_hotel
(
	product_id int  NOT NULL PRIMARY KEY,
	description varchar(255),
	address varchar(255),
	latitude double,
	longitude double,
	star_Rating varchar(255),
);