create schema db;
create table Teacher(
Id int Auto_increment,
primary key (Id),
firstName varchar(100) not null,
lastName varchar(100) not null,
age int not null);
SELECT * FROM Teacher;
INSERT INTO Teacher (firstName, lastName, age)
VALUES ( 'John', 'Doe', 36);
INSERT INTO Teacher (firstName, lastName, age)
VALUES ('Jane', 'Doe', 32);
INSERT INTO Teacher (Id,firstName, lastName, age)
VALUES (900, 'Mary', 'Boo', 67);
INSERT INTO Teacher (ID, firstName, lastName, age)
VALUES (901,'Steve', 'Wallace', 54);
UPDATE Teacher
SET lastName = 'Parker'
WHERE Id = 900;
UPDATE Teacher
SET firstName ='Steven'
WHERE Id = 901;
ALTER TABLE Teacher
DROP COLUMN age;






