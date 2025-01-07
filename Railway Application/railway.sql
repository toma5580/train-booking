CREATE DATABASE railway;
USE railway;
CREATE TABLE faculty(
	name varchar(20),
		user varchar(20),
			sub varchar(20),
				pass varchar(20) );
INSERT INTO faculty values( 
	"admin",
		"admin",
			"admin",
				"admin" );
CREATE TABLE students(
	name varchar(20),
    prt varchar(20),
    gender varchar(20),
    class varchar(20),
    dob varchar(20),
    section char, 
    teach varchar(20),
    roll varchar(20),
    pass varchar(20),
	marks varchar(4) );
